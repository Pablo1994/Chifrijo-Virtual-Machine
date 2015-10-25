// Generated from chgrammar/CHExpr.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CHExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CHExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CHExprParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CHExprParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stexpr}
	 * labeled alternative in {@link CHExprParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStexpr(CHExprParser.StexprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CHExprParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(CHExprParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link CHExprParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(CHExprParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CHExprParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(CHExprParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link CHExprParser#rexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(CHExprParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link CHExprParser#rexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(CHExprParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arith}
	 * labeled alternative in {@link CHExprParser#rexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith(CHExprParser.ArithContext ctx);
	/**
	 * Visit a parse tree produced by the {@code True}
	 * labeled alternative in {@link CHExprParser#rexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrue(CHExprParser.TrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code False}
	 * labeled alternative in {@link CHExprParser#rexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalse(CHExprParser.FalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relExpr}
	 * labeled alternative in {@link CHExprParser#rexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(CHExprParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CHExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(CHExprParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CHExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(CHExprParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code num}
	 * labeled alternative in {@link CHExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(CHExprParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link CHExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(CHExprParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CHExprParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(CHExprParser.FormalContext ctx);
	/**
	 * Visit a parse tree produced by {@link CHExprParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(CHExprParser.ConstantContext ctx);
}