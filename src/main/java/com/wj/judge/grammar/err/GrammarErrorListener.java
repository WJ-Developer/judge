package com.wj.judge.grammar.err;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

/**
 * 语法错误监听器
 */
public class GrammarErrorListener extends BaseErrorListener {

    private List<String> errMessage = new ArrayList<>(0);

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String message = String.format("[语法错误]行%s列%s: %s. 错误原因:%s", line, charPositionInLine, offendingSymbol, msg);
        errMessage.add(message);
    }

    public List<String> getErrMessage() {
        return errMessage;
    }
}