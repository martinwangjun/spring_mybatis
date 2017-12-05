package pojo;

import java.io.Serializable;
import java.util.Date;

public class Kid implements Serializable{

    private static final long serialVersionUID = -615891657486627517L;
    private String loginname;
    private Date birthday;
    
    public Kid() {
        
    }
    public String getLoginname() {
        return loginname;
    }
    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }
    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    @Override
    public String toString() {
        return "Kid [loginname = " + loginname + ", birthday = " + birthday + "]";
    }
}
