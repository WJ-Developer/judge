import com.wj.judge.api.Judge;
import com.wj.judge.exception.GrammarException;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class ExpressionTest {

    public static void main(String[] args) throws  GrammarException {
        final String expr = "age > 12 or name = \"张三\" ";
        Map<String,Object> map = new HashMap<>();
        map.put("age",20);
        map.put("name","张三");
        //System.err.println("输出结果："+ Judge.verdictTrack(expr,new Obj().setAge(20).setName("张三")));
        System.err.println("输出结果："+ Judge.verdictTrack(expr,map));
    }

    public void test() throws GrammarException {
        final String expr = "age > 12 or name = \"张三\" ";
        System.err.println("输出结果："+ Judge.verdictTrack(expr,new Obj().setAge(20).setName("张三")));
    }

}
@Data
@Accessors(chain = true)
class Obj{

    String name;

    int age;

}