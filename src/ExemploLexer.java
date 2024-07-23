import org.antlr.v4.runtime.*;

import java.io.IOException;

public class ExemploLexer{
    public static void main(String[] args){
        String filename = "C:\\Users\\rhuan\\OneDrive\\Área de Trabalho\\UFLA\\UFLA 2024.1\\Compiladores\\Uaiscript\\uaiscript\\src\\codigo.txt";
        try{
            CharStream input = CharStreams.fromFileName(filename);
            UaiScriptLexer lexer = new UaiScriptLexer(input);
            Token token;
            while(!lexer._hitEOF){
                token = lexer.nextToken();
                System.out.println("Token: " + token.toString());
                System.out.println("   Lexema: " + token.getText());
                System.out.println("   Classe: " + lexer.getVocabulary().getDisplayName(token.getType()));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}