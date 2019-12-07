import com.udojava.evalex.Expression;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class JSFMVisitor extends JSFMParserBaseVisitor<Object> {

    @Override
    public Object visitCompilationUnit(JSFMParser.CompilationUnitContext ctx) {
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
    public Object visitStatement(JSFMParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

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
        return null;
    }

    @Override
    public Object visitOutputStatement(JSFMParser.OutputStatementContext ctx) {
        System.out.println("IN OUTPUT STATEMENT");
        String print = "";
        Expression expr = new Expression(ctx.getText());
        for(int i=0; i<ctx.children.size(); i++){
            if(!ctx.children.get(i).toString().equals("outputf") && !ctx.children.get(i).toString().equals("(")
                    && !ctx.children.get(i).toString().equals(")") && !ctx.children.get(i).toString().equals("+")
                    && !ctx.children.get(i).toString().equals(";")){
                print += ctx.children.get(i).toString().substring(1, ctx.children.get(i).toString().length()-1);
            }
        }
        TestScanner.outputTextArea.append(print);
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