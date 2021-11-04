package Notion.service;

import Notion.DAO.UserDAO;
import Notion.DAO.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author CJYong
 * @create 2021-08-07 15:32
 */

@Service(value = "userService")   // 类似于 bean id = "userService"
public class Userservice {

    @Value(value = "abc")
    private String name;

    //1.创建UserDAO属性，生成set方法(使用注解生成时可以省略)
//    @Autowired                            //根据属性类型进行自动装配
//    @Qualifier(value = "userdaoimpl")    //根据名称进行注入
//    @Resource                            //根据类型注入
    @Resource(name = "userdaoimpl")     //根据名称注入

    private UserDAO userDAO;


//    public void setUserDAO(UserDAO userDAO) {
//        this.userDAO = userDAO;
//    }

    public void print(){
        System.out.println("service中的方法被调用了....." + name);

        userDAO.delete();

    }

}
