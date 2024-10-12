package com.wj.judge.grammar.compare.impl;

import com.wj.judge.grammar.compare.BaseCompareHandler;

public class CompareHandlerByLT extends BaseCompareHandler {

    public static final CompareHandlerByLT instance = new CompareHandlerByLT();

    @Override
    public boolean compare(Object param, String value) {
        if (param instanceof Number){
            return Long.parseLong(param.toString())<Long.parseLong(value);
        }else{
            return lt(param.toString(),value);
        }
    }

    public static <T> T nvl(T value, T defaultValue) {
        return value != null ? value : defaultValue;
    }

    //字符串的字典序列比较,小于
    public static boolean lt(String str1,String str2) {
        int sort = nvl(str1, "").compareTo(nvl(str2, ""));
        return sort<0;
    }
}
