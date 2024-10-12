package com.wj.judge.grammar.utils;

import cn.hutool.core.collection.CollUtil;

public enum LogicOp {
    AND {
        @Override
        public boolean is(String key) {
            return CollUtil.newArrayList("AND","and","并且").contains(key);
        }
    },OR {
        @Override
        public boolean is(String key) {
            return CollUtil.newArrayList("OR","or","或者").contains(key);
        }
    };
    public abstract boolean is(String key);
}
