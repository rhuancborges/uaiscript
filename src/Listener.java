import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class Listener extends UaiScriptBaseListener {
    private Stack<Map<String, String>> escopos = new Stack<>(); // Pilha para armazenar escopos

    // Variável para armazenar o tipo da função atual (para checagem de retorno)
    private String tipoFuncaoAtual = null;

    // Inicializar o escopo global
    @Override
    public void enterInicio(UaiScriptParser.InicioContext ctx) {
        escopos.push(new HashMap<>());  // Escopo global
    }

    // Seta o tipo da função atual
    @Override
    public void enterFuncoes(UaiScriptParser.FuncoesContext ctx) {
        if(ctx.decl_func().TIPO() != null){ // Na regra decl_func, em (TIPO|VOID), escolheu-se TIPO
            tipoFuncaoAtual = ctx.decl_func().TIPO().getText();
            Map<String,String> escopoAtual = escopos.peek();
            escopoAtual.put(ctx.decl_func().ID().getText(), ctx.decl_func().TIPO().getText());
        } else { // Na regra decl_func, em (TIPO|VOID), escolheu-se VOID
            tipoFuncaoAtual = "nadanao";
        }
    }

    // Faz checagem de retorno
    @Override
    public void exitFuncoes(UaiScriptParser.FuncoesContext ctx) {
        String nomeFunc = ctx.decl_func().ID().getText(); // nomeFunc armazena o nome da função
        if(tipoFuncaoAtual.equals("nadanao") && ctx.RETORNO() != null){ // Se o tipo da função é "nadanao" (VOID) e
                                                                    // dentro dela tem o token "vorta" (RETORNO)
            System.err.println("A função '"+ nomeFunc + "' não deveria ter retorno");
        }
        if(!tipoFuncaoAtual.equals("nadanao") && ctx.RETORNO() == null){ // Se o tipo da função não é "nadanao" (VOID) e
                                                                        // dentro dela não há o token "vorta"
            System.err.println("A função '"+ nomeFunc + "' deveria ter retorno");
            return;
        }
        if(!tipoFuncaoAtual.equals("nadanao") && !getExpressionType(ctx.operacao()).equals(tipoFuncaoAtual)){ // Se o tipo da operação retornada
                                                                                                            // for diferente do tipo da função
            System.err.println("A função '"+ nomeFunc+ "' não retorna um valor do tipo " + tipoFuncaoAtual);
        }

    }

    // Faz checagem de variáveis dentro da expressão de controle
    @Override
    public void enterLaco(UaiScriptParser.LacoContext ctx){
        List<TerminalNode> lista = ctx.ID(); // Pega a lista de IDs dentro da expressão de controle, ou seja,
                                            // (atrib DELIM [[ID]] COMP operando DELIM [[ID]] ('++'|'--'))
        //Se os IDs na 2ª e 3ª parte da expressão de controle forem diferentes do ID declarado na 1ª parte, volta o erro
        if(!ctx.atrib().decl_var().ID().getText().equals(lista.get(0).getText()) ||
                !ctx.atrib().decl_var().ID().getText().equals(lista.get(1).getText())){
            System.err.println("Variável não declarada no controle do laço");
        }
    }

    // Checar uso de variáveis
    @Override
    public void enterOperando(UaiScriptParser.OperandoContext ctx) {
        if (ctx.ID() != null) {
            String varName = ctx.ID().getText();

            if (!declarada(varName)) {
                System.err.println("Erro semântico: Variável '" + varName + "' não foi declarada.");
            }
        }
    }

    // Checar atribuições e operações
    @Override
    public void enterAtrib(UaiScriptParser.AtribContext ctx) {
        String varName = null;
        String varType = null;

        // Se a atribuição é do tipo ID = ...
        if (ctx.ID() != null) {
            varName = ctx.ID().getText();
            varType = getVariableType(varName);

            if (varType == null) {
                System.err.println("Erro semântico: Variável '" + varName + "' não foi declarada.");
                return;
            }
        } else if (ctx.decl_var() != null) {
            // Se a atribuição é do tipo decl_var = ...
            varName = ctx.decl_var().ID().getText();
            varType = ctx.decl_var().TIPO().getText();

            // Adiciona a variável (se não declarada) ao escopo atual
            Map<String, String> escopoAtual = escopos.peek();
            if (declarada(varName)){
                System.err.println("Erro semântico: Variável '" + varName + "' já foi declarada");
            }
            escopoAtual.put(varName, varType);
        }
        // Se há uma expressão associada à atribuição, checar o tipo
        if (ctx.operacao() != null) {
            String expressionType = getExpressionType(ctx.operacao());

            if (!varType.equals(expressionType)) {
                System.err.println("Erro semântico: Atribuição incompatível de tipos para a variável '" + varName + "'.");
            }
        }
        if (ctx.funcao() != null){
            String variableType = getVariableType(ctx.funcao().ID().getText());

            if (!varType.equals(variableType)) {
                System.err.println("Erro semântico: Atribuição incompatível de tipos para a variável '" + varName + "'.");
            }
        }
    }

    // Função auxiliar para checar se uma variável foi declarada em algum escopo válido
    private boolean declarada(String varName) {
        Map<String, String> escopo = escopos.peek();
        int indice = escopos.size() - 1;
        if (escopo.containsKey(varName) || (indice>=1 && escopos.elementAt(indice - 1).containsKey(varName))
                || escopos.elementAt(0).containsKey(varName)) {
            return true;
        }
        return false;
    }

    // Função auxiliar para obter o tipo de uma variável
    private String getVariableType(String varName) {
        Map<String, String> escopo = escopos.peek();
        int indice = escopos.size() - 1;
        if (escopo.containsKey(varName)) {
            return escopo.get(varName);
        } else if (indice>=1 && escopos.elementAt(indice - 1).containsKey(varName)) {
            return escopos.elementAt(indice - 1).get(varName);
        } else if (escopos.elementAt(0).containsKey(varName)) {
            return escopos.elementAt(0).get(varName);
        }

        return null;
    }

    // Função para determinar o tipo de uma expressão
    private String getExpressionType(UaiScriptParser.OperacaoContext ctx) {
        if (ctx == null) return null;

        String leftType = getOperandType(ctx.operando());
        if (ctx.operando_cauda() == null) {
            return leftType;
        }

        String rightType = getOperandType(ctx.operando_cauda().operando());
        if (leftType.equals(rightType)) {
            return leftType;
        } else {
            System.err.println("Erro semântico: Operação entre tipos incompatíveis.");
        }
        return null;
    }

    // Função para determinar o tipo de um operando
    private String getOperandType(UaiScriptParser.OperandoContext ctx) {
        if (ctx.NUM() != null) {
            String numText = ctx.NUM().getText();
            if (numText.contains(".")) {
                return "froti";
            } else {
                return "tero";
            }
        } else if (ctx.ID() != null) {
            return getVariableType(ctx.ID().getText());
        }
        return null;
    }

    @Override
    public void visitTerminal(TerminalNode x){
        if(x.getSymbol().getType() == UaiScriptParser.FC){
            escopos.pop();
        } else if (x.getSymbol().getType() == UaiScriptParser.AC){
            escopos.push(new HashMap<>());
        }
    }
}
