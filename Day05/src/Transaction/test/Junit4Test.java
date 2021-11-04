package Transaction.test;


import Transaction.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.swing.*;

/**
 * @author CJYong
 * @create 2021-08-13 9:18
 */

@RunWith(SpringJUnit4ClassRunner.class)         //单元测试框架
@ContextConfiguration("classpath:bean1.xml")    // 加载配置文件                  //
public class Junit4Test {

    @Autowired
    private UserService userService;

    @Test
    public void test1(){

        userService.accountMoney();

    }


}
