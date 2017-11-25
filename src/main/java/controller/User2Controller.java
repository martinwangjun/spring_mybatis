package controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.User;

@Controller
@RequestMapping(value="/user")
public class User2Controller {
    private static final Logger logger = Logger.getLogger(User2Controller.class);
    
    @ModelAttribute
    private void userModel(String loginname, String password, ModelMap modelMap) {
        logger.info("User2Controller启动");
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        modelMap.addAttribute("user", user);
    }
    
    @RequestMapping(value="login2")
    public String login(ModelMap modelMap) {
        logger.info("User2Controller的login2被调用");
        User user = (User)modelMap.get("user");
        System.out.println(user);
        user.setUsername("测试ModelMap的User");
        return "user/result2";
    }
}
