package pojo;

import java.io.Serializable;

public class Boy implements Serializable{
    
    private static final long serialVersionUID = -995917672887486841L;
    private Integer id;
    private String name;
    private String school;
    
    public Boy() {
        
    }
    
    public Boy(Integer id, String name, String school) {
        this.id = id;
        this.name = name;
        this.school = school;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BOY [id = " + id 
                + ", name = " + name 
                + ", school = " + school 
                + "]";
    }
}
