package com.wj.judge.api;
import com.wj.judge.grammar.err.GrammarErrorListener;
import com.wj.judge.grammar.err.LexicalErrorListener;
import com.wj.judge.grammar.objassert.ObjAssertLexer;
import com.wj.judge.grammar.objassert.ObjAssertParser;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;
import ognl.OgnlException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.List;

@Slf4j
public class ExpressionTest {
    public static void main(String[] args) throws OgnlException {
        final String expr = "age > 12 or name = \"张三\" ";
        System.err.println("输出结果："+objAssert(expr,new Obj().setAge(20).setName("张三")));
    }

    public static boolean objAssert(String expr,Object obj){
        ObjAssertLexer lexer = new ObjAssertLexer(CharStreams.fromString(expr));//词法分析器
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
        List<String> lexicalError = lexicalListener.getErrMessage();
        List<String> grammarError = errorListener.getErrMessage();
        if (!lexicalError.isEmpty()){
            System.out.println(lexicalError);
        }
        if (!grammarError.isEmpty()){
            System.out.println(grammarError);
        }
        ObjAssertListenerImpl listener = new ObjAssertListenerImpl();
        listener.setInstance(obj);
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, tree); // 使用监听器遍历解析树
        return listener.isAssertFlag();
    }

}
@Data
@Accessors(chain = true)
class Obj{

    String name;

    int age;

}