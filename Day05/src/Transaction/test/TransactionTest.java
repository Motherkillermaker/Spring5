package Transaction.test;

import Transaction.DAO.UserDao;
import Transaction.DAO.UserDaoImpl;
import Transaction.config.TransactionConfig;
import Transaction.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author CJYong
 * @create 2021-08-12 14:23
 */
public class TransactionTest {

    @Test
    /**
     * 使用注解管理事务
     */
    public void test1(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);

        userService.accountMoney();

    }

    @Test
    /**
     * 使用xml文件配置方式管理事务
     */
    public void test2(){

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);

        userService.accountMoney();

    }

    @Test
    /**
     * 完全注解开发
     */
    public void test3(){

        ApplicationContext context = new AnnotationConfigApplicationContext(TransactionConfig.class);
        UserService userService = context.getBean("userService", UserService.class);

        userService.accountMoney();

    }

}
