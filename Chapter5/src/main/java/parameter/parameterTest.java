package parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterTest {


    @Test
    @Parameters({"name","age"})//这里还差一个配置项，配置项仍然在resources里面添加
    public void paramTest1(String name,int age){
        System.out.println("name = "+name + ","+"age="+age);
    }

}