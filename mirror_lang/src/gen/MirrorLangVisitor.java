// Generated from MirrorLang.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MirrorLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MirrorLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MirrorLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MirrorLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MirrorLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MirrorLangParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MirrorLangParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStatement(MirrorLangParser.SetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MirrorLangParser#loopIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopIfStatement(MirrorLangParser.LoopIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MirrorLangParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MirrorLangParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MirrorLangParser#logStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogStatement(MirrorLangParser.LogStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MirrorLangParser#ignoreStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreStatement(MirrorLangParser.IgnoreStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MirrorLangParser#innerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerStatement(MirrorLangParser.InnerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MirrorLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(MirrorLangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MirrorLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MirrorLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MirrorLangParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MirrorLangParser.TermContext ctx);
}