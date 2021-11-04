package Transaction.test;

import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author CJYong
 * @create 2021-08-13 9:12
 */
public class FunctionTest {

    @Test
    /**
     * 函数式风格创建对象，交给spring管理
     */
    public void test1(){
        //1 创建 GenericApplicationContext 对象
        GenericApplicationContext context = new GenericApplicationContext();

        //2 调用 context 的方法对象注册
        context.refresh();
        context.registerBean("user1",User.class,() -> new User());

        //3 获取在 spring 注册的对象
        // User user = (User)context.getBean("com.atguigu.spring5.test.User");
        User user = (User)context.getBean("user1");
        System.out.println(user);


    }

    class User{

    }
}
