// Generated from E:/Documents/IntelliJ/Project Flare/src\FlareParser.g4 by ANTLR 4.9.1
package Flare;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FlareParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FlareParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FlareParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(FlareParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#importLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportLine(FlareParser.ImportLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#packageHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageHeader(FlareParser.PackageHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#entityHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityHeader(FlareParser.EntityHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#extensions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtensions(FlareParser.ExtensionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#entityBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityBody(FlareParser.EntityBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#declarationHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationHeader(FlareParser.DeclarationHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#declarationLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationLine(FlareParser.DeclarationLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#declarationTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationTag(FlareParser.DeclarationTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#entityMethods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityMethods(FlareParser.EntityMethodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#definedFunctionHeaders}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinedFunctionHeaders(FlareParser.DefinedFunctionHeadersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#constructorHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorHeader(FlareParser.ConstructorHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#deconstructorHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeconstructorHeader(FlareParser.DeconstructorHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(FlareParser.MethodHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#mainMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainMethod(FlareParser.MainMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#declarationParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationParameters(FlareParser.DeclarationParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(FlareParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(FlareParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FlareParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#newStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewStatement(FlareParser.NewStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(FlareParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#builtinFunctions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltinFunctions(FlareParser.BuiltinFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(FlareParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(FlareParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(FlareParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(FlareParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#foreachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachStatement(FlareParser.ForeachStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(FlareParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(FlareParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(FlareParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(FlareParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#conditionAndBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionAndBlock(FlareParser.ConditionAndBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#singleLineOrBlockBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleLineOrBlockBody(FlareParser.SingleLineOrBlockBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FlareParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(FlareParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(FlareParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#callParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallParameter(FlareParser.CallParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#parameterExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterExpression(FlareParser.ParameterExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#parameterAdditiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterAdditiveExpression(FlareParser.ParameterAdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#parameterMultiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterMultiplicativeExpression(FlareParser.ParameterMultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#parameterTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTerm(FlareParser.ParameterTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#parameterTernaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTernaryExpression(FlareParser.ParameterTernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(FlareParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(FlareParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(FlareParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FlareParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(FlareParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(FlareParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(FlareParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#preUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreUnaryExpression(FlareParser.PreUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#postUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostUnaryExpression(FlareParser.PostUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(FlareParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#ternaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(FlareParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(FlareParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#declarationStatementSingular}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatementSingular(FlareParser.DeclarationStatementSingularContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(FlareParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#arraySpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraySpecifier(FlareParser.ArraySpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#castSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastSpecifier(FlareParser.CastSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#identifierSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSpecifier(FlareParser.IdentifierSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(FlareParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(FlareParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(FlareParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableType(FlareParser.VariableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#entityModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityModifier(FlareParser.EntityModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#classOrInterface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterface(FlareParser.ClassOrInterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#visibilityModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVisibilityModifier(FlareParser.VisibilityModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#methodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodModifier(FlareParser.MethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#methodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodType(FlareParser.MethodTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FlareParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(FlareParser.PrimitiveTypeContext ctx);
}