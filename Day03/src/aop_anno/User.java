package aop_anno;

import org.springframework.stereotype.Component;

/**
 * @author CJYong
 * @create 2021-08-11 14:15
 */

//被增强类
@Component
public class User {

    public void add() {
        System.out.println("add.......");
    }
}
