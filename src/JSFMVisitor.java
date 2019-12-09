import com.sun.org.apache.xpath.internal.operations.Mult;
import com.udojava.evalex.Expression;
import org.antlr.v4.runtime.misc.MultiMap;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.*;

public class JSFMVisitor extends JSFMParserBaseVisitor<Object> {
    static Hashtable<String, JSFMValues> symbolTable = new Hashtable<String, JSFMValues>();
    static Hashtable<String, JSFMFunction> functionTable = new Hashtable<String, JSFMFunction>();
    static Stack<Hashtable<String, JSFMValues>> scopeStack = new Stack<Hashtable<String, JSFMValues>>();

    @Override
    public Object visitCompilationUnit(JSFMParser.CompilationUnitContext ctx) {
        symbolTable.clear();
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
        String mName = ctx.IDENTIFIER().getText();
        String rType = ctx.typeTypeOrVoid().getText();
        JSFMParser.FormalParametersContext params = ctx.formalParameters();
        JSFMParser.BlockContext actions = ctx.methodBody().block();

        if(!symbolTable.containsKey(mName)){
            if(rType.equals("faceless") && !actions.getText().contains("respond")){
                JSFMFunction func = new JSFMFunction(mName, rType, params, actions);
                functionTable.put(mName, func);
                symbolTable.put(mName, new JSFMValues(rType, func));
            }else if(rType.equals("faceless") && !actions.getText().contains("respond")){
                TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() + " - Functions with a return type of" +
                        " faceless cannot have a return statement.\n");
            }else if(!rType.equals("faceless") && !actions.getText().contains("respond")){
                JSFMFunction func = new JSFMFunction(mName, rType, params, actions);
                functionTable.put(mName, func);
                symbolTable.put(mName, new JSFMValues(rType, func));
            }else if(!rType.equals("faceless") && !actions.getText().contains("respond")){
                TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() + " - Functions with a return type of " +
                        rType + " needs to have a return statement.\n");
            }
        }else{
            TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() + " - There is already a function with" +
                    " the same name. Please check your list of functions or rename this function.\n");
        }

        return null;
    }

    @Override
    public Object visitMethodBody(JSFMParser.MethodBodyContext ctx) {
        this.visit(ctx.block());

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
        JSFMValues toBeReturned = null;
        String varName = "";
        String varValue = "";

        for(int i=0; i< ctx.variableDeclarators().variableDeclarator().size(); i++){
            varName = ctx.variableDeclarators().variableDeclarator(i).variableDeclaratorId().getText();
            if(!symbolTable.containsKey(varName)){
                if(ctx.variableDeclarators().variableDeclarator(i).variableInitializer()!= null){ //has a value
                    varValue = ctx.variableDeclarators().variableDeclarator(i).variableInitializer().getText();
                    System.out.println(type + " " + varName + " " + varValue);

                    if(type.equalsIgnoreCase("coke") || type.equalsIgnoreCase("techies")){
                        if(!varName.contains("[]")) { //not an array
                            Expression expr = new Expression(varValue);
                            System.out.println(varName);
                            JSFMValues var;
                            boolean error = true;
                            while(error){
                                try{
                                    switch (type) {
                                        case "techies":
                                            var = new JSFMValues(type, expr.eval().intValue(), isFinal);
                                            toBeReturned = var;
                                            symbolTable.put(varName, var);
                                            error = false;
                                            break;
                                        case "coke":
                                            var = new JSFMValues(type, expr.eval().floatValue(), isFinal);
                                            symbolTable.put(varName, var);
                                            toBeReturned = var;
                                            error = false;
                                            break;
                                    }
                                }catch(Exception e){
                                    String v = e.getMessage().split("Unknown operator or function: ")[1];
                                    JSFMValues temp;
                                    if(symbolTable.containsKey(v)){
                                        temp = symbolTable.get(v);
                                        if(!temp.isEmpty()){
                                            switch (temp.getObjectType()){
                                                case "techies":
                                                    expr.setVariable(v, BigDecimal.valueOf(temp.getIntValue()));
                                                    break;
                                                case "coke":
                                                    expr.setVariable(v, BigDecimal.valueOf(temp.getFloatValue()));
                                                    break;
                                                case "thread":
                                                    expr.setVariable(v, temp.getStringValue());
                                                    break;
                                                case "kachow":
                                                    expr.setVariable(v, BigDecimal.valueOf((int) temp.getCharValue()));
                                                    break;
                                                case "boolin":
                                                    if(temp.getBoolValue()) {
                                                        expr.setVariable(v, BigDecimal.valueOf(1));
                                                    }else{
                                                        expr.setVariable(v, BigDecimal.valueOf(0));
                                                    }
                                                    break;
                                                default: TestScanner.outputTextArea.append("ERROR - Variable " + v + " is not a variable.\n");
                                                    error = false;
                                            }
                                        }
                                    }
                                }
                            }

                        } else {
                            JSFMValues var;
                            varName = varName.replace("[]", "");
                            switch (type) {
                                case "techies":
                                    var = new JSFMValues(type, true, varValue, isFinal);
                                    toBeReturned = var;
                                    symbolTable.put(varName, var);
                                    break;
                                case "coke":
                                    var = new JSFMValues(type, true, varValue, isFinal);
                                    symbolTable.put(varName, var);
                                    toBeReturned = var;
                                    break;
                            }
                        }
                    } else if(type.equals("boolin") || type.equals("thread") || type.equals("kachow")){
                        if(!varName.contains("[]")) { //not an array
                            JSFMValues var;
                            switch (type) {
                                case "boolin":
                                    if (varValue.equals("true")) {
                                        var = new JSFMValues(type, true, isFinal);
                                        symbolTable.put(varName, var);
                                        toBeReturned = var;
                                    } else if (varValue.equals("false")) {
                                        var = new JSFMValues(type, false, isFinal);
                                        symbolTable.put(varName, var);
                                        toBeReturned = var;
                                    } else{ //identifier
                                        if(symbolTable.containsKey(varValue)){
                                            JSFMValues temp = symbolTable.get(varValue);
                                            if(!temp.isEmpty()){
                                                if(temp.getObjectType().equals("boolin")){
                                                    var = new JSFMValues(type, temp.getBoolValue(), isFinal);
                                                    symbolTable.put(varName, var);
                                                    toBeReturned = var;
                                                }else{
                                                    TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() +
                                                            " - " + varName + " only accepts boolin values. " + varValue +
                                                            " is a " + temp.getObjectType() + "\n");
                                                }
                                            }else{
                                                TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine()+
                                                        " - Variable " + varValue + " has not been initialized. " +
                                                        "Please initialize it first.\n");
                                            }
                                        }else{
                                            TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() +
                                                    " - Variable " + varValue + " does not exist. Please declare and " +
                                                    "initialize it first.\n");
                                        }
                                    }
                                    break;
                                case "thread":
                                    String str = "";
                                    if(varValue.contains("+")){
                                        String[] res = varValue.split("\\+");
                                        for(int x=0; x< res.length; x++){
                                            if(res[x].charAt(0) == '\"' && res[x].charAt(res[x].length()-1) == '\"'){
                                                str += res[x].substring(1, res[x].length()-1);
                                            }else{ //identifier
                                                try{
                                                    Float f = Float.parseFloat(res[x]);
                                                    str += res[x];
                                                }catch(NumberFormatException e){
                                                    if(symbolTable.containsKey(res[x])){
                                                        JSFMValues temp2 = symbolTable.get(res[x]);
                                                        if(!temp2.isEmpty()){
                                                            switch(temp2.getObjectType()){
                                                                case "techies":
                                                                    str += temp2.getIntValue();
                                                                    break;
                                                                case "coke":
                                                                    str += temp2.getFloatValue();
                                                                    break;
                                                                case "thread":
                                                                    str += temp2.getStringValue();
                                                                    break;
                                                                case "kachow":
                                                                    str += temp2.getCharValue();
                                                                    break;
                                                                case "boolin":
                                                                    str += temp2.getBoolValue();
                                                                    break;
                                                                default: TestScanner.outputTextArea.append("ERROR - " + res[x] + " is not a variable.\n");
                                                            }
                                                        }else{
                                                            TestScanner.outputTextArea.append("ERROR - Variable " + res[x] + " is not initialized. " +
                                                                    "Please initialize it first.\n");
                                                        }
                                                    }else{
                                                        TestScanner.outputTextArea.append("ERROR - Variable " + res[x] + " does not exist. " +
                                                                "Please declare and initialize it first.\n");
                                                    }
                                                }

                                            }
                                        }
                                        var = new JSFMValues(type, str, isFinal);
                                        symbolTable.put(varName, var);
                                        toBeReturned = var;

                                    }else{
                                        if(varValue.charAt(0) == '\"' && varValue.charAt(varValue.length()-1) == '\"'){
                                            str = varValue.substring(1, varValue.length()-1);
                                        }else{
                                            if(symbolTable.containsKey(varValue)){
                                                JSFMValues temp2 = symbolTable.get(varValue);
                                                if(!temp2.isEmpty()){
                                                    switch(temp2.getObjectType()){
                                                        case "techies":
                                                            str += temp2.getIntValue();
                                                            break;
                                                        case "coke":
                                                            str += temp2.getFloatValue();
                                                            break;
                                                        case "thread":
                                                            str += temp2.getStringValue();
                                                            break;
                                                        case "kachow":
                                                            str += temp2.getCharValue();
                                                            break;
                                                        case "boolin":
                                                            str += temp2.getBoolValue();
                                                            break;
                                                        default: TestScanner.outputTextArea.append("ERROR - " + varValue + " is not a variable.\n");
                                                    }
                                                }else{
                                                    TestScanner.outputTextArea.append("ERROR - Variable " + varValue + " is not initialized. " +
                                                            "Please initialize it first.\n");
                                                }
                                            }else{
                                                TestScanner.outputTextArea.append("ERROR - Variable " + varValue + " does not exist. " +
                                                        "Please declare and initialize it first.\n");
                                            }
                                        }
                                        var = new JSFMValues(type, str, isFinal);
                                        symbolTable.put(varName, var);
                                        toBeReturned = var;

                                    }

                                    break;
                                case "kachow":
                                    if(varValue.length() == 3 && varValue.charAt(0) == '\'' && varValue.charAt(2) == '\''){
                                        var = new JSFMValues(type, varValue.charAt(1), isFinal);
                                        symbolTable.put(varName, var);
                                        toBeReturned = var;
                                    }else if(varValue.contains("+")){
                                        int total = 0;
                                        String[] res = varValue.split("\\+");
                                        for(int x=0; x< res.length; x++){
                                            if(res[x].length() == 3 && res[x].charAt(0) == '\'' && res[x].charAt(2) == '\''){
                                                total = total + (int) res[x].charAt(1);
                                            }else{
                                                try{ // number
                                                    int test = Integer.parseInt(res[x]);
                                                    total += test;
                                                }catch(NumberFormatException e){ //identifier
                                                    if(symbolTable.containsKey(res[x])){
                                                        JSFMValues temp = symbolTable.get(res[x]);
                                                        if(!temp.isEmpty()){
                                                            if(temp.getObjectType().equals("kachow")){
                                                                total = total + (int) temp.getCharValue();
                                                            }else if(temp.getObjectType().equals("techies")){
                                                                total += temp.getIntValue();
                                                            }else{
                                                                TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() +
                                                                        " - " + varName + " only accepts kachow values. " + res[x] + " is" +
                                                                        " a " + temp.getObjectType() + ".\n");
                                                            }
                                                        }else{
                                                            TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() + " - " +
                                                                    "Variable " + res[x] + " has not been initialized. Please initialize it first.\n");
                                                        }
                                                    }else{
                                                        TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() + " - " +
                                                                "Variable " + res[x] + " does not exist. Please declare and initialize " +
                                                                "it first.\n");
                                                    }
                                                }
                                            }
                                        }
                                        var = new JSFMValues(type, (char) total, isFinal);
                                        symbolTable.put(varName, var);
                                        toBeReturned = var;
                                    }else{//identifier or number
                                        try{ // number
                                            int test = Integer.parseInt(varValue);
                                            var = new JSFMValues(type, (char) test, isFinal);
                                            symbolTable.put(varName, var);
                                            toBeReturned = var;
                                        }catch(NumberFormatException e){ //identifier
                                            if(symbolTable.containsKey(varValue)){
                                                JSFMValues temp = symbolTable.get(varValue);
                                                if(!temp.isEmpty()){
                                                    if(temp.getObjectType().equals("kachow")){
                                                        var = new JSFMValues(type, temp.getCharValue(), isFinal);
                                                        symbolTable.put(varName, var);
                                                        toBeReturned = var;
                                                    }else if(temp.getObjectType().equals("techies")){
                                                        var = new JSFMValues(type, (char) temp.getIntValue(), isFinal);
                                                        symbolTable.put(varName, var);
                                                        toBeReturned = var;
                                                    }else{
                                                        TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() +
                                                                " - " + varName + " only accepts kachow values. " + varValue + " is" +
                                                                " a " + temp.getObjectType() + ".\n");
                                                    }
                                                }else{
                                                    TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() + " - " +
                                                            "Variable " + varValue + " has not been initialized. Please initialize it first.\n");
                                                }
                                            }else{
                                                TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() + " - " +
                                                        "Variable " + varValue + " does not exist. Please declare and initialize " +
                                                        "it first.\n");
                                            }
                                        }
                                    }

                                    break;
                            }
                        } else {
                            JSFMValues var;
                            switch (type) {
                                case "boolin":
                                    var = new JSFMValues(type, true, varValue, isFinal);
                                    symbolTable.put(varName, var);
                                    toBeReturned = var;
                                    break;
                                case "thread":
                                case "kachow":
                                    var = new JSFMValues(type, true, varValue.replaceAll("\"", "").replaceAll("\'", ""), isFinal);
                                    symbolTable.put(varName, var);
                                    toBeReturned = var;
                                    break;
//                                    var = new JSFMValues(type, true, varValue, isFinal);
//                                    symbolTable.put(varName, var);
//                                    toBeReturned = var;
//                                    break;
                            }
                        }
                    }
                }else{ //no value
                    if(!varName.contains("[]")) { // not an array
                        varName = varName.replace("[]", "");
                        JSFMValues var = new JSFMValues(type, isFinal);
                        symbolTable.put(varName, var);
                        toBeReturned = var;
                    } else {
                        varName = varName.replace("[]", "");
                        JSFMValues var = new JSFMValues(true, type, isFinal);
                        symbolTable.put(varName, var);
                        toBeReturned = var;
                    }
                }
            }else{
                TestScanner.outputTextArea.append("ERROR - Variable " + varName + " has already been declared. " +
                        "Please check your declared variables or make this into an assignment statement.\n");
            }


        }


        return toBeReturned;
    }


    @Override
    public Object visitBlockStmt(JSFMParser.BlockStmtContext ctx) { return visitChildren(ctx); }

    @Override
    public Object visitIfElseStmt(JSFMParser.IfElseStmtContext ctx) {

        Expression expr = new Expression(ctx.parExpression().expression().getText());
        BigDecimal res = null;
        boolean error = true;
        while(error){
            try{
                res = expr.eval();
                error = false;
            }catch(Exception e){
                String var = e.getMessage().split("Unknown operator or function: ")[1];
                JSFMValues temp;
                if(symbolTable.containsKey(var)){
                    temp = symbolTable.get(var);
                    if(!temp.isEmpty()){
                        switch (temp.getObjectType()){
                            case "techies":
                                expr.setVariable(var, BigDecimal.valueOf(temp.getIntValue()));
                                break;
                            case "coke":
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
                            default: TestScanner.outputTextArea.append("ERROR - Line "+ ctx.start.getLine() + " - Variable " +
                                    var + " is not a variable.\n");
                                error = false;
                        }
                    }
                }
            }
        }

        if(res != null){
            if(res == BigDecimal.valueOf(1)){
                return this.visit(ctx.statement(0));
            }else{
                if(ctx.ELSE()!= null){
                    return this.visit(ctx.statement(1));
                }
            }
        }

        return null;
    }

    @Override
    public Object visitForLoopStmt(JSFMParser.ForLoopStmtContext ctx) {
        Hashtable<String, JSFMValues> tempTable = new Hashtable<String, JSFMValues>();
        JSFMValues localVar;
        System.out.println("IN FOR LOOP STMT");
        String itrVal = "";
        String maxVal = "";
        String condition = ctx.forControl().expression().getText();

        if(ctx.forControl().forInit().localVariableDeclaration() != null) {
            System.out.println("Potato");
            String vName = ctx.forControl().forInit().localVariableDeclaration().variableDeclarators()
                    .variableDeclarator(0).variableDeclaratorId().getText();
            if(!symbolTable.containsKey(vName)){
                String type = ctx.forControl().forInit().localVariableDeclaration().typeType().getText();

                if(type.equalsIgnoreCase("techies") || type.equalsIgnoreCase("coke")) {
                    localVar = (JSFMValues) this.visit(ctx.forControl().forInit().localVariableDeclaration());
                    tempTable.put(vName, localVar);
                    itrVal = ctx.forControl().forInit().localVariableDeclaration().variableDeclarators().variableDeclarator(0).variableInitializer().getText();
                    maxVal = ctx.children.get(2).getChild(2).getChild(2).getText(); //max value IF only one condition

                    Expression expr = new Expression(condition);
                    BigDecimal res = null;
                    boolean error = true;
                    boolean loopTrue = true;
                    while(error){
                        try{
                            while(loopTrue){
                                res = expr.eval();
                                if(res != null){
                                    if(res == BigDecimal.valueOf(1)){
                                        this.visit(ctx.statement());
                                        if(ctx.forControl().prepostFix() != null){
                                            this.visit(ctx.forControl().prepostFix());
                                            expr = new Expression(condition);
                                        }else if(ctx.forControl().expressionList() != null){
                                            this.visit(ctx.forControl().expressionList());
                                            expr = new Expression(condition);
                                        }
                                    }else{
                                        loopTrue = false;
                                        error = false;
                                    }
                                }
                            }

                        }catch(Exception e){
                            String var = e.getMessage().split("Unknown operator or function: ")[1];
                            JSFMValues temp;
                            if(symbolTable.containsKey(var)){
                                temp = symbolTable.get(var);
                                if(!temp.isEmpty()){
                                    switch (temp.getObjectType()){
                                        case "techies":
                                            expr.setVariable(var, BigDecimal.valueOf(temp.getIntValue()));
                                            break;
                                        case "coke":
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
                                        default: TestScanner.outputTextArea.append("ERROR - Line "+ ctx.start.getLine() + " - Variable " +
                                                var + " is not a variable.\n");
                                            error = false;
                                    }
                                }
                            }
                        }
                    }
                    Enumeration e = tempTable.keys();

                    while(e.hasMoreElements()){
                        String key = (String) e.nextElement();
                        if(symbolTable.containsKey(key)){
                            symbolTable.remove(key);
                        }
                    }
                } else {
                    System.out.println("ERROR - Line "+ ctx.start.getLine() +" - Only techies and coke are allowed.");
                }

            }

        } else {
            System.out.println("Banana");
            boolean nonNumeric = false;
            itrVal = ctx.forControl().forInit().expressionList().expression(0).getChild(ctx.forControl().forInit().expressionList().expression(0).getChildCount() - 1).getText(); //value of iterator
            maxVal = ctx.forControl().expression().getChild(ctx.forControl().expression().getChildCount() - 1).getText(); //max value IF only one condition

            try{
                int temp = Integer.parseInt(itrVal);
                temp = Integer.parseInt(maxVal);

                float temp2 = Float.parseFloat(itrVal);
                temp2 = Float.parseFloat(maxVal);
            }catch(NumberFormatException e){
                System.out.println("ERROR - Line " + ctx.start.getLine() + " - Non Numeric Value.");
                nonNumeric = true;
            }

            if(!nonNumeric){
            }
        }


        return null;
    }

    @Override
    public Object visitWhileLoopStmt(JSFMParser.WhileLoopStmtContext ctx) {
        String condition = ctx.parExpression().expression().getText();

        Expression expr = new Expression(condition);
        BigDecimal res = null;
        boolean error = true;
        boolean whileTrue = true;
        while(error){
            try{
                while(whileTrue){
                    res = expr.eval();
                    if(res != null){
                        if(res == BigDecimal.valueOf(1)){
                            this.visit(ctx.statement());
                            expr = new Expression(condition);
                        }else if(res == BigDecimal.valueOf(0)){
                            whileTrue = false;
                            error = false;
                        }
                    }
                }
            }catch(Exception e){
                String var = e.getMessage().split("Unknown operator or function: ")[1];
                JSFMValues temp;
                if(symbolTable.containsKey(var)){
                    temp = symbolTable.get(var);
                    if(!temp.isEmpty()){
                        switch (temp.getObjectType()){
                            case "techies":
                                expr.setVariable(var, BigDecimal.valueOf(temp.getIntValue()));
                                break;
                            case "coke":
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
                            default: TestScanner.outputTextArea.append("ERROR - Line "+ ctx.start.getLine() + " - Variable " +
                                    var + " is not a variable.\n");
                                error = false;
                        }
                    }
                }
            }

        }

        return null;
    }

    @Override
    public Object visitDoWhileLoopStmt(JSFMParser.DoWhileLoopStmtContext ctx) {
        String condition = ctx.parExpression().expression().getText();

        Expression expr = new Expression(condition);
        BigDecimal res = null;
        boolean error = true;
        boolean whileTrue = true;
        this.visit(ctx.statement());
        while(error){
            try{
                while(whileTrue){
                    res = expr.eval();
                    if(res != null){
                        if(res == BigDecimal.valueOf(1)){
                            this.visit(ctx.statement());
                            expr = new Expression(condition);
                        }else if(res == BigDecimal.valueOf(0)){
                            whileTrue = false;
                            error = false;
                        }
                    }
                }
            }catch(Exception e){
                String var = e.getMessage().split("Unknown operator or function: ")[1];
                JSFMValues temp;
                if(symbolTable.containsKey(var)){
                    temp = symbolTable.get(var);
                    if(!temp.isEmpty()){
                        switch (temp.getObjectType()){
                            case "techies":
                                expr.setVariable(var, BigDecimal.valueOf(temp.getIntValue()));
                                break;
                            case "coke":
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
                            default: TestScanner.outputTextArea.append("ERROR - Line "+ ctx.start.getLine() + " - Variable " +
                                    var + " is not a variable.\n");
                                error = false;
                        }
                    }
                }
            }

        }
        return null;
    }

    @Override
    public Object visitSwitchStmt(JSFMParser.SwitchStmtContext ctx) { return visitChildren(ctx); }

    @Override
    public Object visitReturnStmt(JSFMParser.ReturnStmtContext ctx) { return visitChildren(ctx); }

    @Override
    public Object visitBreakStmt(JSFMParser.BreakStmtContext ctx) { return visitChildren(ctx); }

    @Override
    public Object visitExprStmt(JSFMParser.ExprStmtContext ctx) {
        System.out.println("INSIDE EXPR STMT");
        if(ctx.expression().expression()!= null && ctx.expression().bop != null){
            System.out.println("Hello?");
            String vName = ctx.expression().expression(0).getText();
            String assign = ctx.expression().bop.getText();
            if(symbolTable.containsKey(vName)){
                JSFMValues temp = symbolTable.get(vName);
                if(!temp.isFinal() || (temp.isFinal() && temp.isEmpty())){
                    Expression expr = new Expression(ctx.expression().expression(1).getText());
                    if(temp.getObjectType().equals("techies") || temp.getObjectType().equals("coke")
                    ||  temp.getObjectType().equals("boolin")){
                        boolean error = true;
                        BigDecimal res = null;
                        while(error){
                            try{
                                res = expr.eval();
                                error = false;
                            }catch(Exception e){
                                String var = e.getMessage().split("Unknown operator or function: ")[1];
                                JSFMValues temp2;
                                if(symbolTable.containsKey(var)){
                                    temp2 = symbolTable.get(var);
                                    if(!temp2.isEmpty()){
                                        switch (temp2.getObjectType()){
                                            case "techies":
                                                expr.setVariable(var, BigDecimal.valueOf(temp2.getIntValue()));
                                                break;
                                            case "coke":
                                                expr.setVariable(var, BigDecimal.valueOf(temp2.getFloatValue()));
                                                break;
                                            case "thread":
                                                expr.setVariable(var, temp2.getStringValue());
                                                break;
                                            case "kachow":
                                                expr.setVariable(var, BigDecimal.valueOf((int) temp2.getCharValue()));
                                                break;
                                            case "boolin":
                                                if(temp2.getBoolValue()) {
                                                    expr.setVariable(var, BigDecimal.valueOf(1));
                                                }else{
                                                    expr.setVariable(var, BigDecimal.valueOf(0));
                                                }
                                                break;
                                            default: TestScanner.outputTextArea.append("ERROR - Variable " + var + " is not a variable.\n");
                                            error = false;
                                        }
                                    }
                                }
                            }
                        }
                        if(res != null){
                            switch (assign){
                                case "=":
                                    if(temp.getObjectType().equals("techies")){
                                        temp.setIntValue(res.intValue());
                                    }else if(temp.getObjectType().equals("coke")){
                                        temp.setFloatValue(res.floatValue());
                                    }else if(temp.getObjectType().equals("boolin")){
                                        if(res == BigDecimal.valueOf(0)){
                                            temp.setBoolValue(false);
                                        }else{
                                            temp.setBoolValue(true);
                                        }
                                    }
                                    break;
                                case "+=":
                                    if(!temp.isEmpty()){
                                        if(temp.getObjectType().equals("techies")){
                                            temp.setIntValue(temp.getIntValue() + res.intValue());
                                        }else if(temp.getObjectType().equals("coke")){
                                            temp.setFloatValue(temp.getFloatValue() + res.floatValue());
                                        }else if(temp.getObjectType().equals("boolin")){
                                            TestScanner.outputTextArea.append("ERROR - Variable type boolin cannot use the += operator.\n");
                                        }
                                    }else{
                                        TestScanner.outputTextArea.append("ERROR - Variable " + vName + " is not initialized. " +
                                                "Please initialize it first.\n");
                                    }

                                    break;
                                case "-=":
                                    if(!temp.isEmpty()){
                                        if(temp.getObjectType().equals("techies")){
                                            temp.setIntValue(temp.getIntValue() - res.intValue());
                                        }else if(temp.getObjectType().equals("coke")){
                                            temp.setFloatValue(temp.getFloatValue() - res.floatValue());
                                        }else if(temp.getObjectType().equals("boolin")){
                                            TestScanner.outputTextArea.append("ERROR - Variable type boolin cannot use the -= operator.\n");
                                        }
                                    }else{
                                        TestScanner.outputTextArea.append("ERROR - Variable " + vName + " is not initialized. " +
                                                "Please initialize it first.\n");
                                    }
                                    break;
                                case "*=":
                                    if(!temp.isEmpty()){
                                        if(temp.getObjectType().equals("techies")){
                                            temp.setIntValue(temp.getIntValue() * res.intValue());
                                        }else if(temp.getObjectType().equals("coke")){
                                            temp.setFloatValue(temp.getFloatValue() * res.floatValue());
                                        }else if(temp.getObjectType().equals("boolin")){
                                            TestScanner.outputTextArea.append("ERROR - Variable type boolin cannot use the *= operator.\n");
                                        }
                                    }else{
                                        TestScanner.outputTextArea.append("ERROR - Variable " + vName + " is not initialized. " +
                                                "Please initialize it first.\n");
                                    }
                                    break;
                                case "/=":
                                    if(!temp.isEmpty()){
                                        if(temp.getObjectType().equals("techies")){
                                            temp.setIntValue(temp.getIntValue() / res.intValue());
                                        }else if(temp.getObjectType().equals("coke")){
                                            temp.setFloatValue(temp.getFloatValue() / res.floatValue());
                                        }else if(temp.getObjectType().equals("boolin")){
                                            TestScanner.outputTextArea.append("ERROR - Variable type boolin cannot use the /= operator.\n");
                                        }
                                    }else{
                                        TestScanner.outputTextArea.append("ERROR - Variable " + vName + " is not initialized. " +
                                                "Please initialize it first.\n");
                                    }
                                    break;
                            }
                            symbolTable.put(vName, temp);
                        }
                    }else if(temp.getObjectType().equals("kachow")){
                        String val = ctx.expression().expression(1).getText();
                        int test = -999;
                        if(val.length() == 3 && val.charAt(0) == '\'' && val.charAt(2) == '\''){
                            switch (assign){
                                case "=":
                                    temp.setCharValue(val.charAt(1));
                                    break;
                                case "+=":
                                    if(!temp.isEmpty()){
                                        temp.setCharValue((char)((int)temp.getCharValue() + (int)val.charAt(1)));
                                    }else{
                                        TestScanner.outputTextArea.append("ERROR - Variable " + vName + " is not initialized. " +
                                                "Please initialize it first.\n");
                                    }
                                    break;
                                case "-=":
                                    if(!temp.isEmpty()){
                                        temp.setCharValue((char)((int)temp.getCharValue() - (int)val.charAt(1)));
                                    }else{
                                        TestScanner.outputTextArea.append("ERROR - Variable " + vName + " is not initialized. " +
                                            "Please initialize it first.\n");
                                    }                                    break;
                                case "*=":
                                    if(!temp.isEmpty()){
                                        temp.setCharValue((char)((int)temp.getCharValue() * (int)val.charAt(1)));
                                    }else{
                                        TestScanner.outputTextArea.append("ERROR - Variable " + vName + " is not initialized. " +
                                                "Please initialize it first.\n");
                                    }
                                    break;
                                case "/=":
                                    if(!temp.isEmpty()){
                                        temp.setCharValue((char)((int)temp.getCharValue() / (int)val.charAt(1)));
                                    }else{
                                        TestScanner.outputTextArea.append("ERROR - Variable " + vName + " is not initialized. " +
                                                "Please initialize it first.\n");
                                    }
                                    break;
                            }
                            symbolTable.put(vName, temp);
                        }else{
                            try{ //not an identifier
                                test = Integer.parseInt(val);

                                switch (assign){
                                    case "=":
                                        temp.setCharValue((char) test);
                                        break;
                                    case "+=":
                                        if(!temp.isEmpty()){
                                            temp.setCharValue((char)((int)temp.getCharValue() + test));
                                        }else{
                                            TestScanner.outputTextArea.append("ERROR - Variable " + vName + " is not initialized. " +
                                                    "Please initialize it first.\n");
                                        }
                                        break;
                                    case "-=":
                                        if(!temp.isEmpty()){
                                            temp.setCharValue((char)((int)temp.getCharValue() - test));
                                        }else{
                                            TestScanner.outputTextArea.append("ERROR - Variable " + vName + " is not initialized. " +
                                                    "Please initialize it first.\n");
                                        }                                    break;
                                    case "*=":
                                        if(!temp.isEmpty()){
                                            temp.setCharValue((char)((int)temp.getCharValue() * test));
                                        }else{
                                            TestScanner.outputTextArea.append("ERROR - Variable " + vName + " is not initialized. " +
                                                    "Please initialize it first.\n");
                                        }
                                        break;
                                    case "/=":
                                        if(!temp.isEmpty()){
                                            temp.setCharValue((char)((int)temp.getCharValue() / test));
                                        }else{
                                            TestScanner.outputTextArea.append("ERROR - Variable " + vName + " is not initialized. " +
                                                    "Please initialize it first.\n");
                                        }
                                        break;
                                }
                            }catch(NumberFormatException e){
                                if(symbolTable.containsKey(val)){
                                    JSFMValues temp2 = symbolTable.get(val);
                                    if(!temp2.isEmpty()){
                                        switch (assign){
                                            case "=":
                                                if(temp2.getObjectType().equals("kachow")){
                                                    temp.setCharValue(temp2.getCharValue());
                                                }else if(temp2.getObjectType().equals("techies")){
                                                    temp.setCharValue((char) temp2.getIntValue());
                                                }else{
                                                    TestScanner.outputTextArea.append("ERROR - Cannot assign variable type "
                                                            + temp2.getObjectType() + " to kachow.\n");
                                                }
                                                break;
                                            case "+=":
                                                if(!temp.isEmpty()){
                                                    if(temp2.getObjectType().equals("kachow")){
                                                        temp.setCharValue((char)((int) temp.getCharValue() + (int)temp2.getCharValue()));
                                                    }else if(temp2.getObjectType().equals("techies")){
                                                        temp.setCharValue((char)((int) temp.getCharValue() + temp2.getIntValue()));
                                                    }else{
                                                        TestScanner.outputTextArea.append("ERROR - Cannot add variable type "
                                                                + temp2.getObjectType() + " to kachow.\n");
                                                    }
                                                }else{
                                                    TestScanner.outputTextArea.append("ERROR - Variable " + vName + " is not initialized. " +
                                                            "Please initialize it first.\n");
                                                }
                                                break;
                                            case "-=":
                                                if(!temp.isEmpty()){
                                                    if(temp2.getObjectType().equals("kachow")){
                                                        temp.setCharValue((char)((int) temp.getCharValue() - (int)temp2.getCharValue()));
                                                    }else if(temp2.getObjectType().equals("techies")){
                                                        temp.setCharValue((char)((int) temp.getCharValue() - temp2.getIntValue()));
                                                    }else{
                                                        TestScanner.outputTextArea.append("ERROR - Cannot subtract variable type "
                                                                + temp2.getObjectType() + " from kachow.\n");
                                                    }
                                                }else{
                                                    TestScanner.outputTextArea.append("ERROR - Variable " + vName + " is not initialized. " +
                                                            "Please initialize it first.\n");
                                                }
                                                break;
                                            case "*=":
                                                if(!temp.isEmpty()){
                                                    if(temp2.getObjectType().equals("kachow")){
                                                        temp.setCharValue((char)((int) temp.getCharValue() * (int)temp2.getCharValue()));
                                                    }else if(temp2.getObjectType().equals("techies")){
                                                        temp.setCharValue((char)((int) temp.getCharValue() * temp2.getIntValue()));
                                                    }else{
                                                        TestScanner.outputTextArea.append("ERROR - Cannot multiply variable type "
                                                                + temp2.getObjectType() + " to kachow.\n");
                                                    }
                                                }else{
                                                    TestScanner.outputTextArea.append("ERROR - Variable " + vName + " is not initialized. " +
                                                            "Please initialize it first.\n");
                                                }
                                                break;
                                            case "/=":
                                                if(!temp.isEmpty()){
                                                    if(temp2.getObjectType().equals("kachow")){
                                                        temp.setCharValue((char)((int) temp.getCharValue() / (int)temp2.getCharValue()));
                                                    }else if(temp2.getObjectType().equals("techies")){
                                                        temp.setCharValue((char)((int) temp.getCharValue() / temp2.getIntValue()));
                                                    }else{
                                                        TestScanner.outputTextArea.append("ERROR - Cannot divide variable type "
                                                                + temp2.getObjectType() + " with kachow.\n");
                                                    }
                                                }else{
                                                    TestScanner.outputTextArea.append("ERROR - Variable " + vName + " is not initialized. " +
                                                            "Please initialize it first.\n");
                                                }
                                                break;
                                        }
                                    }else{
                                        TestScanner.outputTextArea.append("ERROR - Variable " + val + " is not initialized. " +
                                                "Please initialize it first.\n");
                                    }
                                }else{
                                    TestScanner.outputTextArea.append("ERROR - Variable " + val + " does not exist. " +
                                            "Please declare and initialize it first.\n");
                                }
                            }
                            symbolTable.put(vName, temp);
                        }
                    }else if(temp.getObjectType().equals("thread")){
                        String val = ctx.expression().expression(1).getText();
                        String str = "";
                        if(val.contains("+")){
                            String[] res = val.split("\\+");
                            for(int i=0; i< res.length; i++){
                                if(res[i].charAt(0) == '\"' && res[i].charAt(res[i].length()-1) == '\"'){
                                    str += res[i].substring(1, res[i].length()-1);
                                }else{ //identifier
                                    try{
                                        Float f = Float.parseFloat(res[i]);
                                        str += res[i];
//                                        if(f % 1 == 0){
//                                            str += f.intValue();
//                                        }else{
//                                            str += f;
//                                        }
                                    }catch(NumberFormatException e){
                                        if(symbolTable.containsKey(res[i])){
                                            JSFMValues temp2 = symbolTable.get(res[i]);
                                            if(!temp2.isEmpty()){
                                                switch(temp2.getObjectType()){
                                                    case "techies":
                                                        str += temp2.getIntValue();
                                                        break;
                                                    case "coke":
                                                        str += temp2.getFloatValue();
                                                        break;
                                                    case "thread":
                                                        str += temp2.getStringValue();
                                                        break;
                                                    case "kachow":
                                                        str += temp2.getCharValue();
                                                        break;
                                                    case "boolin":
                                                        str += temp2.getBoolValue();
                                                        break;
                                                    default: TestScanner.outputTextArea.append("ERROR - " + res[i] + " is not a variable.\n");
                                                }
                                            }else{
                                                TestScanner.outputTextArea.append("ERROR - Variable " + res[i] + " is not initialized. " +
                                                        "Please initialize it first.\n");
                                            }
                                        }else{
                                            TestScanner.outputTextArea.append("ERROR - Variable " + res[i] + " does not exist. " +
                                                    "Please declare and initialize it first.\n");
                                        }
                                    }

                                }
                            }
                            if(assign.equals("=")){
                                temp.setStringValue(str);
                                symbolTable.put(vName, temp);
                            }else if(assign.equals("+=")){
                                temp.setStringValue(temp.getStringValue().concat(str));
                                symbolTable.put(vName, temp);
                            }else{
                                TestScanner.outputTextArea.append("ERROR - Cannot use the " + assign + " operator on thread values.\n");
                            }
                        }else{
                            if(val.charAt(0) == '\"' && val.charAt(val.length()-1) == '\"'){
                                str = val.substring(1, val.length()-1);
                            }else{
                                if(symbolTable.containsKey(val)){
                                    JSFMValues temp2 = symbolTable.get(val);
                                    if(!temp2.isEmpty()){
                                        switch(temp2.getObjectType()){
                                            case "techies":
                                                str += temp2.getIntValue();
                                                break;
                                            case "coke":
                                                str += temp2.getFloatValue();
                                                break;
                                            case "thread":
                                                str += temp2.getStringValue();
                                                break;
                                            case "kachow":
                                                str += temp2.getCharValue();
                                                break;
                                            case "boolin":
                                                str += temp2.getBoolValue();
                                                break;
                                            default: TestScanner.outputTextArea.append("ERROR - " + val + " is not a variable.\n");
                                        }
                                    }else{
                                        TestScanner.outputTextArea.append("ERROR - Variable " + val + " is not initialized. " +
                                                "Please initialize it first.\n");
                                    }
                                }else{
                                    TestScanner.outputTextArea.append("ERROR - Variable " + val + " does not exist. " +
                                            "Please declare and initialize it first.\n");
                                }
                            }

                            if(assign.equals("=")){
                                temp.setStringValue(str);
                                symbolTable.put(vName, temp);
                            }else if(assign.equals("+=")){
                                temp.setStringValue(temp.getStringValue().concat(str));
                                symbolTable.put(vName, temp);
                            }else{
                                TestScanner.outputTextArea.append("ERROR - Cannot use the " + assign + " operator on thread values.\n");
                            }

                        }
                    }

                }
            }else{
                TestScanner.outputTextArea.append("ERROR - Variable " + vName + " does not exist. " +
                        "Please declare and initialize it first.\n");
            }
            Expression expr  = new Expression(ctx.expression().expression(1).getText());
        }

        System.out.println("EXITING EXPR STMT");
        return visitChildren(ctx);
    }

    @Override
    public Object visitIdentifierStmt(JSFMParser.IdentifierStmtContext ctx) { return visitChildren(ctx); }

    @Override
    public Object visitOutputStmt(JSFMParser.OutputStmtContext ctx) { return visitChildren(ctx); }

    @Override public Object visitInputStmt(JSFMParser.InputStmtContext ctx) { return visitChildren(ctx); }
    

    @Override
    public Object visitSwitchBlockStatementGroup(JSFMParser.SwitchBlockStatementGroupContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitSwitchLabel(JSFMParser.SwitchLabelContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitForControl(JSFMParser.ForControlContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitForInit(JSFMParser.ForInitContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitEnhancedForControl(JSFMParser.EnhancedForControlContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitParExpression(JSFMParser.ParExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpressionList(JSFMParser.ExpressionListContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitMethodCall(JSFMParser.MethodCallContext ctx) {
        String mName = ctx.IDENTIFIER().getText();

        if(functionTable.containsKey(mName)){
            JSFMFunction func = functionTable.get(mName);
            if(ctx.expressionList() != null && func.getParameters().formalParameterList() != null){ //not void
                if(ctx.expressionList().expression().size() == func.getParameters().formalParameterList().formalParameter().size()){
                    JSFMParser.FormalParameterListContext list = func.getParameters().formalParameterList();
                    Hashtable<String, JSFMValues> tempTable = new Hashtable<String, JSFMValues>();
                    if(!scopeStack.empty()){
                        tempTable.putAll(scopeStack.peek());
                    }
                    for(int i=0; i< list.formalParameter().size(); i++){
                        JSFMParser.FormalParameterContext param = list.formalParameter(i);
                        JSFMParser.ExpressionContext expr = ctx.expressionList().expression(i);
                        Object temp = this.visit(expr);
                        boolean isFinal = false;

                        if(param.variableModifier()!= null){
                            isFinal = true;
                        }
                        String type = "";
                        switch(param.typeType().getText()){
                            case "techies": type = "techies";
                                tempTable.put(param.variableDeclaratorId().getText(), new JSFMValues(type, (int)temp, isFinal));
                            break;
                            case "coke": type = "coke";
                                tempTable.put(param.variableDeclaratorId().getText(), new JSFMValues(type, (float)temp, isFinal));
                            break;
                            case "thread": type = "thread";
                                tempTable.put(param.variableDeclaratorId().getText(), new JSFMValues(type, (String)temp, isFinal));
                            break;
                            case "kachow": type = "kachow";
                                tempTable.put(param.variableDeclaratorId().getText(), new JSFMValues(type, (char)temp, isFinal));
                            break;
                            case "boolin" : type ="boolin";
                                tempTable.put(param.variableDeclaratorId().getText(), new JSFMValues(type, (boolean)temp, isFinal));
                            break;
                            default: TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() + " - Only "
                            + "variable types techies, coke, thread, kachow, and boolin are allowed as parameters.\n");
                        }

                    }
                    scopeStack.push(tempTable);
                    return this.visit(func.getActions());
                }else{
                    TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() + " - ");
                    if(ctx.expressionList().expression().size() > func.getParameters().formalParameterList().formalParameter().size()){
                        TestScanner.outputTextArea.append(" Extra parameter call.\n");
                    }else{
                        TestScanner.outputTextArea.append(" Missing parameter call.\n");
                    }
                }
            }else if(ctx.expressionList() == null && func.getParameters().formalParameterList() != null){ //error
                TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() + " - Missing Parameter call.\n");
            }else if(ctx.expressionList() != null && func.getParameters().formalParameterList() == null){ //error
                TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() + " - Extra Parameter call.\n");
            }else if(ctx.expressionList() == null && func.getParameters().formalParameterList() == null){ //void
                return this.visit(func.getActions());
            }

        }else{
            if(symbolTable.containsKey(mName)){
                JSFMValues temp = symbolTable.get(mName);
                if(temp.getObjectType().equals("keyword")){
                    TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getText() + " - " + mName + " is a keyword" +
                            " and cannot be a function/variable.\n");
                }else{
                    TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getText() + " - " + mName + " is a variable." +
                            " Please remove " + ctx.getText().replace(mName, "") + " after the variable name.\n");
                }
            }else{
                TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getText() + " - There is no function declared as "
                + mName + ". Please check your list of declared functions.\n");
            }

        }

        return null;
    }

    @Override
    public Object visitPrepostFix(JSFMParser.PrepostFixContext ctx) {
        String vName = ctx.IDENTIFIER().getText();
        if(symbolTable.containsKey(vName)){
            JSFMValues temp = symbolTable.get(vName);
            if(temp.getObjectType().equals("techies") || temp.getObjectType().equals("coke")){
                if(!temp.isEmpty()){
                    if(ctx.INC() != null){
                        if(temp.getObjectType().equals("techies")){
                            temp.setIntValue(temp.getIntValue()+1);
                        }else{
                            temp.setFloatValue(temp.getFloatValue()+1);
                        }
                    }else if(ctx.DEC() != null){
                        if(temp.getObjectType().equals("techies")){
                            temp.setIntValue(temp.getIntValue()-1);
                        }else{
                            temp.setFloatValue(temp.getFloatValue()-1);
                        }
                    }

                    symbolTable.put(vName, temp);
                }else{
                    TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() + " - Variable " + vName +
                            " has not been initialized. Please initialize it first.\n");
                }
            }else{
                TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() + " - Only variable types techies" +
                        " and coke may be incremented/decremented. " + vName + " is of " + temp.getObjectType() + " type.\n");
            }
        }else{
            TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() + " - Variable " + vName +
                    " does not exist. Please declare and initialize it first.\n");
        }
        return visitChildren(ctx);
    }

    @Override
    public Object visitExpression(JSFMParser.ExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitPrimary(JSFMParser.PrimaryContext ctx) {
        return visitChildren(ctx);
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
                                if(!val.isArray()) { //not array
                                    switch (val.getObjectType()) {
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
                                } else { //array
                                    String strArrayValues = val.getArrayValues();

                                    strArrayValues = strArrayValues.replaceAll("\\{", "").replaceAll("\\}", "");
                                    System.out.println(strArrayValues);
                                    String[] tempArrayValues = strArrayValues.split(",");

                                    switch (val.getObjectType()) {
                                        case "techies":
                                            for(int j = 0; j < tempArrayValues.length; j++){
                                                print += Integer.parseInt(tempArrayValues[j]) + " ";
                                            }
                                            break;
                                        case "coke":
                                            for(int j = 0; j < tempArrayValues.length; j++){
                                                print += Float.parseFloat(tempArrayValues[j]) + " ";
                                            }
                                            break;
                                        case "thread":
                                            for(int j = 0; j < tempArrayValues.length; j++){
                                                print += tempArrayValues[j] + " ";
                                            }
                                            break;
                                        case "kachow":
                                            for(int j = 0; j < tempArrayValues.length; j++){
                                                print += tempArrayValues[j].charAt(0) + " ";
                                            }
                                            break;
                                        case "boolin":
                                            for(int j = 0; j < tempArrayValues.length; j++){
                                                print += Boolean.parseBoolean(tempArrayValues[j]) + " ";
                                            }
                                            break;
                                    }
                                }
                            }else{
                                TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() + " - Variable "
                                        + temp + " has not been initialized. Please initialize it first.\n");
                            }
                        }else {
                            TestScanner.outputTextArea.append("ERROR - Line " + ctx.start.getLine() + " - Variable "
                                    + temp + " does not exist. Please declare and initialize it first.\n");
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
        return visitChildren(ctx);
    }


}