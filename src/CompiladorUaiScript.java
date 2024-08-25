import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class CompiladorUaiScript{
    public static void main(String[] args){
        String filename = "C:\\Users\\rhuan\\OneDrive\\Área de Trabalho\\UFLA\\UFLA 2024.1\\Compiladores\\Uaiscript\\uaiscript\\src\\codigo_erro.txt";
        try{
            CharStream input = CharStreams.fromFileName(filename);
            UaiScriptLexer lexer = new UaiScriptLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            UaiScriptParser parser = new UaiScriptParser(tokens);


            UaiScriptParser.InicioContext arvore = parser.inicio();

            System.out.println(arvore.toStringTree());
            ParseTreeWalker walker = new ParseTreeWalker();
            Listener listener = new Listener();
            walker.walk(listener, arvore);  // Executar a análise semântica

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
