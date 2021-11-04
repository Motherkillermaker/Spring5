package proxy;

/**
 * @author CJYong
 * @create 2021-08-11 12:48
 */
public class UserDAOImpl implements UserDAO{
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了.....");
        return a + b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了.....");
        return id;
    }
}
