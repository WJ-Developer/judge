package com.wj.judge.grammar.compare.impl;

import com.wj.judge.grammar.compare.BaseCompareHandler;

public class CompareHandlerByGT extends BaseCompareHandler {

    public static final CompareHandlerByGT instance = new CompareHandlerByGT();

    @Override
    public boolean compare(Object param, String value) {
        if (param instanceof Number){
            return Long.parseLong(param.toString())>Long.parseLong(value);
        }else{
            return gt(param.toString(),value);
        }
    }


    private static <T> T nvl(T value, T defaultValue) {
        return value != null ? value : defaultValue;
    }

    //字符串的字典序列比较,大于
    private static boolean gt(String str1,String str2) {
        int sort = nvl(str1, "").compareTo(nvl(str2, ""));
        return sort>0;
    }
}
