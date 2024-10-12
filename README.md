# judge

> judge（法官）是一门用于对象判定的表达式语言，用于判断某个对象是否符合某种条件，语法类似于SQL的where语句。
>

输入：表达式和对象

```java
    public void test() throws GrammarException {
        final String expr = "age > 12 or name = \"张三\" ";
        System.err.println("判定结果：" + Judge.verdictTrack(expr,new Obj().setAge(20).setName("张三")));
    }
```

输出：布尔值

> [比较参数] 20 GT 12 -> true
> [比较参数] 张三 EQ 张三 -> true
> 判定结果：true

