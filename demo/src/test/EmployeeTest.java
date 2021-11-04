package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5.employee;
/**
 * @author CJYong
 * @create 2021-08-07 16:37
 */
public class EmployeeTest {

    @Test
    public void EmpTest(){

        //1 加载 spring 配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        //2 获取配置创建的对象
        employee emp = context.getBean("emp", employee.class);
        System.out.println(emp);
        emp.toString();


    }
}
