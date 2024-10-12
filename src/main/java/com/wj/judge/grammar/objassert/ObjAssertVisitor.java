// Generated from E:/gitee/myContainer/java/my_container/my_container/src/main/resources/ObjAssert.g4 by ANTLR 4.13.1

    package com.wj.judge.grammar.objassert;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ObjAssertParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ObjAssertVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ObjAssertParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(ObjAssertParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lableLogicConnect}
	 * labeled alternative in {@link ObjAssertParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLableLogicConnect(ObjAssertParser.LableLogicConnectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lableSingle}
	 * labeled alternative in {@link ObjAssertParser#exprSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLableSingle(ObjAssertParser.LableSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lableJudge}
	 * labeled alternative in {@link ObjAssertParser#exprSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLableJudge(ObjAssertParser.LableJudgeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lableGroup}
	 * labeled alternative in {@link ObjAssertParser#exprSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLableGroup(ObjAssertParser.LableGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjAssertParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(ObjAssertParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link ObjAssertParser#logic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(ObjAssertParser.LogicContext ctx);
}