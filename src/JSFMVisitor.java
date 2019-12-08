import com.udojava.evalex.Expression;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.swing.*;
import java.util.Hashtable;

public class JSFMVisitor extends JSFMParserBaseVisitor<Object> {
    static Hashtable<String, JSFMValues> symbolTable = new Hashtable<String, JSFMValues>();

    @Override
    public Object visitCompilationUnit(JSFMParser.CompilationUnitContext ctx) {
        TestScanner.outputTextArea.setText("");
        System.out.println("In compilation unit");
        return visitChildren(ctx);
    }

    @Override
    public Object visitMainStatement(JSFMParser.MainStatementContext ctx) {
        System.out.println("in main statement");

        return visitChildren(ctx);
    }

    @Override
    public Object visitVariableModifier(JSFMParser.VariableModifierContext ctx) {
        return null;
    }

    @Override
    public Object visitTypeParameters(JSFMParser.TypeParametersContext ctx) {
        return null;
    }

    @Override
    public Object visitTypeParameter(JSFMParser.TypeParameterContext ctx) {
        return null;
    }

    @Override
    public Object visitMethodDeclaration(JSFMParser.MethodDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitMethodBody(JSFMParser.MethodBodyContext ctx) {
        return null;
    }

    @Override
    public Object visitGenericMethodDeclaration(JSFMParser.GenericMethodDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitFieldDeclaration(JSFMParser.FieldDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitMemberDeclaration(JSFMParser.MemberDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitTypeTypeOrVoid(JSFMParser.TypeTypeOrVoidContext ctx) {
        return null;
    }

    @Override
    public Object visitTypeType(JSFMParser.TypeTypeContext ctx) {
        return null;
    }

    @Override
    public Object visitFormalParameters(JSFMParser.FormalParametersContext ctx) {
        return null;
    }

    @Override
    public Object visitFormalParameterList(JSFMParser.FormalParameterListContext ctx) {
        return null;
    }

    @Override
    public Object visitFormalParameter(JSFMParser.FormalParameterContext ctx) {
        return null;
    }

    @Override
    public Object visitLastFormalParameter(JSFMParser.LastFormalParameterContext ctx) {
        return null;
    }

    @Override
    public Object visitQualifiedName(JSFMParser.QualifiedNameContext ctx) {
        return null;
    }

    @Override
    public Object visitLiteral(JSFMParser.LiteralContext ctx) {
        return null;
    }

    @Override
    public Object visitIntegerLiteral(JSFMParser.IntegerLiteralContext ctx) {
        return null;
    }

    @Override
    public Object visitFloatLiteral(JSFMParser.FloatLiteralContext ctx) {
        return null;
    }

    @Override
    public Object visitQualifiedNameList(JSFMParser.QualifiedNameListContext ctx) {
        return null;
    }

    @Override
    public Object visitVariableDeclarators(JSFMParser.VariableDeclaratorsContext ctx) {
        return null;
    }

    @Override
    public Object visitVariableDeclarator(JSFMParser.VariableDeclaratorContext ctx) {
        return null;
    }

    @Override
    public Object visitVariableDeclaratorId(JSFMParser.VariableDeclaratorIdContext ctx) {
        return null;
    }

    @Override
    public Object visitVariableInitializer(JSFMParser.VariableInitializerContext ctx) {
        return null;
    }

    @Override
    public Object visitArrayInitializer(JSFMParser.ArrayInitializerContext ctx) {
        return null;
    }

    @Override
    public Object visitBlock(JSFMParser.BlockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitBlockStatement(JSFMParser.BlockStatementContext ctx) {
        System.out.println("In block statement");
        return visitChildren(ctx);
    }

    @Override
    public Object visitLocalVariableDeclaration(JSFMParser.LocalVariableDeclarationContext ctx) {
        boolean isFinal = false;
        System.out.println("IN VARIABLE DECLARATION");
        String type = ctx.typeType().getText();
        if(ctx.variableModifier() != null){
            isFinal = true;
        }

        String varName = "";
        String varValue = "";

        for(int i=0; i< ctx.variableDeclarators().variableDeclarator().size(); i++){
            varName = ctx.variableDeclarators().variableDeclarator(i).variableDeclaratorId().getText();

            if(ctx.variableDeclarators().variableDeclarator(i).variableInitializer()!= null){ //has a value
                varValue = ctx.variableDeclarators().variableDeclarator(i).variableInitializer().getText();
                System.out.println(type + " " + varName + " " + varValue);

                if(type.equalsIgnoreCase("coke") || type.equalsIgnoreCase("techies")){
                    Expression expr = new Expression(varValue);

                    JSFMValues var;
                    switch(type) {
                        case "techies":
                            var = new JSFMValues(type, expr.eval().intValue(), isFinal);
                            symbolTable.put(varName, var);
                            break;
                        case "coke":
                            var = new JSFMValues(type, expr.eval().floatValue(), isFinal);
                            symbolTable.put(varName, var);
                            break;
                    }
                } else if(type.equals("boolin") || type.equals("thread") || type.equals("kachow")){
                    JSFMValues var;
                    switch(type) {
                        case "boolin":
                            if(varValue == "true") {
                                var = new JSFMValues(type,true, isFinal);
                                symbolTable.put(varName, var);
                            }
                            else if(varValue == "false") {
                                var = new JSFMValues(type,false, isFinal);
                                symbolTable.put(varName, var);
                            }
                            break;
                        case "thread":
                            var = new JSFMValues(type, varValue.substring(1, varValue.length()-1), isFinal);
                            symbolTable.put(varName, var);
                            break;
                        case "kachow":
                            var = new JSFMValues(type, varValue.charAt(1), isFinal);
                            symbolTable.put(varName, var);
                            break;
                    }
                }
            }else{ //no value
                JSFMValues var = new JSFMValues(type, isFinal);
                symbolTable.put(varName, var);
            }

        }


        return null;
    }

    @Override
    public Object visitReturnStatement(JSFMParser.ReturnStatementContext ctx) {
        return null;
    }

    @Override
    public Object visitReturnExpression(JSFMParser.ReturnExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitBlockStmt(JSFMParser.BlockStmtContext ctx) { return visitChildren(ctx); }

    @Override
    public Object visitIfElseStmt(JSFMParser.IfElseStmtContext ctx) { return visitChildren(ctx); }

    @Override
    public Object visitForLoopStmt(JSFMParser.ForLoopStmtContext ctx) { return visitChildren(ctx); }

    @Override
    public Object visitWhileLoopStmt(JSFMParser.WhileLoopStmtContext ctx) { return visitChildren(ctx); }

    @Override
    public Object visitDoWhileLoopStmt(JSFMParser.DoWhileLoopStmtContext ctx) { return visitChildren(ctx); }

    @Override
    public Object visitSwitchStmt(JSFMParser.SwitchStmtContext ctx) { return visitChildren(ctx); }

    @Override
    public Object visitBreakStmt(JSFMParser.BreakStmtContext ctx) { return visitChildren(ctx); }

    @Override
    public Object visitExprStmt(JSFMParser.ExprStmtContext ctx) { return visitChildren(ctx); }

    @Override
    public Object visitIdentifierStmt(JSFMParser.IdentifierStmtContext ctx) { return visitChildren(ctx); }

    @Override
    public Object visitOutputStmt(JSFMParser.OutputStmtContext ctx) { return visitChildren(ctx); }

    @Override public Object visitInputStmt(JSFMParser.InputStmtContext ctx) { return visitChildren(ctx); }

    @Override
    public Object visitSwitchBlockStatementGroup(JSFMParser.SwitchBlockStatementGroupContext ctx) {
        return null;
    }

    @Override
    public Object visitSwitchLabel(JSFMParser.SwitchLabelContext ctx) {
        return null;
    }

    @Override
    public Object visitForControl(JSFMParser.ForControlContext ctx) {
        return null;
    }

    @Override
    public Object visitForInit(JSFMParser.ForInitContext ctx) {
        return null;
    }

    @Override
    public Object visitEnhancedForControl(JSFMParser.EnhancedForControlContext ctx) {
        return null;
    }

    @Override
    public Object visitParExpression(JSFMParser.ParExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitExpressionList(JSFMParser.ExpressionListContext ctx) {
        return null;
    }

    @Override
    public Object visitMethodCall(JSFMParser.MethodCallContext ctx) {
        return null;
    }

    @Override
    public Object visitPrepostFix(JSFMParser.PrepostFixContext ctx) {
        return null;
    }

    @Override
    public Object visitExpression(JSFMParser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitPrimary(JSFMParser.PrimaryContext ctx) {
        return null;
    }

    @Override
    public Object visitInputStatement(JSFMParser.InputStatementContext ctx) {
        String varName = ctx.children.get(4).getText();
        String question = ctx.children.get(2).getText();

        if(symbolTable.containsKey(varName)) {
            JSFMValues temp = symbolTable.get(varName);
            if (!temp.isFinal() || (temp.isFinal() && temp.isEmpty())) {
                String type = temp.getObjectType();
                JFrame inputFrame = new JFrame("Input");
                inputFrame.setDefaultCloseOperation(inputFrame.HIDE_ON_CLOSE);
                inputFrame.setVisible(true);

                String s = "";
                s = JOptionPane.showInputDialog(question);
                TestScanner.outputTextArea.append(question + " " + s + "\n");
                inputFrame.setVisible(false);

                switch (type) {
                    case "techies":
                        temp.setIntValue(Integer.parseInt(s));
                        break;
                    case "coke":
                        temp.setFloatValue(Float.parseFloat(s));
                        break;
                    case "kachow":
                        char c = s.charAt(0);
                        temp.setCharValue(c);
                        break;
                    case "thread":
                        temp.setStringValue(s);
                        break;
                    case "boolin":
                        if (s.equalsIgnoreCase("true"))
                            temp.setBoolValue(true);
                        else if (s.equalsIgnoreCase("false"))
                            temp.setBoolValue(false);
                        break;
                }
            }
        }

        return null;
    }

    @Override
    public Object visitOutputStatement(JSFMParser.OutputStatementContext ctx) {
        System.out.println("IN OUTPUT STATEMENT");
        String print = "";

        for(int i=0; i<ctx.children.size(); i++){
            String temp = ctx.children.get(i).toString();
            if(!temp.equals("outputf") && !temp.equals("(")&& !temp.equals(")") && !temp.equals("+") && !temp.equals(";")){
                try{
                    float test = Float.parseFloat(temp);
                    if(test % 1 == 0){ //int
                        print += (int) test;
                    }else{ //float
                        print += test;
                    }
                }catch(NumberFormatException e){ //string or identifier
                    if(temp.charAt(0) == '\"' && temp.charAt(temp.length()-1) == '\"'){ //str_lit
                        print += temp.substring(1, temp.length()-1);
                    }else if(temp.length() == 3 && temp.charAt(0) == '\'' && temp.charAt(2) == '\''){ //chr_lit
                        print += temp.charAt(1);
                    }else{ //identifier
                        if(symbolTable.containsKey(temp)){
                            JSFMValues val = symbolTable.get(temp);
                            if(!val.isEmpty()){
                                switch (val.getObjectType()){
                                    case "techies":
                                        print += val.getIntValue();
                                        break;
                                    case "coke":
                                        print += val.getFloatValue();
                                        break;
                                    case "thread":
                                        print += val.getStringValue();
                                        break;
                                    case "kachow":
                                        print += val.getCharValue();
                                        break;
                                    case "boolin":
                                        print += val.getBoolValue();
                                        break;
                                }
                            }else{
                                TestScanner.outputTextArea.append("ERROR - Variable " + temp + " has not been initialized. " +
                                        "Please initialize it first.\n");
                            }
                        }else {
                            TestScanner.outputTextArea.append("ERROR - Variable " + temp + " does not exist. " +
                                    "Please declare and initialize it first.\n");
                        }
                    }
                }
            }
        }

        TestScanner.outputTextArea.append(print.replace("\\n", System.lineSeparator()));
        return print;
    }

    @Override
    public Object visitPrimitiveType(JSFMParser.PrimitiveTypeContext ctx) {
        return null;
    }


    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}