// Generated from C:/Users/Shan/IdeaProjects/CMPILER-Scanner/src\JSFMParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSFMParser}.
 */
public interface JSFMParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSFMParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(JSFMParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(JSFMParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#mainStatement}.
	 * @param ctx the parse tree
	 */
	void enterMainStatement(JSFMParser.MainStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#mainStatement}.
	 * @param ctx the parse tree
	 */
	void exitMainStatement(JSFMParser.MainStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(JSFMParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(JSFMParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(JSFMParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(JSFMParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(JSFMParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(JSFMParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JSFMParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JSFMParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JSFMParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JSFMParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(JSFMParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(JSFMParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JSFMParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JSFMParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(JSFMParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(JSFMParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(JSFMParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(JSFMParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(JSFMParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(JSFMParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(JSFMParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(JSFMParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(JSFMParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(JSFMParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JSFMParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JSFMParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(JSFMParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(JSFMParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(JSFMParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(JSFMParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JSFMParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JSFMParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(JSFMParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(JSFMParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(JSFMParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(JSFMParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(JSFMParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(JSFMParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JSFMParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JSFMParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JSFMParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JSFMParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(JSFMParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(JSFMParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(JSFMParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(JSFMParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(JSFMParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(JSFMParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JSFMParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JSFMParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(JSFMParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(JSFMParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(JSFMParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(JSFMParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JSFMParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JSFMParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(JSFMParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(JSFMParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(JSFMParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(JSFMParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(JSFMParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(JSFMParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(JSFMParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(JSFMParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(JSFMParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(JSFMParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(JSFMParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(JSFMParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(JSFMParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(JSFMParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(JSFMParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(JSFMParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JSFMParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JSFMParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(JSFMParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(JSFMParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(JSFMParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(JSFMParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatement(JSFMParser.OutputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatement(JSFMParser.OutputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JSFMParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(JSFMParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSFMParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(JSFMParser.PrimitiveTypeContext ctx);
}