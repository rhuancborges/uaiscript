import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.*;

public class Listener extends UaiScriptBaseListener {
    private Stack<Map<String, String>> escopos = new Stack<>(); // Pilha para armazenar escopos
    // Variável para armazenar o tipo da função atual (para checagem de retorno)
    private String currentFunctionType = null;

    // Inicializar o escopo global
    @Override
    public void enterInicio(UaiScriptParser.InicioContext ctx) {
        escopos.push(new HashMap<>());  // Escopo global
    }

    // Adiciona um novo escopo ao entrar em uma função e seta o tipo da função atual
    @Override
    public void enterFuncoes(UaiScriptParser.FuncoesContext ctx) {
        if(ctx.decl_func().TIPO() != null){ // Na regra decl_func, em (TIPO|VOID), escolheu-se TIPO
            currentFunctionType = ctx.decl_func().TIPO().getText();
        } else { // Na regra decl_func, em (TIPO|VOID), escolheu-se VOID
            currentFunctionType = "nadanao";
        }
        escopos.push(new HashMap<>()); // Adiciona escopo
    }

    // Remove o escopo ao sair de uma função e faz checagem de retorno
    @Override
    public void exitFuncoes(UaiScriptParser.FuncoesContext ctx) {
        String nomeFunc = ctx.decl_func().ID().getText(); // nomeFunc armazena o nome da função
        if(currentFunctionType == "nadanao" && ctx.RETORNO() != null){ // Se o tipo da função é "nadanao" (VOID) e dentro dela tem o token "vorta" (RETORNO)
            System.err.println("A função '"+ nomeFunc + "' não deveria ter retorno");
        }
        if(getExpressionType(ctx.operacao()) != currentFunctionType){ // Se o tipo da operação retornada for diferente do tipo da função
            System.err.println("A função '"+ nomeFunc+ "' não retorna um valor do tipo " + currentFunctionType);
        }
        escopos.pop(); // Remove o escopo
    }

    // Adiciona novo escopo ao entrar num laço e faz checagem de variáveis dentro da expressão de controle
    @Override
    public void enterLaco(UaiScriptParser.LacoContext ctx){
        List<TerminalNode> lista = ctx.ID(); // Pega a lista de IDs dentro da expressão de controle, ou seja, (atrib DELIM [[ID]] COMP operando DELIM [[ID]] ('++'|'--'))
        //Se os IDs na 2ª e 3ª parte da expressão de controle forem diferentes do ID declarado na 1ª parte, volta o erro
        if(!ctx.atrib().decl_var().ID().getText().equals(lista.get(0).getText()) || !ctx.atrib().decl_var().ID().getText().equals(lista.get(1).getText())){
            System.err.println("Variável não declarada no controle do laço");
        }
        escopos.push(new HashMap<>()); // Adiciona escopo
    }

    // Remove o escopo ao sair de um laço
    @Override
    public void exitLaco(UaiScriptParser.LacoContext ctx){
        escopos.pop();
    }


    @Override
    public void enterCondicao(UaiScriptParser.CondicaoContext ctx){
        escopos.push(new HashMap<>());
    }

    @Override
    public void exitCondicao(UaiScriptParser.CondicaoContext ctx){
        escopos.pop();
    }

    @Override
    public void enterCondicaoElse(UaiScriptParser.CondicaoElseContext ctx){
        escopos.push(new HashMap<>());
    }

    @Override
    public void exitCondicaoElse(UaiScriptParser.CondicaoElseContext ctx){
        escopos.pop();
    }

    // Checar uso de variáveis
    @Override
    public void enterOperando(UaiScriptParser.OperandoContext ctx) {
        if (ctx.ID() != null) {
            String varName = ctx.ID().getText();

            if (!isVariableDeclared(varName)) {
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
                System.err.println("Erro semântico: Variável '" + varName + "' não foi declarada no escopo atual.");
                return;
            }
        } else if (ctx.decl_var() != null) {
            // Se a atribuição é do tipo decl_var = ...
            varName = ctx.decl_var().ID().getText();
            varType = ctx.decl_var().TIPO().getText();

            // Adiciona a variável ao escopo atual
            Map<String, String> currentScope = escopos.peek();
            if (currentScope.containsKey(varName)) {
                System.err.println("Erro semântico: Variável '" + varName + "' já foi declarada no escopo atual.");
            }
            currentScope.put(varName, varType);
        }
        // Se há uma expressão associada à atribuição, checar o tipo
        if (ctx.operacao() != null) {
            String expressionType = getExpressionType(ctx.operacao());

            if (!varType.equals(expressionType)) {
                System.err.println("Erro semântico: Atribuição incompatível de tipos para a variável '" + varName + "'.");
            }
        }
    }

    // Função auxiliar para checar se uma variável foi declarada em algum escopo
    private boolean isVariableDeclared(String varName) {
        Map<String, String> escopo = escopos.peek();
        if (escopo.containsKey(varName) || escopos.elementAt(0).containsKey(varName)) {
            return true;
        }
        return false;
    }

    // Função auxiliar para obter o tipo de uma variável
    private String getVariableType(String varName) {
        Map<String, String> escopo = escopos.peek();
        if (escopo.containsKey(varName) || escopos.elementAt(0).containsKey(varName)) {
            return escopo.get(varName);
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
}
