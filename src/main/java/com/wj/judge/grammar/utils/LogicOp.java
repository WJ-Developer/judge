package com.wj.judge.grammar.utils;

import cn.hutool.core.collection.CollUtil;

import java.util.List;

public enum LogicOp {
    AND(CollUtil.newArrayList("AND","and","并且")),
    OR(CollUtil.newArrayList("OR","or","或者"));

    List<String> symbols;

    LogicOp(List<String> symbols){
        this.symbols = symbols;
    }

    public boolean is(String key){
        return symbols.contains(key);
    }

}
