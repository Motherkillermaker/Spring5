package spring5;

import java.util.Map;

/**
 * @author CJYong
 * @create 2021-08-07 14:39
 */

/**
 * 使用set方法进行属性注入
 */
public class Book {
    //创建属性
    private String name;
    private String author;
    private String address;

    //创建属性对象的set方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void print(){
        System.out.println("name = " + name + "   author = " + author
                + "  address = " + address + " address的长度为：" + address.length());
    }
}
