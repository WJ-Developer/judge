package com.wj.judge.grammar.utils;

public class GrammarErrException extends RuntimeException{

    public  GrammarErrException (String message){
        super(message);
    }

    public  GrammarErrException (Exception e){
        super(e);
    }

    public  GrammarErrException (String message,Exception e){
        super(message,e);
    }
}
