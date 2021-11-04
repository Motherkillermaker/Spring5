package Transaction.test;


import Transaction.service.UserService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author CJYong
 * @create 2021-08-13 9:18
 */

//@ExtendWith(SpringExtension.class)                  //单元测试框架
//@ContextConfiguration("classpath:bean1.xml")        // 加载配置文件
@SpringJUnitConfig(locations = "classpath:bean1.xml")
public class Junit5Test {

    @Autowired
    private UserService userService;

    @Test
    public void test1(){

        userService.accountMoney();

    }


}
