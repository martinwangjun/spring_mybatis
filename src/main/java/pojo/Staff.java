package pojo;

import java.util.List;
import java.io.Serializable;

public class Staff  implements Serializable{
    private static final long serialVersionUID = -7068061635875338678L;
    private String name;
    private String sex;
    private Integer age;
    private boolean isLeader;
    private List<String> skills;
    private List<Department> departments;
    
    public Staff(){
        
    }
    
    public Staff(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public boolean getIsLeader() {
        return isLeader;
    }
    public void setIsLeader(boolean isLeader) {
        this.isLeader = isLeader;
    }
    public List<String> getSkills() {
        return skills;
    }
    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
    public List<Department> getDepartments() {
        return departments;
    }
    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Staff [name = " + name 
                + ", sex = " + sex
                + ", age = " + age 
                + "]";
    }
}
