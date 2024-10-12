package com.wj.judge.grammar.compare.impl;

import com.wj.judge.grammar.compare.BaseCompareHandler;

public class CompareHandlerByCONTAIN extends BaseCompareHandler {

    public static final CompareHandlerByCONTAIN instance = new CompareHandlerByCONTAIN();

    @Override
    public boolean compare(Object param, String value) {
        return false;
    }
}
