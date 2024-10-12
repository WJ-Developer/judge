package com.wj.judge.api;

import cn.hutool.core.collection.CollUtil;
import com.wj.judge.exception.GrammarException;
import com.wj.judge.exception.LexerException;
import com.wj.judge.exception.ParserException;
import com.wj.judge.grammar.err.GrammarErrorBo;
import com.wj.judge.grammar.err.GrammarErrorListener;
import com.wj.judge.grammar.err.LexicalErrorListener;
import com.wj.judge.grammar.objassert.ObjAssertLexer;
import com.wj.judge.grammar.objassert.ObjAssertParser;
import com.wj.judge.grammar.utils.GrammarErrException;
import ognl.Ognl;
import ognl.OgnlException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


public class JudgeUtils {

    /**
     * 解析语法树
     * @param expression
     * @return
     */
    public static ObjAssertParser.ParseContext parserTree(String expression) throws GrammarException {
        ObjAssertLexer lexer = new ObjAssertLexer(CharStreams.fromString(expression));//词法分析器
        lexer.removeErrorListeners();
        LexicalErrorListener lexicalListener = new LexicalErrorListener();
        lexer.addErrorListener(lexicalListener);//添加词法错误监听
        CommonTokenStream tokens = new CommonTokenStream(lexer);//词法缓冲区
        ObjAssertParser parser = new ObjAssertParser(tokens);//语法分析器
        parser.removeErrorListeners();
        GrammarErrorListener errorListener = new GrammarErrorListener();
        //添加语法法错误监听
        parser.addErrorListener(errorListener);
        ObjAssertParser.ParseContext tree = parser.parse();//调用根的语法
        if (CollUtil.isNotEmpty(lexicalListener.getErrMessage())){
            String message = "[词法错误]";
            for (GrammarErrorBo bo : lexicalListener.getErrMessage()) {
                message = message + String.format("行%s列%s: %s. 错误原因:%s；", bo.getLine(), bo.getCharPositionInLine(), bo.getOffendingSymbol(), bo.getMsg());
            }
            throw new LexerException(message);
        }
        if (CollUtil.isNotEmpty(errorListener.getErrMessage())){
            String message = "[语法错误]";
            for (GrammarErrorBo bo : errorListener.getErrMessage()) {
                message = message + String.format("行%s列%s: %s. 错误原因:%s；", bo.getLine(), bo.getCharPositionInLine(), bo.getOffendingSymbol(), bo.getMsg());
            }
            throw new ParserException(message);
        }
        return tree;
    }

    /**
     * 从对象中按照Ognl语法取值
     * @param key
     * @param instance
     * @return
     */
    public static Object getValue(String key, Object instance){
        Object obj = null;
        try {
            obj = Ognl.getValue(key, instance);
        } catch (OgnlException e) {
            throw new GrammarErrException("Ognl取值失败：",e);
        }
        return obj;
    }
}
