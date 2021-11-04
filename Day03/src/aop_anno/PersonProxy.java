package aop_anno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author CJYong
 * @create 2021-08-11 15:05
 */

@Component
@Aspect
@Order(2)
public class PersonProxy {

    @Before(value = "execution(* aop_anno.User.add(..))")
    public void before(){
        System.out.println("person before.....");
    }

}
