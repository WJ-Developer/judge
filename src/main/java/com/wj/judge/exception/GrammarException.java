package com.wj.judge.exception;

/**
 * Antlr4解析异常，语法异常和词法的异常的父类
 */
public class GrammarException extends Exception{

    public GrammarException(String message){
        super(message);
    }
}
