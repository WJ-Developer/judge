package com.wj.judge.grammar.compare.impl;

import com.wj.judge.grammar.compare.BaseCompareHandler;

import java.util.Collection;

public class CompareHandlerByCONTAIN extends BaseCompareHandler {

    public static final CompareHandlerByCONTAIN instance = new CompareHandlerByCONTAIN();

    @Override
    public boolean compare(Object param, String value) {
        if (param instanceof Collection) {
            return ((Collection)param).contains(value);
        }else if (param instanceof String) {
            return ((String)param).contains(value);
        }else{
            //TODO 不是集合且不是字符串抛出异常
            return false;
        }
    }
}
