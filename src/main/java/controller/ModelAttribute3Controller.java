package controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.User;

@Controller
@RequestMapping("/user2")
public class ModelAttribute3Controller {
    private static final Logger logger = 
            Logger.getLogger(ModelAttribute3Controller.class);
    private static List<User> userList;
    
    public ModelAttribute3Controller() {
        logger.debug("Logger开始工作");
        userList = new ArrayList<User>();
        User user1 = new User("test", "123", "test user");
        User user2 = new User("admin", "321", "系统管理员");
        userList.add(user1);
        userList.add(user2);
    }
    
    public User find(String loginname, String password) {
        for(User user: userList) {
            if(user.getLoginname().equals(loginname) 
                    && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
    
    @ModelAttribute
    public User userModel3(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password) {
        return find(loginname, password);
    }
    
    @RequestMapping("/login3")
    public String login3() {
        return "user2/result3";
    }
}
