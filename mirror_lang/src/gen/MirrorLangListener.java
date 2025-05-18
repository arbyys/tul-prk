// Generated from MirrorLang.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MirrorLangParser}.
 */
public interface MirrorLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MirrorLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MirrorLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MirrorLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MirrorLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MirrorLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MirrorLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MirrorLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MirrorLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MirrorLangParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetStatement(MirrorLangParser.SetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MirrorLangParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetStatement(MirrorLangParser.SetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MirrorLangParser#loopIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopIfStatement(MirrorLangParser.LoopIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MirrorLangParser#loopIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopIfStatement(MirrorLangParser.LoopIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MirrorLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MirrorLangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MirrorLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MirrorLangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MirrorLangParser#logStatement}.
	 * @param ctx the parse tree
	 */
	void enterLogStatement(MirrorLangParser.LogStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MirrorLangParser#logStatement}.
	 * @param ctx the parse tree
	 */
	void exitLogStatement(MirrorLangParser.LogStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MirrorLangParser#ignoreStatement}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreStatement(MirrorLangParser.IgnoreStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MirrorLangParser#ignoreStatement}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreStatement(MirrorLangParser.IgnoreStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MirrorLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MirrorLangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MirrorLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MirrorLangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MirrorLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MirrorLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MirrorLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MirrorLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MirrorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MirrorLangParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MirrorLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MirrorLangParser.TermContext ctx);
}