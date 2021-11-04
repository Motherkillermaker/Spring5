package test;

import Notion.config.SpringConfig;
import Notion.service.Userservice;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CJYong
 * @create 2021-08-10 12:52
 */
public class testSpring5 {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Userservice userService = context.getBean("userService", Userservice.class);
        System.out.println(userService);
        userService.print();
    }

    @Test
    public void test2(){
        //加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //获取对象
        Userservice userService = context.getBean("userService", Userservice.class);
        System.out.println(userService);
        userService.print();
    }
}
