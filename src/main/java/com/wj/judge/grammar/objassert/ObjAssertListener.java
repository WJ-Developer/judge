// Generated from E:/gitee/myContainer/java/my_container/my_container/src/main/resources/ObjAssert.g4 by ANTLR 4.13.1

    package com.wj.judge.grammar.objassert;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ObjAssertParser}.
 */
public interface ObjAssertListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ObjAssertParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(ObjAssertParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjAssertParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(ObjAssertParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lableLogicConnect}
	 * labeled alternative in {@link ObjAssertParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLableLogicConnect(ObjAssertParser.LableLogicConnectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lableLogicConnect}
	 * labeled alternative in {@link ObjAssertParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLableLogicConnect(ObjAssertParser.LableLogicConnectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lableSingle}
	 * labeled alternative in {@link ObjAssertParser#exprSingle}.
	 * @param ctx the parse tree
	 */
	void enterLableSingle(ObjAssertParser.LableSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lableSingle}
	 * labeled alternative in {@link ObjAssertParser#exprSingle}.
	 * @param ctx the parse tree
	 */
	void exitLableSingle(ObjAssertParser.LableSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lableJudge}
	 * labeled alternative in {@link ObjAssertParser#exprSingle}.
	 * @param ctx the parse tree
	 */
	void enterLableJudge(ObjAssertParser.LableJudgeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lableJudge}
	 * labeled alternative in {@link ObjAssertParser#exprSingle}.
	 * @param ctx the parse tree
	 */
	void exitLableJudge(ObjAssertParser.LableJudgeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lableGroup}
	 * labeled alternative in {@link ObjAssertParser#exprSingle}.
	 * @param ctx the parse tree
	 */
	void enterLableGroup(ObjAssertParser.LableGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lableGroup}
	 * labeled alternative in {@link ObjAssertParser#exprSingle}.
	 * @param ctx the parse tree
	 */
	void exitLableGroup(ObjAssertParser.LableGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjAssertParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(ObjAssertParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjAssertParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(ObjAssertParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link ObjAssertParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(ObjAssertParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link ObjAssertParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(ObjAssertParser.LogicContext ctx);
}