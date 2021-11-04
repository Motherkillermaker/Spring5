package aop_anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author CJYong
 * @create 2021-08-11 14:16
 */

//增强类
@Component
@Aspect  //生成代理对象
@Order(4)
public class UserProxy {

    //相同切入点的抽取
    @Pointcut(value = "execution(* aop_anno.User.add(..))")
    public void pointDemo(){
    }

    //前置通知(before注解表示前置通知)
    @Before(value = "pointDemo()")
    public void before() {

        System.out.println("before......");
    }

    //最终通知(有无异常都返回通知)
    @After(value = "pointDemo()")
    public void after(){
        System.out.println("after.........");
    }

    //后置通知（返回通知 / 有异常不返回通知）
    @AfterReturning(value = "execution(* aop_anno.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning.........");
    }

    //异常通知
    @AfterThrowing(value = "execution(* aop_anno.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing.........");
    }

    //环绕通知
    @Around(value = "execution(* aop_anno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{

        System.out.println("环绕之前.........");

        //被增强的方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后.........");
    }

}



