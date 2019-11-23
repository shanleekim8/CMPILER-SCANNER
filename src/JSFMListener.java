// Generated from C:/Users/Shan/IdeaProjects/CMPILER-Scanner/src\JSFMParser.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.awt.*;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * This class provides an empty implementation of {@link JSFMParserListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class JSFMListener implements JSFMParserListener {

    static Hashtable<String, JSFMValues> symbolTable = new Hashtable<String, JSFMValues>();
    static Token token;
    static int tokenType;
    static JSFMLexer lexer;
    static JSFMLexer tempLexer;
    static String print = "";
    static String type = "";
    static String exprValue = "";
//    public static void main(String[] args){
//
//        symbolTable.put("yes", "eys");
//        System.out.println(symbolTable.get("yes"));
//    }

    public JSFMListener(JSFMLexer l){
        lexer = l;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterCompilationUnit(JSFMParser.CompilationUnitContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitCompilationUnit(JSFMParser.CompilationUnitContext ctx) {
        Enumeration e = symbolTable.keys();
        JSFMValues value;

        while(e.hasMoreElements()){
            Object el = e.nextElement();
            System.out.println("Key : " + el);
            value = symbolTable.get(el);
            System.out.println("Type : " + value.getObjectType());
            switch(value.getObjectType()){
                case "techies":
                    if(value.isArray()){
                        System.out.println("Value : " + value.getArrayValues());
                    }else{
                        System.out.println("Value : " + value.getIntValue());
                    }
                    break;
                case "coke":
                    if(value.isArray()){
                        System.out.println("Value : " + value.getArrayValues());
                    }else{
                        System.out.println("Value : " + value.getFloatValue());
                    }
                    break;
                case "thread":
                    if(value.isArray()){
                        System.out.println("Value : " + value.getArrayValues());
                    }else{
                        System.out.println("Value : " + value.getStringValue());
                    }
                    break;
                case "kachow":
                    if(value.isArray()){
                        System.out.println("Value : " + value.getArrayValues());
                    }else{
                        System.out.println("Value : " + value.getCharValue());
                    }
                    break;
            }
        }
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

        boolean isArray = false;

        if(ctx.variableDeclaratorId().LBRACK().size() > 0 && ctx.variableDeclaratorId().RBRACK().size() > 0){ // It's an array
            isArray = true;
        }

        if(!isArray){
            String temp = ctx.variableInitializer().getText();
            if(type.equals("techies") || type.equals("coke")){
                tempLexer = new JSFMLexer(CharStreams.fromString(temp));
                float value = parse();

                if(!symbolTable.containsKey(vName)){
                    if(type.equals("techies")){
                        symbolTable.put(vName, new JSFMValues(type, (int) value));
                        //   System.out.println(symbolTable.get(vName).getIntValue());
                    }else if(type.equals("coke")){
                        symbolTable.put(vName, new JSFMValues(type, value));
                        //   System.out.println(symbolTable.get(vName).getFloatValue());
                    }
                }else{
                    System.out.println("ERROR - Variable '" + vName + "' already exists. Recheck your variable delcarations or try removing the type declaration.");
                }
            }else if(type.equals("thread")){
                tempLexer = new JSFMLexer(CharStreams.fromString(temp));
                String value = parseStr();

                if(!symbolTable.containsKey(vName)){
                    symbolTable.put(vName, new JSFMValues(type, value));
                }else{
                    System.out.println("ERROR - Variable '" + vName + "' already exists. Recheck your variable delcarations or try removing the type declaration.");
                }
            }else if(type.equals("kachow")){
                tempLexer = new JSFMLexer(CharStreams.fromString(temp));
                char ch = parseChar();

                if(!symbolTable.containsKey(vName)){
                    symbolTable.put(vName, new JSFMValues(type, ch));
                }else{
                    System.out.println("ERROR - Variable '" + vName + "' already exists. Recheck your variable delcarations or try removing the type declaration.");
                }
            }
        }else if(isArray){
            String values = "{";
            if(type.equals("techies") || type.equals("coke") || type.equals("thread") || type.equals("kachow")){
                if(ctx.variableDeclaratorId().LBRACK().size() == ctx.variableDeclaratorId().RBRACK().size()){
                    if(ctx.variableInitializer().arrayInitializer()!= null){
                        String temp = ctx.variableInitializer().getText();
                        int arrayAmt = ctx.variableInitializer().arrayInitializer().variableInitializer().size();
                        int arraySize;
                        if(ctx.variableDeclaratorId().LBRACK().size() == 1){
                            if(arrayAmt-1 == ctx.variableInitializer().arrayInitializer().COMMA().size()){
                                temp = ctx.variableInitializer().arrayInitializer().getText()
                                        .substring(1, ctx.variableInitializer().arrayInitializer().getText().length()-1);
                                for(int i=0; i<arrayAmt; i++){
                                    tempLexer = new JSFMLexer(CharStreams.fromString(temp.split(",")[i]));
                                    if(type.equals("techies")){
                                        values = values + (int) parse() + ",";
                                    }else if(type.equals("coke")){
                                        values = values + parse() + ",";
                                    }else if(type.equals("thread")){
                                        values = values + parseStr() + ",";
                                    }else if(type.equals("kachow")){
                                        values = values + parseChar() + ",";
                                    }
                                }

                                values = values.substring(0,values.length()-1) + "}";
                            }


                        }else{
                            if(ctx.variableDeclaratorId().LBRACK().size() == arrayAmt){
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
                                            }
                                        }
                                        values = values.substring(0,values.length()-1) + "}";

                                    }
                                }
                                values = values + "}";
                            }else{
                                System.out.println("ERROR - Array dimension does not match initialization. Try removing a pair of []");
                            }
                        }
                    }else{
                        System.out.println("ERROR - Missing pair of {}");
                    }


                }else{
                    System.out.print("ERROR - Uneven brackets. Consider removing a");
                    if(ctx.variableDeclaratorId().LBRACK().size() > ctx.variableDeclaratorId().RBRACK().size()){
                        System.out.println("'['");
                    }else{
                        System.out.println("']'");
                    }
                }


                if(!symbolTable.containsKey(vName)){
                    symbolTable.put(vName, new JSFMValues(type, true, values));
                }else{
                    System.out.println("ERROR - Variable '" + vName + "' already exists. Recheck your variable delcarations or try removing the type declaration.");
                }
            }
//            else if(type.equals("thread")){
//                tempLexer = new JSFMLexer(CharStreams.fromString(temp));
//                String value = parseStr();
//
//                if(!symbolTable.containsKey(vName)){
//                    symbolTable.put(vName, new JSFMValues(type, value));
//                }else{
//                    System.out.println("ERROR - Variable '" + vName + "' already exists. Try removing the type declaration.");
//                }
//            }else if(type.equals("kachow")){
//                tempLexer = new JSFMLexer(CharStreams.fromString(temp));
//
//                token = tempLexer.nextToken();
//                if(token.getType() == JSFMLexer.CHAR_LITERAL){
//
//                    if(!symbolTable.containsKey(vName)){
//                        symbolTable.put(vName, new JSFMValues(type, token.getText().substring(1, 2).charAt(0)));
//                    }else{
//                        System.out.println("ERROR - Variable '" + vName + "' already exists. Try removing the type declaration.");
//                    }
//
//                    token = tempLexer.nextToken();
//                    if(token.getType() != JSFMLexer.EOF){
//                        System.out.print("ERROR - kachow variables can only have one kachow value in them. Please remove \" " + token.getText());
//                        token = tempLexer.nextToken();
//                        while(token.getType() != JSFMLexer.EOF){
//                            System.out.print(token.getText());
//                            token = tempLexer.nextToken();
//                        }
//                        System.out.print(" \"\n");
//                    }
//                }
//            }
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
       // System.out.println(ctx.start.getText());
        String temp = ctx.start.getText();
        if(temp.equals("techies") || temp.equals("coke") || temp.equals("thread") || temp.equals("kachow")){
            type = ctx.start.getText();
        }else{
            System.out.println("ERROR - Invalid type. Expecting one of the following: techies, coke, thread, kachow.");
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLocalVariableDeclaration(JSFMParser.LocalVariableDeclarationContext ctx) {
        //System.out.println(ctx.stop.getText());
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
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStatement(JSFMParser.StatementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStatement(JSFMParser.StatementContext ctx) { }
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
    @Override public void enterParExpression(JSFMParser.ParExpressionContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitParExpression(JSFMParser.ParExpressionContext ctx) { }
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
    @Override public void exitInputStatement(JSFMParser.InputStatementContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterOutputStatement(JSFMParser.OutputStatementContext ctx) {

//        print = "";
//        System.out.println("ENTERING OUTPUT");
//        token = lexer.nextToken();
//        System.out.println(token.getText());
//
//
//        if(token.getType() == JSFMLexer.LPAREN){
//            token = lexer.nextToken();
//            do{
//                if(token.getType() == JSFMLexer.ADD){
//                    token = lexer.nextToken();
//                    skipWS();
//                }
//                switch(token.getType()){
//                    case JSFMLexer.STRING_LITERAL:
//                        print = print + token.getText().substring(1, token.getText().length()-1);
//                        token = lexer.nextToken();
//                        skipWS();
//                        break;
//                    case JSFMLexer.IDENTIFIER:
//                        skipWS();
//                        break;
//                    default: System.out.println("ERROR - Expecting a string. Not " + token.getText());
//                }
//            }while(token.getType() == JSFMLexer.ADD);
//
//            if(token.getType() == JSFMLexer.RPAREN){
//                //pass
//            }else{
//                System.out.println("ERROR - Expecting ')' instead of '" + token.getText() + "'");
//            }
//
//        }else{
//            System.out.println("ERROR - Missing '(' after 'outputf'");
//        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitOutputStatement(JSFMParser.OutputStatementContext ctx) {
        print = "";
        String temp = ctx.getText().substring(8, ctx.getText().length()-2);
        tempLexer = new JSFMLexer(CharStreams.fromString(temp));
        print = parseStr();


        System.out.print(print.replace("\\n", System.lineSeparator()));

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
    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
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

//    private String printStr(){
//        String value = "";
//
//        token = tempLexer.nextToken();
//        tokenType = token.getType();
//
//        do{
//            if(tokenType == JSFMLexer.ADD){
//                token = tempLexer.nextToken();
//                tokenType = token.getType();
//                skipWS();
//            }
//            switch(token.getType()){
//                case JSFMLexer.STRING_LITERAL:
//                    value = value + token.getText().substring(1, token.getText().length()-1);
//                    token = tempLexer.nextToken();
//                    tokenType = token.getType();
//                    skipWS();
//                    break;
//                case JSFMLexer.CHAR_LITERAL:
//                    value = value + token.getText();
//                    token = tempLexer.nextToken();
//                    tokenType = token.getType();
//                    skipWS();
//                    break;
//                case JSFMLexer.DECIMAL_LITERAL:
//                case JSFMLexer.FLOAT_LITERAL:
//                    value = value + token.getText();
//                    token = tempLexer.nextToken();
//                    tokenType = token.getType();
//                    skipWS();
//                    break;
//                case JSFMLexer.IDENTIFIER:
//                    JSFMValues temp;
//
//                    if(symbolTable.containsKey(token.getText())){
//                        temp = symbolTable.get(token.getText());
//                        switch(temp.getObjectType()){
//                            case "techies":
//                                value = value + temp.getIntValue();
//                                break;
//                            case "coke":
//                                value = value + temp.getFloatValue();
//                                break;
//                            case "thread":
//                                value = value + temp.getStringValue();
//                                break;
//                            case "kachow":
//                                value = value + temp.getCharValue();
//                                break;
//                        }
//
//                    }else{
//                        System.out.println("ERROR - Variable name '" + token.getText() + "' is not defined." );
//                    }
//
//                    token = tempLexer.nextToken();
//                    tokenType = token.getType();
//                    skipWS();
//                    break;
//                default: System.out.println("ERROR - Expecting a string. Not " + token.getText() + " " + token.getType());
//            }
//        }while(tokenType == JSFMLexer.ADD);
//
//        return value;
//    }

    private char parseChar(){
        char ch = ' ';
        token = tempLexer.nextToken();
        if(token.getType() == JSFMLexer.CHAR_LITERAL){
            ch = token.getText().substring(1,2).charAt(0);
            token = tempLexer.nextToken();
            if(token.getType() != JSFMLexer.EOF){
                System.out.print("ERROR - kachow variables can only have one kachow value in them. Please remove \" " + token.getText());
                token = tempLexer.nextToken();
                while(token.getType() != JSFMLexer.EOF){
                    System.out.print(token.getText());
                    token = tempLexer.nextToken();
                }
                System.out.print(" \"\n");
            }
        }else{
            System.out.println("ERROR - Variable type (" + type + ") do not match with the variable type of " + token.getText()
                    + " (" + token.getType() + ")");
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
                        }
                    }else{
                        System.out.println("ERROR - Variable name '" + token.getText() + "' is not defined." );
                    }

                    token = tempLexer.nextToken();
                    tokenType = token.getType();
                    skipWS();
                    break;
                default: System.out.println("ERROR - Expecting a string. Not " + token.getText());
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
                    System.out.println("WARNING - Variable type (" + type + ") does not match with the type of "
                            + token.getText() + ". Value may be inaccurate due to loss in conversion.");
                }
                token = tempLexer.nextToken();
                tokenType = token.getType();
                break;
            case JSFMLexer.LPAREN:
                token = tempLexer.nextToken();
                tokenType = token.getType();
                value = EXPR();
                if (tokenType != JSFMLexer.RPAREN) {
                    System.out.println("ERROR");
                }
                token = tempLexer.nextToken();  // flush ")"
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
                    System.out.println("ERROR");
                }
                break;
            default:
                System.out.println("ERROR -xd");
        }
        return value;
    }
}