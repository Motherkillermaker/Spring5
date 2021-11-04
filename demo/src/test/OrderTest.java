package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5.Book;
import spring5.Order;

/**
 * @author CJYong
 * @create 2021-08-07 15:01
 */
public class OrderTest {

    @Test
    public void testOrder(){

        //1 加载 spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2 获取配置创建的对象
        Order order = context.getBean("order", Order.class);
        System.out.println(order);
        order.print();


    }

}
