import java.io.File;
import java.io.FileInputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class TestScanner {

    public static void main(String[] args){

        try{
            FileInputStream fis = new FileInputStream(new File("./src/testInput.txt"));
            Scanner lexer = new Scanner(CharStreams.fromStream(fis));
            lexer.removeErrorListeners();

            Token token = lexer.nextToken();
            while (token.getType() != Scanner.EOF){
                if(token.getType() != Scanner.WS){
                    System.out.println(token.getText() + "\t\t" + getTokenType(token.getType()));
                }

                token = lexer.nextToken();

            }

        }catch(Exception e){
            System.out.println("UNKNOWN TOKEN CLASS " + e.getMessage().split("recognition error at: ")[1]);
        }

    }

    private static String getTokenType(int tokenType) {
        switch (tokenType) {
            case Scanner.KEYWORD:
                return "KEYWORD";
            case Scanner.IDENTIFIER:
                return "IDENTIFIER";
            case Scanner.SEPARATOR:
                return "SEPARATOR";
            case Scanner.OPERATOR:
                return "OPERATOR";
            case Scanner.DECIMAL_LITERAL:
                return "DECIMAL_LITERAL";
            case Scanner.FLOAT_LITERAL:
                return "FLOAT_LITERAL";
            case Scanner.BOOL_LITERAL:
                return "BOOL_LITERAL";
            case Scanner.CHAR_LITERAL:
                return "CHAR_LITERAL";
            case Scanner.STRING_LITERAL:
                return "STRING_LITERAL";
            case Scanner.NULL_LITERAL:
                return "NULL_LITERAL";
            default:
                return "";
        }
    }

    static class ThrowingErrorListener extends ConsoleErrorListener {

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                throws ParseCancellationException {

            return;
        }

    }
}
