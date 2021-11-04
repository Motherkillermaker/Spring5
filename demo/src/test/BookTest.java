package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5.Book;
import spring5.User;

/**
 * @author CJYong
 * @create 2021-08-07 14:54
 */
public class BookTest {

    @Test
    public void testBook(){

        //1 加载 spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2 获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.print();

    }
}
