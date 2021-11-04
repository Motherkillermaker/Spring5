package Transaction.service;

import Transaction.DAO.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author CJYong
 * @create 2021-08-12 14:14
 */

@Service
@Transactional(transactionManager = "transactionManager1")
public class UserService {

    //注入DAO
    @Autowired
    private UserDao userDao;

    //转账的方法
    public void accountMoney(){
            //第一步：开启事务

            //第二步：进行业务操作
            //Lucy少100
            userDao.reduceMoney();

            //模拟异常
            int i = 10 / 0;

            //Mary多100
            userDao.addMoney();

            //第三步：没有发生异常，提交事务


            //出现异常，事务的回滚


        }
    }




