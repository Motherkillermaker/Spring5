package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author CJYong
 * @create 2021-08-11 12:49
 */
public class JDKProxy {

    public static void main(String[] args) {
        //创建接口实现类代理对象
        //newproxyInstance方法的三个参数
        //1.类加载器、
        //2.增强方法所在的类，这个类实现的接口（支持多个接口）
        //3.实现这个接口InvocationHandler,创建代理对象，写增强的部分

        UserDAOImpl userDAO = new UserDAOImpl();
        Class[] interfaces ={UserDAO.class};

        //接口等于实现类的代理对象
        UserDAO DAO = (UserDAO) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDAO));

        int result = DAO.add(1, 2);
        System.out.println("result = " + result);

    }
}

//创建代理对象代码
class UserDaoProxy implements InvocationHandler {

    //1、把创建的是谁的代理对象，把谁传递过来(传递被代类)
    //有参数构造传递
    private Object obj;

    public UserDaoProxy(Object obj) {
        //把传入的对象（被代类）赋值为代理类，并在被代类的基础上增强功能
        this.obj = obj;
    }

    //2、编写增强的逻辑（添加的功能）
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /**
         * proxy: 代理对象
         * Method: 当前方法
         * args: 参数
         */

        //方法之前
        System.out.println("方法之前执行...." + method.getName() + " :传递的参数..." + Arrays.toString(args));

        //被增强的方法执行
        Object res = method.invoke(obj, args);

        //方法之后
        System.out.println("方法之后执行...." + obj);

        return res;
    }
}

