package autowire;

/**
 * @author CJYong
 * @create 2021-08-10 10:28
 */
public class Emp {

    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void print(){
        System.out.println(dept);
    }
}
