import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.gui.TreeViewer;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

public class TestScanner {

    public static void main(String[] args){

        try{
            FileInputStream fis = new FileInputStream(new File("./src/testInput.txt"));
            JSFMLexer lexer = new JSFMLexer(CharStreams.fromStream(fis));
            lexer.removeErrorListeners();
            lexer.addErrorListener(new ThrowingErrorListener());

            TokenStream stream = new CommonTokenStream(lexer);
            JSFMParser parser = new JSFMParser(stream);
            parser.removeErrorListeners();
            parser.addErrorListener(new ThrowingErrorListener());

            org.antlr.v4.runtime.tree.ParseTree pTree = parser.compilationUnit();

            TreeViewer viewer = new TreeViewer(Arrays.asList(
                    parser.getRuleNames()),pTree);

            viewer.open();
            Token token = lexer.nextToken();

            while (token.getType() != JSFMLexer.EOF){
                if(token.getType() != JSFMLexer.WS){
                    //System.out.println(token.getText() + "\t\t" + getTokenType(token.getType()));
                }

                token = lexer.nextToken();
            }

        }catch(Exception e){
            System.out.println("UNKNOWN TOKEN CLASS " + e.getMessage().split("recognition error at: ")[1]);
        }

    }

//    private static String getTokenType(int tokenType) {
//        switch (tokenType) {
//            case JSFMLexer.KEYWORD:
//                return "KEYWORD";
//            case JSFMLexer.IDENTIFIER:
//                return "IDENTIFIER";
//            case JSFMLexer.SEPARATOR:
//                return "SEPARATOR";
//            case JSFMLexer.OPERATOR:
//                return "OPERATOR";
//            case JSFMLexer.DECIMAL_LITERAL:
//                return "DECIMAL_LITERAL";
//            case JSFMLexer.FLOAT_LITERAL:
//                return "FLOAT_LITERAL";
//            case JSFMLexer.BOOL_LITERAL:
//                return "BOOL_LITERAL";
//            case JSFMLexer.CHAR_LITERAL:
//                return "CHAR_LITERAL";
//            case JSFMLexer.STRING_LITERAL:
//                return "STRING_LITERAL";
//            case JSFMLexer.NULL_LITERAL:
//                return "NULL_LITERAL";
//            case JSFMLexer.WS:
//                return "WS";
//            case JSFMLexer.COMMENT:
//                return "COMMENT";
//            default:
//                return "";
//        }
//    }

//    static class ThrowingErrorListener extends ConsoleErrorListener {
      static class ThrowingErrorListener extends ConsoleErrorListener {

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                throws ParseCancellationException {
            System.err.println("You got yeeted in line " + line + ": unexpected " + offendingSymbol);
//          throw new ParseCancellationException("Error in line " + line + ": " + msg);
//          throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
//          return;
        }

    }
}
