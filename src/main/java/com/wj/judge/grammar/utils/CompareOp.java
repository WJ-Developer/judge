package com.wj.judge.grammar.utils;

import cn.hutool.core.collection.CollUtil;

import java.util.List;

/**
 * 比较操作运算符
 */
public enum CompareOp {
    EQ("="),
    NOT_EQ("!="),
    GT(">"),
    GT_EQ(">="),
    LT("<"),
    LT_EQ("<="),
    CONTAIN("contain"),
    NOT_CONTAIN("not_contain"),
    HAVE("have"),
    NOT_HAVE("not_have");

    List<String> symbols;


    CompareOp(String... symbol){
        this.symbols = CollUtil.newArrayList(symbol);
    }

    public static CompareOp fromString(String symbol) {
        symbol = symbol.toLowerCase();//转小写
        for(CompareOp compare : values()) {
            if (compare.symbols.contains(symbol)){
                return compare;
            }
        }
        throw new GrammarErrException("非法比较操作符："+symbol);
    }
}
