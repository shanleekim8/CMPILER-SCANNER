// Generated from C:/Users/Shan/IdeaProjects/CMPILER-Scanner/src\JSFMParser.g4 by ANTLR 4.7.2

import com.udojava.evalex.Expression;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.Hashtable;
import java.util.Stack;

/**
 * This class provides an empty implementation of {@link JSFMParserListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class JSFMListener implements JSFMParserListener {
//    private TestScanner gui;
    static Hashtable<String, JSFMValues> symbolTable = new Hashtable<String, JSFMValues>();
    static Hashtable<String, JSFMFunction> functionTable = new Hashtable<String, JSFMFunction>();
    static Token token;
    static int tokenType;
    static JSFMLexer lexer;
    static JSFMLexer tempLexer;
    static String print = "";
    static String type = "";
    static boolean isFinal;
    static boolean pause = true;
    static JFrame inputFrame;
    static boolean ifStatement = false;
    static boolean elseStatement = false;
    static boolean ifResult = true;
    static boolean ifInUse = false;
    static boolean elseInUse = false;
    static int controlNum = 0;
    static JSFMIfElse ifElseTemp;
    static Stack<JSFMIfElse> ifElseStack = new Stack<JSFMIfElse>();


//    public static void main(String[] args){
//
//        symbolTable.put("yes", "eys");
//        System.out.println(symbolTable.get("yes"));
//    }

    public JSFMListener(JSFMLexer l){
        lexer = l;
//        gui = t;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCompilationUnit(JSFMParser.CompilationUnitContext ctx) {
        JSFMValues temp = new JSFMValues("keyword", true);

        symbolTable.clear();

        symbolTable.put("boolin", temp);
        symbolTable.put("cease", temp);
        symbolTable.put("option", temp);
        symbolTable.put("kachow", temp);
        symbolTable.put("fiber", temp);
        symbolTable.put("megaman", temp);
        symbolTable.put("basic", temp);
        symbolTable.put("perform", temp);
        symbolTable.put("otherwise", temp);
        symbolTable.put("ultimate", temp);
        symbolTable.put("coke", temp);
        symbolTable.put("repeat", temp);
        symbolTable.put("upon", temp);
        symbolTable.put("techies", temp);
        symbolTable.put("main", temp);
        symbolTable.put("respond", temp);
        symbolTable.put("thread", temp);
        symbolTable.put("choices", temp);
        symbolTable.put("faceless", temp);
        symbolTable.put("during", temp);
        symbolTable.put("outputf", temp);
        symbolTable.put("inputf", temp);
        symbolTable.put("true", temp);
        symbolTable.put("false", temp);
        symbolTable.put("null", temp);

        ifElseStack = new Stack<JSFMIfElse>();
        ifStatement = false;
        elseStatement = false;
        ifResult = true;
        ifInUse = false;
        elseInUse = false;

        TestScanner.outputTextArea.setText("");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCompilationUnit(JSFMParser.CompilationUnitContext ctx) {
        TestScanner.outputTextArea.append("\nProcess finished.\n");

        if(ifStatement){
            System.out.println("IF STATEMENT TRUE");
        }else{
            System.out.println("IF STATEMENT FALSE");
        }

        if(elseStatement){
            System.out.println("ELSE STATEMENT TRUE");
        }else{
            System.out.println("ELSE STATEMENT FALSE");
        }

        if(ifInUse){
            System.out.println("IF IN USE TRUE");
        }else{
            System.out.println("IF IN USE FALSE");
        }

        if(elseInUse){
            System.out.println("ELSE IN USE TRUE");
        }else{
            System.out.println("ELSE IN USE FALSE");
        }
//        Enumeration e = symbolTable.keys();
//        JSFMValues value;
//
//        while(e.hasMoreElements()){
//            Object el = e.nextElement();
//            System.out.println("Key : " + el);
//            value = symbolTable.get(el);
//            System.out.println("Type : " + value.getObjectType());
//            switch(value.getObjectType()){
//                case "techies":
//                    if(value.isArray()){
//                        System.out.println("Value : " + value.getArrayValues());
//                    }else{
//                        System.out.println("Value : " + value.getIntValue());
//                    }
//                    break;
//                case "coke":
//                    if(value.isArray()){
//                        System.out.println("Value : " + value.getArrayValues());
//                    }else{
//                        System.out.println("Value : " + value.getFloatValue());
//                    }
//                    break;
//                case "thread":
//                    if(value.isArray()){
//                        System.out.println("Value : " + value.getArrayValues());
//                    }else{
//                        System.out.println("Value : " + value.getStringValue());
//                    }
//                    break;
//                case "kachow":
//                    if(value.isArray()){
//                        System.out.println("Value : " + value.getArrayValues());
//                    }else{
//                        System.out.println("Value : " + value.getCharValue());
//                    }
//                    break;
//            }
//        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMainStatement(JSFMParser.MainStatementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMainStatement(JSFMParser.MainStatementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVariableModifier(JSFMParser.VariableModifierContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVariableModifier(JSFMParser.VariableModifierContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterTypeParameters(JSFMParser.TypeParametersContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitTypeParameters(JSFMParser.TypeParametersContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterTypeParameter(JSFMParser.TypeParameterContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitTypeParameter(JSFMParser.TypeParameterContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMethodDeclaration(JSFMParser.MethodDeclarationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMethodDeclaration(JSFMParser.MethodDeclarationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMethodBody(JSFMParser.MethodBodyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMethodBody(JSFMParser.MethodBodyContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterGenericMethodDeclaration(JSFMParser.GenericMethodDeclarationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitGenericMethodDeclaration(JSFMParser.GenericMethodDeclarationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFieldDeclaration(JSFMParser.FieldDeclarationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFieldDeclaration(JSFMParser.FieldDeclarationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMemberDeclaration(JSFMParser.MemberDeclarationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMemberDeclaration(JSFMParser.MemberDeclarationContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterTypeTypeOrVoid(JSFMParser.TypeTypeOrVoidContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitTypeTypeOrVoid(JSFMParser.TypeTypeOrVoidContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterTypeType(JSFMParser.TypeTypeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitTypeType(JSFMParser.TypeTypeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFormalParameters(JSFMParser.FormalParametersContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFormalParameters(JSFMParser.FormalParametersContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFormalParameterList(JSFMParser.FormalParameterListContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFormalParameterList(JSFMParser.FormalParameterListContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFormalParameter(JSFMParser.FormalParameterContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFormalParameter(JSFMParser.FormalParameterContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLastFormalParameter(JSFMParser.LastFormalParameterContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLastFormalParameter(JSFMParser.LastFormalParameterContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterQualifiedName(JSFMParser.QualifiedNameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitQualifiedName(JSFMParser.QualifiedNameContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLiteral(JSFMParser.LiteralContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLiteral(JSFMParser.LiteralContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterIntegerLiteral(JSFMParser.IntegerLiteralContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitIntegerLiteral(JSFMParser.IntegerLiteralContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFloatLiteral(JSFMParser.FloatLiteralContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFloatLiteral(JSFMParser.FloatLiteralContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterQualifiedNameList(JSFMParser.QualifiedNameListContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitQualifiedNameList(JSFMParser.QualifiedNameListContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVariableDeclarators(JSFMParser.VariableDeclaratorsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVariableDeclarators(JSFMParser.VariableDeclaratorsContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVariableDeclarator(JSFMParser.VariableDeclaratorContext ctx) {

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVariableDeclarator(JSFMParser.VariableDeclaratorContext ctx) {
        String vName = ctx.variableDeclaratorId().IDENTIFIER().getText();
        String tempVar = ctx.parent.parent.getText().replace(ctx.parent.getText(), "");

        if(tempVar.contains("ultimate")){
            isFinal = true;
            tempVar = tempVar.replace("ultimate", "");
        }else{
            isFinal = false;
        }

        switch (tempVar){
            case "boolin":
                type = "boolin";
                break;
            case "kachow":
                type = "kachow";
                break;
            case "coke":
                type = "coke";
                break;
            case "techies":
                type = "techies";
                break;
            case "thread":
                type = "thread";
                break;
            default: System.out.println("ERROR - Invalid type. Expecting one of the following: techies, coke, thread, kachow, boolin. (Instead of " + token.getText() + ")");
        }

        if(!type.equals("")){
            boolean isArray = false;

            if(ctx.variableDeclaratorId().LBRACK().size() > 0 && ctx.variableDeclaratorId().RBRACK().size() > 0){ // It's an array
                isArray = true;
            }

            if(!isArray){
                if(ctx.ASSIGN() != null){
                    String temp = ctx.variableInitializer().getText();
                    if(type.equals("techies") || type.equals("coke")){
                        tempLexer = new JSFMLexer(CharStreams.fromString(temp));
                        float value = parse();

                        if(!symbolTable.containsKey(vName)){
                            if(type.equals("techies")){
                                symbolTable.put(vName, new JSFMValues(type, (int) value, isFinal));
                                //   System.out.println(symbolTable.get(vName).getIntValue());
                            }else if(type.equals("coke")){
                                symbolTable.put(vName, new JSFMValues(type, value, isFinal));
                                //   System.out.println(symbolTable.get(vName).getFloatValue());
                            }
                        }else{
                            System.out.println("ERROR - Variable '" + vName + "' already exists. Recheck your variable delcarations or try removing the type declaration.");
                        }
                    }else if(type.equals("thread")){
                        tempLexer = new JSFMLexer(CharStreams.fromString(temp));
                        String value = parseStr();

                        if(!symbolTable.containsKey(vName)){
                            symbolTable.put(vName, new JSFMValues(type, value, isFinal));
                        }else{
                            System.out.println("ERROR - Variable '" + vName + "' already exists. Recheck your variable delcarations or try removing the type declaration.");
                        }
                    }else if(type.equals("kachow")){
                        tempLexer = new JSFMLexer(CharStreams.fromString(temp));
                        char ch = parseChar();

                        if(!symbolTable.containsKey(vName)){
                            symbolTable.put(vName, new JSFMValues(type, ch, isFinal));
                        }else{
                            System.out.println("ERROR - Variable '" + vName + "' already exists. Recheck your variable delcarations or try removing the type declaration.");
                        }
                    }else if(type.equals("boolin")){
                        tempLexer = new JSFMLexer(CharStreams.fromString(temp));
                        boolean boo = parseBool();

                        if(!symbolTable.containsKey(vName)){
                            symbolTable.put(vName, new JSFMValues(type, boo, isFinal));
                        }else{
                            System.out.println("ERROR - Variable '" + vName + "' already exists. Recheck your variable delcarations or try removing the type declaration.");
                        }
                    }
                }else{
                    if(!symbolTable.containsKey(vName)){
                        symbolTable.put(vName, new JSFMValues(type, isFinal));
                    }else{
                        System.out.println("ERROR - Variable '" + vName + "' already exists. Recheck your variable delcarations or try removing the type declaration.");
                    }
                }

            }else if(isArray){
                String values = "{";
                if(type.equals("techies") || type.equals("coke") || type.equals("thread") || type.equals("kachow") || type.equals("boolin")){
                    if(ctx.variableDeclaratorId().LBRACK().size() == ctx.variableDeclaratorId().RBRACK().size()){ //equal brackets
                        if(ctx.variableInitializer().arrayInitializer()!= null){
                            String temp = ctx.variableInitializer().getText();
                            int arrayAmt = ctx.variableInitializer().arrayInitializer().variableInitializer().size();
                            int arraySize;
                            if(ctx.variableDeclaratorId().LBRACK().size() == 1){ //1D array
                                if(arrayAmt-1 == ctx.variableInitializer().arrayInitializer().COMMA().size()){ //Check if amt of items-1 is equal to amt of commas
                                    temp = ctx.variableInitializer().arrayInitializer().getText()
                                            .substring(1, ctx.variableInitializer().arrayInitializer().getText().length()-1);
                                    for(int i=0; i<arrayAmt; i++){
                                        System.out.println(temp.split(",")[i]);
                                        tempLexer = new JSFMLexer(CharStreams.fromString(temp.split(",")[i]));
                                        if(type.equals("techies")){
                                            values = values + (int) parse() + ",";
                                        }else if(type.equals("coke")){
                                            values = values + parse() + ",";
                                        }else if(type.equals("thread")){
                                            values = values + parseStr() + ",";
                                        }else if(type.equals("kachow")){
                                            values = values + parseChar() + ",";
                                        }else if(type.equals("boolin")){
                                            values = values + parseBool() + ",";
                                        }
                                    }

                                    values = values.substring(0,values.length()-1) + "}";
                                }


                            }else if(ctx.variableDeclaratorId().LBRACK().size() == 2){ //2D array
                                boolean is2D = true;
                                for(int i=0; i< arrayAmt; i++){
                                    if(ctx.variableInitializer().arrayInitializer().variableInitializer(i).arrayInitializer() == null){
                                        //not a 2D array
                                        is2D = false;
                                    }
                                }
                                if(is2D){
                                    for(int i=0; i<arrayAmt; i++){
                                        arraySize = ctx.variableInitializer().arrayInitializer().variableInitializer(i).arrayInitializer().variableInitializer().size();

                                        if(arraySize-1 == ctx.variableInitializer().arrayInitializer().variableInitializer(i).arrayInitializer().COMMA().size()){
                                            values = values + "{";
                                            temp = ctx.variableInitializer().arrayInitializer().variableInitializer(i).arrayInitializer().getText()
                                                    .substring(1, ctx.variableInitializer().arrayInitializer().variableInitializer(i)
                                                            .arrayInitializer().getText().length()-1);
                                            for(int j=0; j<arraySize; j++){
                                                // float value = parse();
                                                tempLexer = new JSFMLexer(CharStreams.fromString(temp.split(",")[j]));

                                                if(type.equals("techies")){
                                                    values = values + (int) parse() + ",";
                                                }else if(type.equals("coke")){
                                                    values = values + parse() + ",";
                                                }else if(type.equals("thread")){
                                                    values = values + parseStr() + ",";
                                                }else if(type.equals("kachow")){
                                                    values = values + parseChar() + ",";
                                                }else if(type.equals("boolin")){
                                                    values = values + parseBool() + ",";
                                                }
                                            }
                                            values = values.substring(0,values.length()-1) + "}";

                                        }
                                    }
                                    values = values + "}";
                                }else{
                                    TestScanner.outputTextArea.append("ERROR - Array dimension does not match initialization. Try removing a pair of []\n");
                                }
                            }else{
                                TestScanner.outputTextArea.append("3D Arrays are not yet supported.\n");
                            }
                        }else{
                            TestScanner.outputTextArea.append("ERROR - Missing pair of {}\n");
                        }


                    }else{
                        TestScanner.outputTextArea.append("ERROR - Uneven brackets. Consider removing a");
                        if(ctx.variableDeclaratorId().LBRACK().size() > ctx.variableDeclaratorId().RBRACK().size()){
                            TestScanner.outputTextArea.append("'['\n");
                        }else{
                            TestScanner.outputTextArea.append("']'\n");
                        }
                    }


                    if(!symbolTable.containsKey(vName)){
                        symbolTable.put(vName, new JSFMValues(type, true, values, isFinal));
                    }else{
                        TestScanner.outputTextArea.append("ERROR - Variable '" + vName + "' already exists. Recheck your variable delcarations or try removing the type declaration.\n");
                    }
                }
            }
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVariableDeclaratorId(JSFMParser.VariableDeclaratorIdContext ctx) {

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVariableDeclaratorId(JSFMParser.VariableDeclaratorIdContext ctx) {
        //System.out.println("EXIT VARIABLE DEC ID - " + ctx.IDENTIFIER().getText());
        //System.out.println("EXIT VARIABLE DEC ID - " + ctx.stop.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVariableInitializer(JSFMParser.VariableInitializerContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVariableInitializer(JSFMParser.VariableInitializerContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterArrayInitializer(JSFMParser.ArrayInitializerContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitArrayInitializer(JSFMParser.ArrayInitializerContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBlock(JSFMParser.BlockContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBlock(JSFMParser.BlockContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterBlockStatement(JSFMParser.BlockStatementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitBlockStatement(JSFMParser.BlockStatementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLocalVariableDeclaration(JSFMParser.LocalVariableDeclarationContext ctx) {
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLocalVariableDeclaration(JSFMParser.LocalVariableDeclarationContext ctx) {

        type = "";
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterReturnStatement(JSFMParser.ReturnStatementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitReturnStatement(JSFMParser.ReturnStatementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterReturnExpression(JSFMParser.ReturnExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitReturnExpression(JSFMParser.ReturnExpressionContext ctx) { }

    @Override
    public void enterBlockStmt(JSFMParser.BlockStmtContext ctx) {

    }

    @Override
    public void exitBlockStmt(JSFMParser.BlockStmtContext ctx) {

    }

    @Override
    public void enterIfElseStmt(JSFMParser.IfElseStmtContext ctx) {

    }

    @Override
    public void exitIfElseStmt(JSFMParser.IfElseStmtContext ctx) {

    }

    @Override
    public void enterForLoopStmt(JSFMParser.ForLoopStmtContext ctx) {

    }

    @Override
    public void exitForLoopStmt(JSFMParser.ForLoopStmtContext ctx) {

    }

    @Override
    public void enterWhileLoopStmt(JSFMParser.WhileLoopStmtContext ctx) {

    }

    @Override
    public void exitWhileLoopStmt(JSFMParser.WhileLoopStmtContext ctx) {

    }

    @Override
    public void enterDoWhileLoopStmt(JSFMParser.DoWhileLoopStmtContext ctx) {

    }

    @Override
    public void exitDoWhileLoopStmt(JSFMParser.DoWhileLoopStmtContext ctx) {

    }

    @Override
    public void enterSwitchStmt(JSFMParser.SwitchStmtContext ctx) {

    }

    @Override
    public void exitSwitchStmt(JSFMParser.SwitchStmtContext ctx) {

    }

    @Override
    public void enterBreakStmt(JSFMParser.BreakStmtContext ctx) {

    }

    @Override
    public void exitBreakStmt(JSFMParser.BreakStmtContext ctx) {

    }

    @Override
    public void enterExprStmt(JSFMParser.ExprStmtContext ctx) {

    }

    @Override
    public void exitExprStmt(JSFMParser.ExprStmtContext ctx) {

    }

    @Override
    public void enterIdentifierStmt(JSFMParser.IdentifierStmtContext ctx) {

    }

    @Override
    public void exitIdentifierStmt(JSFMParser.IdentifierStmtContext ctx) {

    }

    @Override
    public void enterOutputStmt(JSFMParser.OutputStmtContext ctx) {

    }

    @Override
    public void exitOutputStmt(JSFMParser.OutputStmtContext ctx) {

    }

    @Override
    public void enterInputStmt(JSFMParser.InputStmtContext ctx) {

    }

    @Override
    public void exitInputStmt(JSFMParser.InputStmtContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
//    @Override public void enterStatement(JSFMParser.StatementContext ctx) {
//
//        if((!ifInUse && !elseInUse) ||(ifInUse && ifResult) || (elseInUse && !ifResult)){
//                System.out.println("IM IN ENTER STMT- " + controlNum);
//            if(ctx.parent.getText().contains("upon(") && ctx.parent.getText().contains("otherwise")){
//                elseStatement = true;
//            }
//
//            if(ifStatement){ //if statement
//                ifStatement = false;
//                ifInUse = true;
//                ifElseTemp.setIfNum(controlNum);
//                ifElseStack.push(ifElseTemp);
//
////            ifNum = controlNum;
////            ifStack.push(controlNum);
//            }else if(elseStatement){
//                if(ifInUse && ifElseTemp.getIfNum() < controlNum){
//                    ifElseStack.push(ifElseTemp);
//                    ifElseTemp = new JSFMIfElse(ifResult);
//                }
//                elseStatement = false;
//                elseInUse = true;
//                //elseNum = controlNum;
//                ifElseTemp.setElseNum(controlNum);
//            }
//        }
//
//
//    }
//    /**
//     * {@inheritDoc}
//     *
//     * <p>The default implementation does nothing.</p>
//     */
//    @Override public void exitStatement(JSFMParser.StatementContext ctx) {
//        JSFMIfElse test;
//
//        if((!ifInUse && !elseInUse) ||(ifInUse && ifResult) || (elseInUse && !ifResult)){
//            if(ctx.expression() != null){
//                String vName = ctx.start.getText();
//                JSFMParser.ExpressionContext temp = ctx.expression().expression(1);
//                JSFMValues tempVal;
//                String operator = ctx.expression().bop.getText();
//                type = symbolTable.get(vName).getObjectType();
//
//                if(symbolTable.containsKey(vName)){
//                    tempVal = symbolTable.get(vName);
//                    if(!tempVal.isFinal() || (tempVal.isFinal() && tempVal.isEmpty())){
//                        tempLexer = new JSFMLexer(CharStreams.fromString(operator));
//                        token = tempLexer.nextToken();
//                        tokenType = token.getType();
//
//                        switch(tokenType){
//                            case JSFMLexer.ASSIGN:
//                                tempLexer = new JSFMLexer(CharStreams.fromString(temp.getText()));
//                                BigDecimal result = null;
//
//                                if(type.equals("techies")){
//                                    tempVal.setIntValue((int) parse());
//                                }else if(type.equals("coke")){
//                                    tempVal.setFloatValue(parse());
//                                }else if(type.equals("kachow")){
//                                    tempVal.setCharValue(parseChar());
//                                }else if(type.equals("thread")){
//                                    tempVal.setStringValue(parseStr());
//                                }else if(type.equals("boolin")){
//                                    tempVal.setBoolValue(parseBool());
//                                }
//                                tempVal.setNull(false);
//
//                                break;
//                            case JSFMLexer.ADD_ASSIGN:
//                                tempLexer = new JSFMLexer(CharStreams.fromString(temp.getText()));
//
//                                if(type.equals("techies")){
//                                    tempVal.setIntValue(tempVal.getIntValue() + (int) parse());
//                                }else if(type.equals("coke")){
//                                    tempVal.setFloatValue(tempVal.getFloatValue() + parse());
//                                }else if(type.equals("kachow")){
//                                    tempVal.setCharValue((char) (tempVal.getCharValue() + parseChar()));
//                                }else if(type.equals("thread")){
//                                    tempVal.setStringValue(tempVal.getStringValue() + parseStr());
//                                }else if(type.equals("boolin")){
//                                    TestScanner.outputTextArea.append("ERROR - Cannot use addition for a boolin variable.\n");
//                                }
//
//                                break;
//                            case JSFMLexer.SUB_ASSIGN:
//                                tempLexer = new JSFMLexer(CharStreams.fromString(temp.getText()));
//
//                                if(type.equals("techies")){
//                                    tempVal.setIntValue(tempVal.getIntValue() - (int) parse());
//                                    tempVal.setNull(false);
//                                }else if(type.equals("coke")){
//                                    tempVal.setFloatValue(tempVal.getFloatValue() - parse());
//                                    tempVal.setNull(false);
//                                }else if(type.equals("kachow")){
//                                    tempVal.setCharValue((char) (tempVal.getCharValue() - parseChar()));
//                                    tempVal.setNull(false);
//                                }else if(type.equals("thread")){
//                                    TestScanner.outputTextArea.append("ERROR - Cannot use subtraction for a thread variable.\n");
//                                }else if(type.equals("boolin")){
//                                    TestScanner.outputTextArea.append("ERROR - Cannot use subtraction for a boolin variable.\n");
//                                }
//
//                                break;
//                            case JSFMLexer.MUL_ASSIGN:
//                                tempLexer = new JSFMLexer(CharStreams.fromString(temp.getText()));
//
//                                if(type.equals("techies")){
//                                    tempVal.setIntValue(tempVal.getIntValue() * (int) parse());
//                                    tempVal.setNull(false);
//                                }else if(type.equals("coke")){
//                                    tempVal.setFloatValue(tempVal.getFloatValue() * parse());
//                                    tempVal.setNull(false);
//                                }else if(type.equals("kachow")){
//                                    tempVal.setCharValue((char) (tempVal.getCharValue() * parseChar()));
//                                    tempVal.setNull(false);
//                                }else if(type.equals("thread")){
//                                    TestScanner.outputTextArea.append("ERROR - Cannot use multiplication for a thread variable.\n");
//                                }else if(type.equals("boolin")){
//                                    TestScanner.outputTextArea.append("ERROR - Cannot use multiplication for a boolin variable.\n");
//                                }
//
//                                break;
//                            case JSFMLexer.DIV_ASSIGN:
//                                tempLexer = new JSFMLexer(CharStreams.fromString(temp.getText()));
//
//                                if(type.equals("techies")){
//                                    tempVal.setIntValue(tempVal.getIntValue() / (int) parse());
//                                    tempVal.setNull(false);
//                                }else if(type.equals("coke")){
//                                    tempVal.setFloatValue(tempVal.getFloatValue() / parse());
//                                    tempVal.setNull(false);
//                                }else if(type.equals("kachow")){
//                                    tempVal.setCharValue((char) (tempVal.getCharValue() / parseChar()));
//                                    tempVal.setNull(false);
//                                }else if(type.equals("thread")){
//                                    TestScanner.outputTextArea.append("ERROR - Cannot use division for a thread variable.\n");
//                                }else if(type.equals("boolin")){
//                                    TestScanner.outputTextArea.append("ERROR - Cannot use division for a boolin variable.\n");
//                                }
//
//                                break;
//                        }
//                        symbolTable.put(vName, tempVal);
//                    }else{
//                        TestScanner.outputTextArea.append("ERROR - " + vName + " is an ultimate variable. Its value cannot be changed.\n");
//                    }
//
//                }else{
//                    TestScanner.outputTextArea.append("ERROR - " + vName + " is not declared.\n");
//                }
//
//            }
//        }
//
//
//        if(ifInUse && ifElseTemp.getIfNum() == controlNum){ //end of if statement
//            if(!ifElseStack.empty()){
//                JSFMIfElse store = ifElseStack.pop();
//                if(!ifElseStack.empty()){
//                    ifElseTemp = ifElseStack.peek();
//                    ifResult = ifElseTemp.getResult();
//                    if(ifElseTemp.getIfNum() > 0){
//                        ifInUse = true;
//                        elseInUse = false;
//
//                    }else if(ifElseTemp.getElseNum() > 0){
//                        ifInUse = false;
//                        elseInUse = true;
//                    }
//                    ifResult = ifElseTemp.getResult();
//                }else{
//                    ifInUse = false;
//                }
//            }else{
//                ifInUse = false;
//            }
//
//        }
//
//        if(elseInUse && ifElseTemp.getElseNum() == controlNum){
//            if(!ifElseStack.empty()){
//                JSFMIfElse store = ifElseStack.pop();
//                if(!ifElseStack.empty()){
//                    ifElseTemp = ifElseStack.peek();
//                    ifResult = ifElseTemp.getResult();
//                    if(ifElseTemp.getIfNum() > 0){
//                        ifInUse = true;
//                        elseInUse = false;
//                    }else if(ifElseTemp.getElseNum() > 0){
//                        ifInUse = false;
//                        elseInUse = true;
//                    }
//                }else{
//                    elseInUse = false;
//                }
//            }else{
//                elseInUse = false;
//            }
//        }
//
//        type = "";
//    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSwitchBlockStatementGroup(JSFMParser.SwitchBlockStatementGroupContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSwitchBlockStatementGroup(JSFMParser.SwitchBlockStatementGroupContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSwitchLabel(JSFMParser.SwitchLabelContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSwitchLabel(JSFMParser.SwitchLabelContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterForControl(JSFMParser.ForControlContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitForControl(JSFMParser.ForControlContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterForInit(JSFMParser.ForInitContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitForInit(JSFMParser.ForInitContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEnhancedForControl(JSFMParser.EnhancedForControlContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEnhancedForControl(JSFMParser.EnhancedForControlContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterParExpression(JSFMParser.ParExpressionContext ctx) {
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitParExpression(JSFMParser.ParExpressionContext ctx) {

        if((!ifInUse && !elseInUse) ||(ifInUse && ifResult) || (elseInUse && !ifResult)){
            System.out.println(ctx.getText() + " EXIT PAR STATEMENT / IF STATEMENT");
            boolean error = true;
            Expression expr = new Expression(ctx.expression().getText());

            while(error){
                try{
                    BigDecimal res = expr.eval();
                    if(res.intValue() == 1){
                        System.out.println("TRUE");
                        //TRUE
                        ifResult = true;
                    }else if(res.intValue() == 0){
                        System.out.println("FALSE");
                        //FALSE
                        ifResult = false;
                    }
                    ifStatement = true;

                    if(ifInUse){
                        ifInUse = false;
                        if(!ifElseStack.empty()){
                            JSFMIfElse store = ifElseStack.pop();
                            ifElseStack.push(ifElseTemp);
                        }
                    }else if(elseInUse){
                        elseInUse = false;
                        if(!ifElseStack.empty()){
                            JSFMIfElse store = ifElseStack.pop();
                            ifElseStack.push(ifElseTemp);
                        }
                    }
                    ifElseTemp = new JSFMIfElse(ifResult);
                    error = false;
                }catch(Exception e){
                    System.out.println(e.getMessage() + " FUCK JAVA");
                    if(e.getMessage().contains("Unknown operator or function: ")){
                        String var = e.getMessage().split("Unknown operator or function: ")[1];
                        JSFMValues temp;
                        if(symbolTable.containsKey(var)){
                            temp = symbolTable.get(var);
                            if(!temp.isEmpty()){
                                switch (temp.getObjectType()){
                                    case "techies":
                                        expr.setVariable(var, BigDecimal.valueOf(temp.getIntValue()));
                                        break;
                                    case "float":
                                        expr.setVariable(var, BigDecimal.valueOf(temp.getFloatValue()));
                                        break;
                                    case "thread":
                                        expr.setVariable(var, temp.getStringValue());
                                        break;
                                    case "kachow":
                                        expr.setVariable(var, BigDecimal.valueOf((int) temp.getCharValue()));
                                        break;
                                    case "boolin":
                                        if(temp.getBoolValue()) {
                                            expr.setVariable(var, BigDecimal.valueOf(1));
                                        }else{
                                            expr.setVariable(var, BigDecimal.valueOf(0));
                                        }
                                        break;
                                }
                            }else{
                                TestScanner.outputTextArea.append("ERROR - Variable " + var + " has not been initialized. Please initialize it first.\n");
                            }
                        }else{
                            TestScanner.outputTextArea.append("ERROR - Variable " + var + " does not exist. Please declare and initialize it first.\n");
                        }
                    }


                }
            }

        }



    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpressionList(JSFMParser.ExpressionListContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpressionList(JSFMParser.ExpressionListContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMethodCall(JSFMParser.MethodCallContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMethodCall(JSFMParser.MethodCallContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterPrepostFix(JSFMParser.PrepostFixContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPrepostFix(JSFMParser.PrepostFixContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterExpression(JSFMParser.ExpressionContext ctx) {
        //System.out.println("EXPRESSION - " + ctx.start.getText());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitExpression(JSFMParser.ExpressionContext ctx) {
        //System.out.println("EXIT EXPRESSION - " + ctx.getText());

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterPrimary(JSFMParser.PrimaryContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPrimary(JSFMParser.PrimaryContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterInputStatement(JSFMParser.InputStatementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitInputStatement(JSFMParser.InputStatementContext ctx) {
        String question = ctx.STRING_LITERAL().getText();
        String vName = ctx.IDENTIFIER().getText();
        if(symbolTable.containsKey(vName)){
            JSFMValues temp = symbolTable.get(vName);
            if(!temp.isFinal() || (temp.isFinal() && temp.isEmpty())){
                pause = true;
                inputFrame = new JFrame("Input");
                inputFrame.setDefaultCloseOperation(inputFrame.HIDE_ON_CLOSE);
                inputFrame.setVisible(true);

                String s = "";
                s = JOptionPane.showInputDialog(question);
                inputFrame.setVisible(false);

                if(symbolTable.containsKey(vName)){

                    System.out.println("HELLO WORLD -- " + s + " " + vName);
                    JSFMValues temp2 = symbolTable.get(vName);
                    System.out.println(temp2.getStringValue());
                    if(!temp2.isFinal() || (temp2.isFinal() && temp2.isEmpty())){
                        switch(temp2.getObjectType()){
                            case "techies":
                                tempLexer = new JSFMLexer(CharStreams.fromString(s));
                                token = tempLexer.nextToken();
                                tokenType = token.getType();
                                if(tokenType == JSFMLexer.FLOAT_LITERAL){
                                    temp2.setIntValue((int) Float.parseFloat(s));
                                }else if(tokenType == JSFMLexer.DECIMAL_LITERAL){
                                    temp2.setIntValue(Integer.parseInt(s));
                                }else{
                                    TestScanner.outputTextArea.append("ERROR - Variable type of " + vName + " does not match with the variable type of your input (" + s + ")\n");
                                }
//                                float intVal = parse();
//                                temp2.setIntValue((int) intVal);
                                break;
                            case "coke":
                                tempLexer = new JSFMLexer(CharStreams.fromString(s));
                                token = tempLexer.nextToken();
                                tokenType = token.getType();
                                if(tokenType == JSFMLexer.FLOAT_LITERAL || tokenType == JSFMLexer.DECIMAL_LITERAL){
                                    temp2.setFloatValue(Float.parseFloat(s));
                                }else{
                                    TestScanner.outputTextArea.append("ERROR - Variable type of " + vName + " does not match with the variable type of your input (" + s + ")\n");
                                }
//                                float f = parse();
//                                temp2.setFloatValue(f);
                                break;
                            case "thread":
                                if(s.charAt(0) != '\"' && s.charAt(s.length()-1) != '\"'){
                                    String str = "\"";
                                    str = str.concat(s);
                                    s = str.concat("\"");
                                }else if(s.charAt(0) == '\"' && s.charAt(s.length()-1) != '\"'){
                                    s = s.concat("\"");
                                }else if(s.charAt(0) != '\"' && s.charAt(s.length()-1) == '\"'){
                                    String str = "\"";
                                    str = str.concat(s);
                                    s = str;
                                }
                                tempLexer = new JSFMLexer(CharStreams.fromString(s));
                                String test = parseStr();
                                temp2.setStringValue(test);
                                break;
                            case "kachow":
                                if(s.charAt(0) != '\'' && s.charAt(s.length()-1) != '\''){
                                    String str = "\'";
                                    str = str.concat(s);
                                    s = str.concat("\'");
                                }else if(s.charAt(0) == '\'' && s.charAt(s.length()-1) != '\''){
                                    s = s.concat("\'");
                                }else if(s.charAt(0) != '\'' && s.charAt(s.length()-1) == '\''){
                                    String str = "\'";
                                    str = str.concat(s);
                                    s = str;
                                }
                                tempLexer = new JSFMLexer(CharStreams.fromString(s));
                                char c = parseChar();
                                temp2.setCharValue(c);
                                break;
                            case "boolin":
                                boolean b = parseBool();
                                temp2.setBoolValue(b);
                                break;
                            default: TestScanner.outputTextArea.append("Variable type of " + vName + " does not match with the type of input.\n");
                        }

                        symbolTable.put(vName, temp2);
                    }else{
                        TestScanner.outputTextArea.append("ERROR - Variable " + vName + " is an ultimate variable. Its value cannot be changed.\n");
                    }
                }else{
                    TestScanner.outputTextArea.append("ERROR - Variable " + vName + " does not exist. Please declare and initialize it first.\n");
                }


//                inputFrame.dispose();

            }else{
                TestScanner.outputTextArea.append("ERROR - Variable " + vName + " is an ultimate variable. Its value cannot be changed.");
            }

        }else{
            TestScanner.outputTextArea.append("ERROR - Variable " + vName + " does not exist. Please declare and initialize it first.");
        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterOutputStatement(JSFMParser.OutputStatementContext ctx) {

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitOutputStatement(JSFMParser.OutputStatementContext ctx) {

        if((!ifInUse && !elseInUse) ||(ifInUse && ifResult) || (elseInUse && !ifResult)){
            print = "";
            String temp = ctx.getText().substring(8, ctx.getText().length()-2);
            tempLexer = new JSFMLexer(CharStreams.fromString(temp));
            print = parseStr();

            TestScanner.outputTextArea.append(print.replace("\\n", System.lineSeparator()));
        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterPrimitiveType(JSFMParser.PrimitiveTypeContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitPrimitiveType(JSFMParser.PrimitiveTypeContext ctx) { }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEveryRule(ParserRuleContext ctx) {
        controlNum++;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEveryRule(ParserRuleContext ctx) {
        controlNum--;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitTerminal(TerminalNode node) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitErrorNode(ErrorNode node) { }

    public void skipWS(){
        while(token.getType() == JSFMLexer.WS){
            token = tempLexer.nextToken();
        }
    }

    private boolean parseBool(){
        boolean boo = false;
        token = tempLexer.nextToken();
        if(token.getType() == JSFMLexer.BOOL_LITERAL){
            if(token.getText().equals("true")){
                boo = true;
            }
            token = tempLexer.nextToken();
            if(token.getType() != JSFMLexer.EOF){
                TestScanner.outputTextArea.append("ERROR - boolin variables can only have one boolin value in them. Please remove \" " + token.getText());
                token = tempLexer.nextToken();
                while(token.getType() != JSFMLexer.EOF){
                    System.out.print(token.getText());
                    token = tempLexer.nextToken();
                }
                System.out.print(" \"\n");
            }
        }else if(token.getType() == JSFMLexer.IDENTIFIER){
            JSFMValues temp;
            if(symbolTable.containsKey(token.getText())){
                temp = symbolTable.get(token.getText());
                if(!temp.isEmpty()){
                    boo = temp.getBoolValue();

                    token = tempLexer.nextToken();
                    if(token.getType() != JSFMLexer.EOF){
                        TestScanner.outputTextArea.append("ERROR - boolin variables can only have one boolin value in them. Please remove \" " + token.getText());
                        token = tempLexer.nextToken();
                        while(token.getType() != JSFMLexer.EOF){
                            System.out.print(token.getText());
                            token = tempLexer.nextToken();
                        }
                        System.out.print(" \"\n");
                    }
                }else{
                    TestScanner.outputTextArea.append("ERROR - Variable " + token.getText() + " is not initialized. Please initialize it first.");
                }
            }else{
                TestScanner.outputTextArea.append("ERROR - Variable " + token.getText() + " does not exist. Please declare and initialize it first.");
            }
        }else{
            TestScanner.outputTextArea.append("ERROR - Variable type (" + type + ") does not match with the variable type of " + token.getText() + ".");
        }

        return boo;
    }


    private char parseChar(){
        char ch = ' ';
        token = tempLexer.nextToken();
        if(token.getType() == JSFMLexer.CHAR_LITERAL){
            ch = token.getText().substring(1,2).charAt(0);
            token = tempLexer.nextToken();
            if(token.getType() != JSFMLexer.EOF){
                TestScanner.outputTextArea.append("ERROR - kachow variables can only have one kachow value in them. Please remove \" " + token.getText());
                token = tempLexer.nextToken();
                while(token.getType() != JSFMLexer.EOF){
                    System.out.print(token.getText());
                    token = tempLexer.nextToken();
                }
                System.out.print(" \"\n");
            }
        }else if(token.getType() == JSFMLexer.IDENTIFIER){
            JSFMValues temp;
            if(symbolTable.containsKey(token.getText())){
                temp = symbolTable.get(token.getText());
                if(!temp.isEmpty()){
                    ch = temp.getCharValue();

                    token = tempLexer.nextToken();
                    if(token.getType() != JSFMLexer.EOF){
                        TestScanner.outputTextArea.append("ERROR - kachow variables can only have one kachow value in them. Please remove \" " + token.getText());
                        token = tempLexer.nextToken();
                        while(token.getType() != JSFMLexer.EOF){
                            TestScanner.outputTextArea.append(token.getText());
                            token = tempLexer.nextToken();
                        }
                        TestScanner.outputTextArea.append(" \"\n");
                    }
                }else{
                    TestScanner.outputTextArea.append("ERROR - Variable " + token.getText() + " is not initialized. Please initialize it first.\n");
                }
            }else{
                TestScanner.outputTextArea.append("ERROR - Variable " + token.getText() + " does not exist. Please declare and initialize it first.\n");
            }
        }else{
            TestScanner.outputTextArea.append("ERROR - Variable type (" + type + ") does not match with the variable type of " + token.getText() + ".\n");
        }

        return ch;
    }

    private String parseStr(){
        String value = "";

        token = tempLexer.nextToken();
        tokenType = token.getType();

        do{
            if(tokenType == JSFMLexer.ADD){
                    token = tempLexer.nextToken();
                    tokenType = token.getType();
                    skipWS();
            }
            switch(token.getType()){
                case JSFMLexer.BOOL_LITERAL:
                case JSFMLexer.FLOAT_LITERAL:
                case JSFMLexer.DECIMAL_LITERAL:
                    value = value + token.getText();
                    token = tempLexer.nextToken();
                    tokenType = token.getType();
                    skipWS();
                    break;
                case JSFMLexer.STRING_LITERAL:
                case JSFMLexer.CHAR_LITERAL:
                    value = value + token.getText().substring(1, token.getText().length()-1);
                    token = tempLexer.nextToken();
                    tokenType = token.getType();
                    skipWS();
                    break;
                case JSFMLexer.IDENTIFIER:
                    JSFMValues temp;

                    if(symbolTable.containsKey(token.getText())){
                        temp = symbolTable.get(token.getText());
                        if(!temp.isEmpty()){
                            switch (temp.getObjectType()){
                                case "techies":
                                    value = value + temp.getIntValue();
                                    break;
                                case "coke":
                                    value = value + temp.getFloatValue();
                                    break;
                                case "thread":
                                    value = value + temp.getStringValue();
                                    break;
                                case "kachow":
                                    value = value + temp.getCharValue();
                                    break;
                                case "boolin":
                                    value = value + temp.getBoolValue();
                                    break;
                            }
                        }else{
                            TestScanner.outputTextArea.append("ERROR - Variable '" + token.getText() + "' is not initialized. Please initialize it first.\n");
                        }
                    }else{
                        TestScanner.outputTextArea.append("ERROR - Variable '" + token.getText() + "' does not exist. Please declare and initialize it first.\n");
                    }

                    token = tempLexer.nextToken();
                    tokenType = token.getType();
                    skipWS();
                    break;
                default: TestScanner.outputTextArea.append("ERROR - Expecting a string instead of '" + token.getText() + "'.\n");
            }
        }while(tokenType == JSFMLexer.ADD);

        return value;
    }

    private float parse() {
        token = tempLexer.nextToken();
        tokenType = token.getType();
        return EXPR();
    }

    private float EXPR () {
        float left = TERM();
        while (tokenType == JSFMLexer.ADD ||
                tokenType == JSFMLexer.SUB) {
            int saveToken = tokenType;
            token = tempLexer.nextToken();
            tokenType = token.getType();
            switch (saveToken) {
                case JSFMLexer.ADD:
                    left += TERM();
                    break;
                case JSFMLexer.SUB:
                    left -= TERM();
                    break;
            }
        }
        return left;
    }

    private float TERM () {
        float left = FACTOR();
        while (tokenType == JSFMLexer.MUL || tokenType == JSFMLexer.DIV || tokenType == JSFMLexer.MOD) {
            int saveToken = tokenType;
            token = tempLexer.nextToken();
            tokenType = token.getType();
            switch (saveToken) {
                case JSFMLexer.MUL:
                    left *= FACTOR();
                    break;
                case JSFMLexer.DIV:
                    left /= FACTOR();
                    break;
                case JSFMLexer.MOD:
                    left %= FACTOR();
                    break;
            }
        }
        return left;
    }


    private float FACTOR () {
        float value = 0;

        switch (tokenType) {
            case JSFMLexer.DECIMAL_LITERAL:
                value = Integer.parseInt(token.getText());
                token = tempLexer.nextToken();
                tokenType = token.getType();
                break;
            case JSFMLexer.FLOAT_LITERAL:
                value = Float.parseFloat(token.getText());
                if(!type.equals("coke")){
                    TestScanner.outputTextArea.append("WARNING - Variable type (" + type + ") does not match with the type of "
                            + token.getText() + ". Value may be inaccurate due to loss in conversion.\n");
                }
                token = tempLexer.nextToken();
                tokenType = token.getType();
                break;
            case JSFMLexer.IDENTIFIER:
                JSFMValues temp;
                if(symbolTable.containsKey(token.getText())){
                    temp = symbolTable.get(token.getText());
                    if(!temp.isEmpty()){
                        if(temp.getObjectType().equals("techies")){
                            if(type.equals("techies")){
                                value = temp.getIntValue();
                                token = tempLexer.nextToken();
                                tokenType = token.getType();
                            }else if(type.equals("coke")){
                                value = temp.getIntValue();
                                token = tempLexer.nextToken();
                                tokenType = token.getType();
                            }else{
                                TestScanner.outputTextArea.append("ERROR - Expecting mismatched data types (" + type + ") cannot have a techies value.\n");
                            }
                        }else if(temp.getObjectType().equals("coke")){
                            if(type.equals("techies")){
                                TestScanner.outputTextArea.append("WARNING - Variable type (" + type + ") does not match with the type of "
                                        + token.getText() + ". Value may be inaccurate due to loss in conversion.\n");
                                value = (int) temp.getFloatValue();
                                token = tempLexer.nextToken();
                                tokenType = token.getType();
                            }else if(type.equals("coke")){
                                value = temp.getFloatValue();
                                token = tempLexer.nextToken();
                                tokenType = token.getType();
                            }else{
                                TestScanner.outputTextArea.append("ERROR - Expecting mismatched data types (" + type + ") cannot have a float value.\n" );
                            }
                        }else{
                            TestScanner.outputTextArea.append("ERROR- Expecting a number or '(' instead of a '" + temp.getObjectType() + "'.\n");
                        }
                    }else{
                        TestScanner.outputTextArea.append("ERROR - Variable '" + token.getText() + "' is not initialized. Please initialize it first.\n");
                    }
                }else{
                    TestScanner.outputTextArea.append("ERROR - Variable '" + token.getText() + "' does not exist. Please declare and initialize it first.\n");
                }

                break;
            case JSFMLexer.LPAREN:
                token = tempLexer.nextToken();
                tokenType = token.getType();
                value = EXPR();
                if (tokenType != JSFMLexer.RPAREN) {
                    TestScanner.outputTextArea.append("ERROR - Uneven parentheses. Remove ')'.\n");
                }
                token = tempLexer.nextToken();
                tokenType = token.getType();
                break;
            case JSFMLexer.SUB:
                token = tempLexer.nextToken();
                tokenType = token.getType();
                if(tokenType == JSFMLexer.DECIMAL_LITERAL){
                    value = Integer.parseInt(token.getText());
                    value *= -1;
                    token = tempLexer.nextToken();
                    tokenType = token.getType();
                }else if(tokenType == JSFMLexer.FLOAT_LITERAL){
                    value = Float.parseFloat(token.getText());
                    value *= -1;
                    token = tempLexer.nextToken();
                    tokenType = token.getType();
                }else{
                    TestScanner.outputTextArea.append("ERROR - Expecting a number or '(' instead of '" + token.getText() + "' after '-'.");
                }
                break;
            default:
                System.out.println("ERROR - Expecting a number or '(' instead of '" + token.getText() + "'.");
        }
        return value;
    }

    private class inputBtnListener implements ActionListener{
        JTextField textField;
        String s = "";
        boolean pause;
        String vName;

        public inputBtnListener(JTextField txtFld, boolean p, String var){
            textField = txtFld;
            pause = p;
            vName = var;
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            s = textField.getText();
            pause = false;
            if(symbolTable.containsKey(vName)){
                System.out.println("HELLO WORLD -- " + s);
                JSFMValues temp = symbolTable.get(vName);
                System.out.println(temp.getStringValue());
                if(!temp.isFinal() || (temp.isFinal() && temp.isEmpty())){
                    tempLexer = new JSFMLexer(CharStreams.fromString(s));
                    switch(temp.getObjectType()){
                        case "techies":
                            float intVal = parse();
                            temp.setIntValue((int) intVal);
                            break;
                        case "coke":
                            float f = parse();
                            temp.setFloatValue(f);
                            break;
                        case "thread":
                            String test = parseStr();
                            temp.setStringValue(test);
                            break;
                        case "kachow":
                            char c = parseChar();
                            temp.setCharValue(c);
                            break;
                        case "boolin":
                            boolean b = parseBool();
                            temp.setBoolValue(b);
                            break;
                        default: TestScanner.outputTextArea.append("Variable type of " + vName + " does not match with the type of input.\n");
                    }

                    symbolTable.put(vName, temp);
                }else{
                    TestScanner.outputTextArea.append("ERROR - Variable " + vName + " is an ultimate variable. Its value cannot be changed.\n");
                }
            }else{
                TestScanner.outputTextArea.append("ERROR - Variable " + vName + " does not exist. Please declare and initialize it first.\n");
            }


            inputFrame.dispose();

        }

        public boolean getPause(){
            return pause;
        }

        public String getString(){
            return s;
        }
    }

}