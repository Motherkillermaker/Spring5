package spring5;

/**
 * @author CJYong
 * @create 2021-08-07 16:26
 */
public class Department {
        private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
