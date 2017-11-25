package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.User;

@Controller
@RequestMapping("/user2")
public class ModelAttribute5Controller {
    
    //  model属性名称就是value值，也就是"user"
    @ModelAttribute("user")
    public User userModel5(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password) {
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        return user;
    }
    
    @RequestMapping("/login5")
    public String login5(
            @ModelAttribute("user") User user) {
        user.setUsername("管理员");
        return "user2/result5";
    }
}
