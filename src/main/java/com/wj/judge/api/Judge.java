package com.wj.judge.api;

import com.wj.judge.exception.GrammarException;
import com.wj.judge.grammar.objassert.ObjAssertParser;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * api入口
 */
public class Judge {

    /**
     * 判断对象是否符合语法
     * @param expression
     * @param instance
     * @return
     */
    public static boolean verdict(String expression, Object instance) throws GrammarException {
        ObjAssertParser.ParseContext parseTree = JudgeUtils.parserTree(expression);
        ObjAssertListenerImpl listener = new ObjAssertListenerImpl().setInstance(instance);
        new ParseTreeWalker().walk(listener, parseTree); // 使用监听器遍历解析树
        return listener.isAssertFlag();
    }
}
