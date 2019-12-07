import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.DecisionState;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.tree.ParseTree;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;

public class TestScanner {
    static Token token;
    static JSFMLexer lexer;
    static JFrame mainFrame = new JFrame("JSFM Interpreter");
    static JPanel mainPanel = new JPanel(new BorderLayout());
    static JPanel inputPanel = new JPanel();
    static JPanel outputPanel = new JPanel();
    static JTextArea inputTextArea =  new JTextArea(15, 83);
    static JTextArea outputTextArea =  new JTextArea(8, 70);
    static JScrollPane inputScroll = new JScrollPane(inputTextArea);
    static JScrollPane outputScroll = new JScrollPane(outputTextArea);
    static TreeViewer viewer;

    public void initializeGUI(TestScanner t){

        //GUI Initialization

        inputTextArea.setBackground(Color.BLACK);
        inputTextArea.setForeground(Color.WHITE);
        inputTextArea.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
        inputTextArea.append("main{\n\n}");
        inputTextArea.setCaretColor(Color.WHITE);
        inputTextArea.setCaretPosition(6);
        inputScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        outputTextArea.setBackground(Color.BLACK);
        outputTextArea.setForeground(Color.WHITE);
        outputTextArea.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
        outputTextArea.setEditable(false);
        outputScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);


        JButton runButton = new JButton("Run");
        JButton parseTreeButton = new JButton("Show Parse Tree");
        runButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
//                    FileInputStream fis = new FileInputStream(new File("./src/testInput.txt"));
                    lexer = new JSFMLexer(CharStreams.fromString(inputTextArea.getText()));
                   // lexer.removeErrorListeners();
                   // lexer.addErrorListener(new ThrowingErrorListener());

                    TokenStream stream = new CommonTokenStream(lexer);
                    JSFMParser parser = new JSFMParser(stream);
                    //parser.removeParseListeners();
                  //  parser.addParseListener(new JSFMListener(lexer));
                    JSFMVisitor visitor = new JSFMVisitor();

                    org.antlr.v4.runtime.tree.ParseTree pTree = parser.compilationUnit();

                    visitor.visit(pTree);

                    parseTreeButton.setVisible(true);
                    viewer = new TreeViewer(Arrays.asList(
                            parser.getRuleNames()),pTree);


                }catch(Exception ex){
                    System.out.println("exception caught " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        });

        parseTreeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                viewer.open();
            }
        });

        inputPanel.add(inputScroll);
        inputPanel.add(runButton, BorderLayout.SOUTH);
        inputPanel.add(parseTreeButton, BorderLayout.SOUTH);
        parseTreeButton.setVisible(false);
        outputPanel.add(outputScroll);

        mainFrame.setSize(1280, 720);
        inputPanel.setPreferredSize(new Dimension(1280, 480));
        outputPanel.setPreferredSize(new Dimension(1280, 240));
        mainPanel.add(inputPanel, BorderLayout.CENTER);
        mainPanel.add(outputPanel, BorderLayout.SOUTH);
//        mainPanel.add(inputTextArea, BorderLayout.CENTER);
//        mainPanel.add(outputTextArea, BorderLayout.SOUTH);
        mainFrame.add(mainPanel);

        mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args){
        TestScanner t = new TestScanner();
        t.initializeGUI(t);
//        try{
//            FileInputStream fis = new FileInputStream(new File("./src/testInput.txt"));
//            lexer = new JSFMLexer(CharStreams.fromStream(fis));
//            lexer.removeErrorListeners();
//            lexer.addErrorListener(new ThrowingErrorListener());
//
//            TokenStream stream = new CommonTokenStream(lexer);
//            JSFMParser parser = new JSFMParser(stream);
//            parser.addParseListener(new JSFMListener(lexer));
//            //parser.removeErrorListeners();
////            parser.addErrorListener(new ThrowingErrorListener());
//
//
//            org.antlr.v4.runtime.tree.ParseTree pTree = parser.compilationUnit();
//
//            TreeViewer viewer = new TreeViewer(Arrays.asList(
//                    parser.getRuleNames()),pTree);
//
//            viewer.open();
//
////            while (token.getType() != JSFMLexer.EOF){
////
////                token = lexer.nextToken();
////            }
//
//        }catch(Exception e){
//            System.out.println("exception caught " + e.getMessage());
//            e.printStackTrace();
//        }

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
