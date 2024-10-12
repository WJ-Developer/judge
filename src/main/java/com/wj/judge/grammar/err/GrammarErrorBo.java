package com.wj.judge.grammar.err;

import lombok.Data;
import lombok.experimental.Accessors;
import org.antlr.v4.runtime.RecognitionException;

@Data
@Accessors(chain = true)
public class GrammarErrorBo {

    /**
     * 错误所在的行
     */
    private int line;

    /**
     * 错误字符在本行的位置
     */
    private int charPositionInLine;

    /**
     * 错误的内容
     */
    private Object offendingSymbol;

    /**
     * 错误的原因
     */
    private String msg;

    /**
     * 错误对应的异常
     */
    private RecognitionException exception;
}
