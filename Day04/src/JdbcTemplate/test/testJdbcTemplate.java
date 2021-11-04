package JdbcTemplate.test;

import JdbcTemplate.DAO.Book;
import JdbcTemplate.service.BookService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CJYong
 * @create 2021-08-11 16:58
 */
public class testJdbcTemplate {

    @Test
    /**
     * 添加测试
     */
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book(7,"python","潇湘阁");

        bookService.add(book);

    }

    @Test
    /**
     * 修改测试
     */
    public void test2(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book(7,"c++","张志彤");

        bookService.update(book);

    }

    @Test
    /**
     * 删除测试
     */
    public void test3(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        bookService.delete(7);

    }

    @Test
    /**
     * 特殊值查询操作
     */
    public void test4(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        int count = bookService.findCount();

        System.out.println(count);

    }

    @Test
    /**
     * 查询返回一个对象
     */
    public void test5(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = bookService.queryForOne(2);

        System.out.println(book);

    }

    @Test
    /**
     * 查询返回list集合
     */
    public void test6(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        List<Book> books = bookService.queryForList();

        System.out.println(books);

    }

    @Test
    /**
     * 批量添加
     */
    public void test7(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"7","java","a"};
        Object[] o2 = {"8","c++","b"};
        Object[] o3 = {"9","MySQL","c"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);

        bookService.batchAdd(batchArgs);
    }

    @Test
    /**
     * 批量修改
     */
    public void test8(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        //批量修改
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"java0909","a3","3"};
        Object[] o2 = {"c++1010","b4","4"};
        Object[] o3 = {"MySQL1111","c5","5"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        //调用方法实现批量修改
        bookService.batchUpdate(batchArgs);
    }

    @Test
    /**
     * 批量修改
     */
    public void test9(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        //批量删除
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        batchArgs.add(o1);
        batchArgs.add(o2);

        //调用方法实现批量删除
        bookService.batchDelete(batchArgs);
    }


}
