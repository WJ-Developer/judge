package com.wj.judge.grammar.compare.impl;

import com.wj.judge.grammar.compare.BaseCompareHandler;

import java.util.Optional;

public class CompareHandlerByEQ  extends BaseCompareHandler {

    public static final CompareHandlerByEQ instance = new CompareHandlerByEQ();

    @Override
    public boolean compare(Object param, String value) {
        return Optional.ofNullable(param).orElse("").equals(value);
    }
}
