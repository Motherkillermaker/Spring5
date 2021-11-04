package Notion.spring5;

/**
 * @author CJYong
 * @create 2021-08-07 14:57
 */

/**
 * 有参数的构造注入属性
 */
public class Order {

    //创建属性
    private String name;
    private String id;

    //创建有参构造器
    public Order(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void print(){
        System.out.println("name = " + name + "  id = " + id);
    }

}
