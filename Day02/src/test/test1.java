package test;

import autowire.Emp;
import collectType.Book;
import collectType.Course;
import collectType.Orders;
import collectType.Stu;
import factorybean.Mybean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CJYong
 * @create 2021-08-09 10:17
 */
public class test1 {

    @Test
    public void test(){
        //读取配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取创建的实例
        Stu stu = context.getBean("stu", Stu.class);
        //调用方法
        stu.test();
    }

    @Test
    public void test2(){
        //读取配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        //获取创建的实例
        Book book = context.getBean("book", Book.class);
        //调用方法
        book.test();
    }

    @Test
    public void test3(){
        //读取配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        //获取创建的实例
        Course course = context.getBean("myBean", Course.class);
        //调用方法
        System.out.println(course);
    }

    @Test
    public void test4(){
        //1.读取配置文件
//      ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        //2.获取bean对象
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建 bean 实例对象");
        System.out.println(orders);

        //3.手动让 bean 实例销毁
        context.close();

        }

    @Test
    public void test5(){
        //读取配置文件
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        //获取创建的实例
        Emp emp = context.getBean("emp", Emp.class);
        //调用方法
        System.out.println(emp);
    }
}
