package com.wj.judge.api;

import cn.hutool.core.collection.CollUtil;
import com.wj.judge.grammar.objassert.ObjAssertBaseListener;
import com.wj.judge.grammar.objassert.ObjAssertParser;
import com.wj.judge.grammar.utils.CompareOp;
import com.wj.judge.grammar.utils.CompareUtils;
import com.wj.judge.grammar.utils.GrammarErrException;
import com.wj.judge.grammar.utils.LogicOp;
import lombok.Data;
import ognl.Ognl;
import ognl.OgnlException;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

@Data
public class ObjAssertListenerImpl extends ObjAssertBaseListener {


    /** 运算比较的参数值 */
    private Object instance;

    /** 运算比较的结果 */
    private boolean assertFlag;

    /** 运算比较的过程信息 */
    private List<String> messages = CollUtil.newArrayList();

    @Override
    public void exitParse(ObjAssertParser.ParseContext ctx) {
        this.assertFlag = ctx.expr().exprValue;
    }

    private Object getValue(String key){
        Object obj = null;
        try {
            obj = Ognl.getValue(key, instance);
        } catch (OgnlException e) {
            throw new GrammarErrException("Ognl取值失败：",e);
        }
        return obj;
    }

    @Override
    public void exitLableSingle(ObjAssertParser.LableSingleContext ctx) {
        Object param = getValue(ctx.PARAM().getText());
        String value = ctx.VALUE().getText().replace("\"","");//去掉参数标识符
        value = value.replace("#","");//去掉参数标识符
        CompareOp compare = CompareOp.fromString(ctx.compare().op.getText());
        ctx.exprSingleValue = CompareUtils.compare(param,compare,value);
        String message = String.format("[比较参数] %s %s %s -> %s", param, compare, value,ctx.exprSingleValue);
        messages.add(message);
    }

    @Override
    public void exitLableJudge(ObjAssertParser.LableJudgeContext ctx) {
        Object param = getValue(ctx.PARAM().getText());
        if (ctx.JUDGE().getText().toLowerCase().equals("empty")) {
            if (param==null){
                ctx.exprSingleValue = true;
            }else if (param instanceof String && StringUtils.isBlank(param.toString())){
                ctx.exprSingleValue = true;
            }else{
                ctx.exprSingleValue = false;
            }
        }else if (ctx.JUDGE().getText().toLowerCase().equals("not_empty")) {
            if (param==null){
                ctx.exprSingleValue = false;
            }else if (param instanceof String && StringUtils.isBlank(param.toString())){
                ctx.exprSingleValue = false;
            }else{
                ctx.exprSingleValue = true;
            }
        }
        String message = String.format("[数据判定] %s %s -> %s", param, ctx.JUDGE().getText(),ctx.exprSingleValue);
        messages.add(message);
    }

    /**
     * 逻辑连接判断处理
     */
    @Override
    public void exitLableLogicConnect(ObjAssertParser.LableLogicConnectContext ctx) {
        boolean flag = ctx.exprSingle().get(0).exprSingleValue;
        for (int i = 0; i < ctx.logic().size(); i++) {
            ObjAssertParser.LogicContext logicContext = ctx.logic().get(i);
            ObjAssertParser.ExprSingleContext singleContext = ctx.exprSingle(i+1);
            if (LogicOp.AND.is(logicContext.op.getText())) {
                flag = flag && singleContext.exprSingleValue;
            }else{
                flag = flag || singleContext.exprSingleValue;
            }
        }
        ctx.exprValue = flag;
    }




    /**
     * 分组结果判断处理
     * */
    @Override
    public void exitLableGroup(ObjAssertParser.LableGroupContext ctx) {
        ctx.exprSingleValue = ctx.expr().exprValue;
    }

}
