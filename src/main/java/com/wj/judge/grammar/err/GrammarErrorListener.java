package com.wj.judge.grammar.err;

import lombok.Getter;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

/**
 * 语法错误监听器
 */
@Getter
public class GrammarErrorListener extends BaseErrorListener {

    private List<GrammarErrorBo> errMessage = new ArrayList<>(0);

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        errMessage.add(new GrammarErrorBo()
                .setLine(line)
                .setCharPositionInLine(charPositionInLine)
                .setOffendingSymbol(offendingSymbol)
                .setMsg(msg)
                .setException(e));
    }

}