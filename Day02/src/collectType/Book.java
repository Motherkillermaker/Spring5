package collectType;

import java.util.List;

/**
 * @author CJYong
 * @create 2021-08-09 10:35
 */
public class Book {

    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test(){
        System.out.println(list);
    }
}
