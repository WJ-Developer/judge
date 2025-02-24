package com.wj.judge.grammar.compare;

import com.wj.judge.grammar.compare.impl.*;
import com.wj.judge.grammar.utils.CompareOp;

public class Compare {

    public static boolean compare(Object param, CompareOp compare, String value){
        if (CompareOp.EQ.equals(compare)) {
            return CompareHandlerByEQ.instance.compare(param,value);
        }
        if (CompareOp.NOT_EQ.equals(compare)) {
            return !CompareHandlerByEQ.instance.compare(param,value);
        }
        if (CompareOp.GT.equals(compare)) {
            return CompareHandlerByGT.instance.compare(param,value);
        }
        if (CompareOp.GT_EQ.equals(compare)) {
            return CompareHandlerByGT.instance.compare(param,value)||CompareHandlerByEQ.instance.compare(param,value);
        }
        if (CompareOp.LT.equals(compare)) {
            return CompareHandlerByLT.instance.compare(param,value);
        }
        if (CompareOp.LT_EQ.equals(compare)) {
            return CompareHandlerByLT.instance.compare(param,value)||CompareHandlerByEQ.instance.compare(param,value);
        }
        if (CompareOp.HAVE.equals(compare)) {
            return CompareHandlerByHAVE.instance.compare(param,value);
        }
        if (CompareOp.NOT_HAVE.equals(compare)) {
            return !CompareHandlerByHAVE.instance.compare(param,value);
        }
        if (CompareOp.CONTAIN.equals(compare)) {
            return CompareHandlerByCONTAIN.instance.compare(param,value);
        }
        if (CompareOp.NOT_CONTAIN.equals(compare)) {
            return !CompareHandlerByCONTAIN.instance.compare(param,value);
        }
        return false;
    }
}
