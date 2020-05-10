// Generated from /home/danila/source/Sake/src/man/dan/parser/SakeParser.g4 by ANTLR 4.8
package man.dan.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SakeParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SakeParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SakeParserParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SakeParserParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(SakeParserParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code app}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(SakeParserParser.AppContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(SakeParserParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMin}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMin(SakeParserParser.PlusMinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(SakeParserParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(SakeParserParser.ConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(SakeParserParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code grLess}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrLess(SakeParserParser.GrLessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unMin}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnMin(SakeParserParser.UnMinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funCall}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunCall(SakeParserParser.FunCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackets(SakeParserParser.BracketsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#num_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum_assign(SakeParserParser.Num_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#bool_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_assign(SakeParserParser.Bool_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#block_coub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_coub(SakeParserParser.Block_coubContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#rippotai_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRippotai_assign(SakeParserParser.Rippotai_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(SakeParserParser.OrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#array_vals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_vals(SakeParserParser.Array_valsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#hairetsu_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHairetsu_assign(SakeParserParser.Hairetsu_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#appeal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppeal(SakeParserParser.AppealContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(SakeParserParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SakeParserParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#declaration_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_stmt(SakeParserParser.Declaration_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#def_simp_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_simp_stmt(SakeParserParser.Def_simp_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#def_coub_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_coub_stmt(SakeParserParser.Def_coub_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#def_array_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_array_stmt(SakeParserParser.Def_array_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#jigen_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJigen_stmt(SakeParserParser.Jigen_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#nagasa_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNagasa_stmt(SakeParserParser.Nagasa_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#senden_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenden_stmt(SakeParserParser.Senden_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_stmt(SakeParserParser.Call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(SakeParserParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(SakeParserParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(SakeParserParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(SakeParserParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SakeParserParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#cycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycle(SakeParserParser.CycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(SakeParserParser.Function_callContext ctx);
}