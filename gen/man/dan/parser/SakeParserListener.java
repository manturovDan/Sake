// Generated from /home/danila/source/Sake/src/man/dan/parser/SakeParser.g4 by ANTLR 4.8
package man.dan.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SakeParserParser}.
 */
public interface SakeParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SakeParserParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SakeParserParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SakeParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SakeParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(SakeParserParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(SakeParserParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SakeParserParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SakeParserParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#num_assign}.
	 * @param ctx the parse tree
	 */
	void enterNum_assign(SakeParserParser.Num_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#num_assign}.
	 * @param ctx the parse tree
	 */
	void exitNum_assign(SakeParserParser.Num_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#bool_assign}.
	 * @param ctx the parse tree
	 */
	void enterBool_assign(SakeParserParser.Bool_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#bool_assign}.
	 * @param ctx the parse tree
	 */
	void exitBool_assign(SakeParserParser.Bool_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#rippotai_assign}.
	 * @param ctx the parse tree
	 */
	void enterRippotai_assign(SakeParserParser.Rippotai_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#rippotai_assign}.
	 * @param ctx the parse tree
	 */
	void exitRippotai_assign(SakeParserParser.Rippotai_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(SakeParserParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(SakeParserParser.OrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#hairetsu_assign}.
	 * @param ctx the parse tree
	 */
	void enterHairetsu_assign(SakeParserParser.Hairetsu_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#hairetsu_assign}.
	 * @param ctx the parse tree
	 */
	void exitHairetsu_assign(SakeParserParser.Hairetsu_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#appeal}.
	 * @param ctx the parse tree
	 */
	void enterAppeal(SakeParserParser.AppealContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#appeal}.
	 * @param ctx the parse tree
	 */
	void exitAppeal(SakeParserParser.AppealContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(SakeParserParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(SakeParserParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SakeParserParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SakeParserParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#declaration_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_stmt(SakeParserParser.Declaration_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#declaration_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_stmt(SakeParserParser.Declaration_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#def_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDef_stmt(SakeParserParser.Def_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#def_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDef_stmt(SakeParserParser.Def_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#jigen_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJigen_stmt(SakeParserParser.Jigen_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#jigen_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJigen_stmt(SakeParserParser.Jigen_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#nagasa_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNagasa_stmt(SakeParserParser.Nagasa_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#nagasa_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNagasa_stmt(SakeParserParser.Nagasa_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(SakeParserParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(SakeParserParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SakeParserParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SakeParserParser.FunctionContext ctx);
}