package test;

import aop_anno.User;
import aop_xml.Book;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CJYong
 * @create 2021-08-11 14:41
 */
public class TestAop {
    @Test
    public void test1(){
        //读取配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop_1.xml");
        //使用注解扫描，默认名称为类名首字母小写
        User user = context.getBean("user", User.class);
        //调用方法
        user.add();
    }

    @Test
    public void test2(){
        //读取配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop_2.xml");
        //使用注解扫描，默认名称为类名首字母小写
        Book book = context.getBean("book", Book.class);
        //调用方法
        book.buy();
    }

}
