package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Userservice;
import spring5.Book;

/**
 * @author CJYong
 * @create 2021-08-07 16:17
 */
public class BeanTest {

    @Test
    public void test(){
        //1 加载 spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        //2 获取配置创建的对象
        Userservice userService = context.getBean("userService", Userservice.class);
        System.out.println(userService);
        userService.print();

    }
}
