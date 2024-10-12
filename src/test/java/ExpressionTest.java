import com.wj.judge.api.Judge;
import com.wj.judge.exception.GrammarException;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExpressionTest {

    public static void main(String[] args) throws  GrammarException {
        final String expr = "age > 12 as name = \"张三\" ";
        System.err.println("输出结果："+ Judge.verdict(expr,new Obj().setAge(20).setName("张三")));
    }

}
@Data
@Accessors(chain = true)
class Obj{

    String name;

    int age;

}