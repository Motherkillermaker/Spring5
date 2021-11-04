package Notion.DAO;

import org.springframework.stereotype.Repository;

/**
 * @author CJYong
 * @create 2021-08-07 15:35
 */

@Repository(value = "userdaoimpl")
public class UserDAOImpl implements UserDAO{
    @Override
    public void delete() {
        System.out.println("UserDAOlmpl中的delete方法被调用了");
    }
}
