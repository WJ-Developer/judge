package com.wj.judge.grammar.compare.impl;

import com.wj.judge.grammar.compare.BaseCompareHandler;

public class CompareHandlerByHAVE extends BaseCompareHandler {

    public static final CompareHandlerByHAVE instance = new CompareHandlerByHAVE();

    @Override
    public boolean compare(Object param, String value) {
        return false;
    }
}
