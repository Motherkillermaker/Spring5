package Notion.spring5;

/**
 * @author CJYong
 * @create 2021-08-07 16:26
 */
public class employee {
    private String ename;
    private String gender;

    //员工属于某一个部门，使用对象形式表示
    private Department dept;

    public void setDept(Department dept) {
        this.dept = dept;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public Department getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "employee{" +
                "ename='" + ename + '\'' +
                ", gender='" + gender + '\'' +
                ", dept=" + dept +
                '}';
    }
}
