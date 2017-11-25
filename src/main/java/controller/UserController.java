package controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.User;

@Controller
@RequestMapping(value="/user")
public class UserController {
    private static List<User> userList;
    
    public UserController() {
        userList = new ArrayList<>();
    }
    
    private static final Log logger = LogFactory.getLog(UserController.class);
    
    @RequestMapping(value="/register", method=RequestMethod.GET)
    public String registerForm() {
        logger.info("register GET方法被调用");
        return "user/registerForm";
    }
    
    @RequestMapping(value="/register",method=RequestMethod.POST)
    public String register(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password,
            @RequestParam("username") String username
            ) {
        logger.info("register POST方法被调用了");
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername(username);
        userList.add(user);
        
        return "user/loginForm";
    }
    
    @RequestMapping(value="/login")
    public String login(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password,
            Model model
            ) {
        logger.info("loginname: " + loginname + " password: " + password);
        for(User user: userList) {
            if(user.getLoginname().equals(loginname)
                    && user.getPassword().equals(password)) {
                model.addAttribute("user", user);
                return "user/welcome";
            }
        }
        return "user/loginForm";
    }
    
    @RequestMapping(value="list", method=RequestMethod.POST)
    public String userList(
        @RequestParam("loginname") String loginname,
        @RequestParam("password") String password,
        @RequestParam("username") String username,
        Model model
        ) {
        logger.info("userList方法被调用了");
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername(username);
        userList.add(user);
        
        model.addAttribute("userList", userList);
        return "user/userList";
    }
    
    @RequestMapping(value="list", method=RequestMethod.GET)
    public String list() {
        logger.info("userList GET方法被调用了");
        return "user/userList";
    }
    
}
