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
	 * Enter a parse tree produced by the {@code app}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterApp(SakeParserParser.AppContext ctx);
	/**
	 * Exit a parse tree produced by the {@code app}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitApp(SakeParserParser.AppContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(SakeParserParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(SakeParserParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMin}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusMin(SakeParserParser.PlusMinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMin}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusMin(SakeParserParser.PlusMinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(SakeParserParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(SakeParserParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConst(SakeParserParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConst(SakeParserParser.ConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(SakeParserParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(SakeParserParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code grLess}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGrLess(SakeParserParser.GrLessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code grLess}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGrLess(SakeParserParser.GrLessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unMin}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnMin(SakeParserParser.UnMinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unMin}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnMin(SakeParserParser.UnMinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funCall}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunCall(SakeParserParser.FunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funCall}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunCall(SakeParserParser.FunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(SakeParserParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(SakeParserParser.BracketsContext ctx);
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
	 * Enter a parse tree produced by {@link SakeParserParser#block_coub}.
	 * @param ctx the parse tree
	 */
	void enterBlock_coub(SakeParserParser.Block_coubContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#block_coub}.
	 * @param ctx the parse tree
	 */
	void exitBlock_coub(SakeParserParser.Block_coubContext ctx);
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
	 * Enter a parse tree produced by {@link SakeParserParser#array_vals}.
	 * @param ctx the parse tree
	 */
	void enterArray_vals(SakeParserParser.Array_valsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#array_vals}.
	 * @param ctx the parse tree
	 */
	void exitArray_vals(SakeParserParser.Array_valsContext ctx);
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
	 * Enter a parse tree produced by {@link SakeParserParser#cube_attr}.
	 * @param ctx the parse tree
	 */
	void enterCube_attr(SakeParserParser.Cube_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#cube_attr}.
	 * @param ctx the parse tree
	 */
	void exitCube_attr(SakeParserParser.Cube_attrContext ctx);
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
	 * Enter a parse tree produced by {@link SakeParserParser#r_value}.
	 * @param ctx the parse tree
	 */
	void enterR_value(SakeParserParser.R_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#r_value}.
	 * @param ctx the parse tree
	 */
	void exitR_value(SakeParserParser.R_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#def_simp_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDef_simp_stmt(SakeParserParser.Def_simp_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#def_simp_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDef_simp_stmt(SakeParserParser.Def_simp_stmtContext ctx);
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
	 * Enter a parse tree produced by {@link SakeParserParser#senden_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSenden_stmt(SakeParserParser.Senden_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#senden_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSenden_stmt(SakeParserParser.Senden_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCall_stmt(SakeParserParser.Call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCall_stmt(SakeParserParser.Call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(SakeParserParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(SakeParserParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#one_param}.
	 * @param ctx the parse tree
	 */
	void enterOne_param(SakeParserParser.One_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#one_param}.
	 * @param ctx the parse tree
	 */
	void exitOne_param(SakeParserParser.One_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(SakeParserParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(SakeParserParser.ParamsContext ctx);
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
	 * Enter a parse tree produced by {@link SakeParserParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SakeParserParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SakeParserParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#cycle}.
	 * @param ctx the parse tree
	 */
	void enterCycle(SakeParserParser.CycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#cycle}.
	 * @param ctx the parse tree
	 */
	void exitCycle(SakeParserParser.CycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SakeParserParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(SakeParserParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SakeParserParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(SakeParserParser.Function_callContext ctx);
}