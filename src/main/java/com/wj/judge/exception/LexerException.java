package com.wj.judge.exception;

/**
 * 词法错误异常
 */
public class LexerException extends GrammarException{

    public LexerException(String message){
        super(message);
    }
}
