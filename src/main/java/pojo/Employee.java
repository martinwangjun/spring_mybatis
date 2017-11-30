package pojo;

import java.io.Serializable;

public class Employee implements Serializable{

    private static final long serialVersionUID = 6626437952847147153L;
    private Integer deptId;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }
}
