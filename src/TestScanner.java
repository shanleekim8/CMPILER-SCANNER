import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.DecisionState;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;

public class TestScanner {
    static Token token;
    static JSFMLexer lexer;

    public static void main(String[] args){

        try{
            FileInputStream fis = new FileInputStream(new File("./src/testInput.txt"));
            lexer = new JSFMLexer(CharStreams.fromStream(fis));
            lexer.removeErrorListeners();
            lexer.addErrorListener(new ThrowingErrorListener());

            TokenStream stream = new CommonTokenStream(lexer);
            JSFMParser parser = new JSFMParser(stream);
            parser.addParseListener(new JSFMListener(lexer));
            //parser.removeErrorListeners();
//            parser.addErrorListener(new ThrowingErrorListener());


            org.antlr.v4.runtime.tree.ParseTree pTree = parser.compilationUnit();

            TreeViewer viewer = new TreeViewer(Arrays.asList(
                    parser.getRuleNames()),pTree);

            viewer.open();

//            while (token.getType() != JSFMLexer.EOF){
//
//                token = lexer.nextToken();
//            }

        }catch(Exception e){
            System.out.println("exception caught " + e.getMessage());
            e.printStackTrace();
        }

    }



    /**
    private static String getTokenType(int tokenType) {
        switch (tokenType) {
            case JSFMLexer.CASE:
                return "KEYWORD";
            case JSFMLexer.IDENTIFIER:
                return "IDENTIFIER";
            case JSFMLexer.LPAREN:
                return "SEPARATOR";
            case JSFMLexer.DECIMAL_LITERAL:
                return "DECIMAL_LITERAL";
            case JSFMLexer.FLOAT_LITERAL:
                return "FLOAT_LITERAL";
            case JSFMLexer.BOOL_LITERAL:
                return "BOOL_LITERAL";
            case JSFMLexer.CHAR_LITERAL:
                return "CHAR_LITERAL";
            case JSFMLexer.STRING_LITERAL:
                return "STRING_LITERAL";
            case JSFMLexer.NULL_LITERAL:
                return "NULL_LITERAL";
            case JSFMLexer.WS:
                return "WS";
            case JSFMLexer.COMMENT:
                return "COMMENT";
            default:
                return "";
        }
    }
     **/

    //    static class ThrowingErrorListener extends ConsoleErrorListener {
    static class ThrowingErrorListener extends ConsoleErrorListener {

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                throws ParseCancellationException {

            String error = msg.split("'")[1];
            if (msg.contains("extraneous input")) {
                System.err.println("ERROR - LINE " + line + ": extra character '" + error + "'  [  Try removing it  ]");
            } else if (msg.contains("mismatched input")) {
                IntervalSet set = e.getExpectedTokens();
                System.err.println("ERROR - LINE " + line + ": unexpected '" + error + "'  [  Try inserting/replacing with " +
                        set.toString(recognizer.getVocabulary()).split("\\{")[1].split(",")[0] + "  ]");
            } else if (msg.contains("missing")) {
                if(error.equals(";")){
                    if(msg.split("'")[3].length() > 1 && msg.split("'")[3].charAt(0) == msg.split("'")[3].charAt(1)){
                        System.err.println("ERROR - LINE " + line + ": duplicate '" + msg.split("'")[3].charAt(0)
                                + "'  [  Consider removing one  ]");
                    }else{
                        System.err.println("ERROR - LINE " + (line) + ": missing '" + error + "'  [  Try inserting it before '" + msg.split("'")[3] + "'  ]");
                        //System.err.println(msg);
                    }
                }else{
                    System.err.println("ERROR - LINE " + line + ": missing '" + error + "'  [  Try inserting it after '" + msg.split("'")[3] + "'  ]");
                }
            } else if (msg.contains("no viable alternative")) {
                System.err.println("ERROR - LINE " + line + ": does not match any syntax '" + error + "'");
            } else if (msg.contains("token recognition error")){
                System.err.println("ERROR - LINE " + line + ": unknown token type of '" + error + "'");
            }else
                System.err.println(msg);

            //          throw new ParseCancellationException("Error in line " + line + ": " + msg);
//          throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
//          return;
        }

    }
}
