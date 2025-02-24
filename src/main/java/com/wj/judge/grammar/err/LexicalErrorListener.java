package com.wj.judge.grammar.err;

import lombok.Getter;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.Interval;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 词法错误监听器
 */
@Getter
public class LexicalErrorListener extends BaseErrorListener {

    private List<GrammarErrorBo> errMessage = new ArrayList<>(0);

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        Lexer lexer = (Lexer) recognizer;
        String text = lexer._input.getText(Interval.of(lexer._tokenStartCharIndex, lexer._input.index()));
        String errorDisplay = lexer.getErrorDisplay(text);
        if (StringUtils.isNotBlank(errorDisplay)){
            errMessage.add(new GrammarErrorBo()
                    .setLine(line)
                    .setCharPositionInLine(charPositionInLine)
                    .setOffendingSymbol(errorDisplay)
                    .setMsg(msg)
                    .setException(e));
        }
    }

}