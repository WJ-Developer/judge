grammar ObjAssert;

@header {
    package com.wj.judge.grammar.objassert;
}

parse : expr EOF ;

//组合规则语法
expr returns [boolean exprValue] : exprSingle (logic exprSingle)* #lableLogicConnect;

//单条规则语法
exprSingle returns [boolean exprSingleValue] :
            PARAM compare VALUE #lableSingle
            | PARAM JUDGE #lableJudge
            | OPEN_PAR expr CLOSE_PAR #lableGroup
            ;

//比较操作符语法
compare : op=(EQ|GT|GT_EQ|LT|LT_EQ|CONTAIN|NOT_CONTAIN|HAVE|NOT_HAVE) ;

//逻辑操作符语法
logic : op=(AND | OR) ;


//比较符
EQ            : '=' | '等于';
NOT_EQ        : '!=' | '不等于';
GT            : '>' | '大于';
GT_EQ         : '>=' | '大于等于';
LT            : '<' | '小于';
LT_EQ         : '<=' |'小于等于';
CONTAIN       : 'contain' | '包含';
NOT_CONTAIN   : 'not_contain' | '不包含';
HAVE          : 'have' | '具备';
NOT_HAVE      : 'not_have' | '不具备';
//判断符
JUDGE         :  'empty' | 'not_empty';
//逻辑符
OR            : 'or' | 'OR' | '或者';
AND           : 'and' | 'AND' | '并且';
//组合词法
OPEN_PAR      : '('| '（';
CLOSE_PAR     : ')'| '）';

//参数的词法
VALUE         : ValueLabel ~[ ]+ ValueLabel | '[' ~[ ]+ ']' | [0-9]+ |'true'|'false'| '#' ~[ ]+;
PARAM         : ~[ \r\n\t]+; //除了空格以外的字符

//比较值标识符
fragment ValueLabel:
    '"'
    | '“'
    | '”'
;

//单行注释
LINE_COMMENT : '//' ~[\r\n]*    -> channel(HIDDEN);
SINGLE_LINE_COMMENT: '--' ~[\r\n]* (('\r'? '\n') | EOF) -> channel(HIDDEN);
//多行注释
MULTILINE_COMMENT: '/*' .*? '*/' -> channel(HIDDEN);
WS        : [\r\n\t]+ -> skip;