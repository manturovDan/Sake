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
	 * Visit a parse tree produced by {@link SakeParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SakeParserParser.ExprContext ctx);
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
	 * Visit a parse tree produced by {@link SakeParserParser#def_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_stmt(SakeParserParser.Def_stmtContext ctx);
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
	 * Visit a parse tree produced by {@link SakeParserParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(SakeParserParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SakeParserParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(SakeParserParser.FunctionContext ctx);
}