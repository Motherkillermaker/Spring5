package service;

import DAO.UserDAO;
import DAO.UserDAOImpl;

/**
 * @author CJYong
 * @create 2021-08-07 15:32
 */
public class Userservice {

    //1.创建UserDAO属性，生成set方法
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void print(){
        System.out.println("service中的方法被调用了");

        userDAO.delete();

    }

}
