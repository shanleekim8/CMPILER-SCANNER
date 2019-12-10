// Generated from C:/Users/Shan/IdeaProjects/CMPILER-Scanner/src\JSFMParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSFMParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSFMParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JSFMParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(JSFMParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#mainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStatement(JSFMParser.MainStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(JSFMParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(JSFMParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(JSFMParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JSFMParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(JSFMParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(JSFMParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JSFMParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(JSFMParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(JSFMParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(JSFMParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(JSFMParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(JSFMParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JSFMParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(JSFMParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(JSFMParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(JSFMParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(JSFMParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(JSFMParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(JSFMParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(JSFMParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JSFMParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(JSFMParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(JSFMParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(JSFMParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JSFMParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(JSFMParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(JSFMParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link JSFMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(JSFMParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link JSFMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStmt(JSFMParser.IfElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forLoopStmt}
	 * labeled alternative in {@link JSFMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoopStmt(JSFMParser.ForLoopStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileLoopStmt}
	 * labeled alternative in {@link JSFMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoopStmt(JSFMParser.WhileLoopStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhileLoopStmt}
	 * labeled alternative in {@link JSFMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoopStmt(JSFMParser.DoWhileLoopStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchStmt}
	 * labeled alternative in {@link JSFMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStmt(JSFMParser.SwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link JSFMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(JSFMParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link JSFMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(JSFMParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link JSFMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(JSFMParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierStmt}
	 * labeled alternative in {@link JSFMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierStmt(JSFMParser.IdentifierStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code outputStmt}
	 * labeled alternative in {@link JSFMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStmt(JSFMParser.OutputStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code outputStmtErrors}
	 * labeled alternative in {@link JSFMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStmtErrors(JSFMParser.OutputStmtErrorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputStmtErrors}
	 * labeled alternative in {@link JSFMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStmtErrors(JSFMParser.InputStmtErrorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputStmt}
	 * labeled alternative in {@link JSFMParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStmt(JSFMParser.InputStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(JSFMParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(JSFMParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(JSFMParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(JSFMParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(JSFMParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(JSFMParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(JSFMParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(JSFMParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#prepostFix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepostFix(JSFMParser.PrepostFixContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JSFMParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code missingLParenMethodCall}
	 * labeled alternative in {@link JSFMParser#methodCallErrors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingLParenMethodCall(JSFMParser.MissingLParenMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code missingRParenMethodCall}
	 * labeled alternative in {@link JSFMParser#methodCallErrors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingRParenMethodCall(JSFMParser.MissingRParenMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(JSFMParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#inputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(JSFMParser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code missingLParenInput}
	 * labeled alternative in {@link JSFMParser#inputStatementErrors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingLParenInput(JSFMParser.MissingLParenInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code missingRParenInput}
	 * labeled alternative in {@link JSFMParser#inputStatementErrors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingRParenInput(JSFMParser.MissingRParenInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code missingCommaInput}
	 * labeled alternative in {@link JSFMParser#inputStatementErrors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingCommaInput(JSFMParser.MissingCommaInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code missingIdenInput}
	 * labeled alternative in {@link JSFMParser#inputStatementErrors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingIdenInput(JSFMParser.MissingIdenInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code missingStrLitInput}
	 * labeled alternative in {@link JSFMParser#inputStatementErrors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingStrLitInput(JSFMParser.MissingStrLitInputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code missingSemiInput}
	 * labeled alternative in {@link JSFMParser#inputStatementErrors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingSemiInput(JSFMParser.MissingSemiInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#outputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatement(JSFMParser.OutputStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code missingLParenOutput}
	 * labeled alternative in {@link JSFMParser#outputStatementErrors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingLParenOutput(JSFMParser.MissingLParenOutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code missingRParenOutput}
	 * labeled alternative in {@link JSFMParser#outputStatementErrors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingRParenOutput(JSFMParser.MissingRParenOutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code missingSemiOutput}
	 * labeled alternative in {@link JSFMParser#outputStatementErrors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMissingSemiOutput(JSFMParser.MissingSemiOutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link JSFMParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(JSFMParser.PrimitiveTypeContext ctx);
}