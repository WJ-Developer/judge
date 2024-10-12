package com.wj.judge.grammar.compare.impl;

import cn.hutool.json.JSONUtil;
import com.wj.judge.grammar.compare.BaseCompareHandler;

public class CompareHandlerByHAVE extends BaseCompareHandler {

    public static final CompareHandlerByHAVE instance = new CompareHandlerByHAVE();

    @Override
    public boolean compare(Object param, String value) {
        return JSONUtil.parseArray(value).contains(param);
    }
}
