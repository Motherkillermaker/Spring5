package factorybean;

import collectType.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author CJYong
 * @create 2021-08-09 10:51
 */
public class Mybean implements FactoryBean<Course> {

    @Override
    /**
     * 定义返回的bean
     */
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setName("java");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
