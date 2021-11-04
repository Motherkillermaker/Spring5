package collectType;

/**
 * @author CJYong
 * @create 2021-08-09 10:25
 */
public class Course {

    private  String name;

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}

