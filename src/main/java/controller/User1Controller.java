package controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.User;

@Controller
@RequestMapping(value="/user")
public class User1Controller {
    private static final Log logger = LogFactory.getLog(User1Controller.class);
    
    // @ModelAttribute
    @ModelAttribute
    public void userModel(String loginname, String password, Model model) {
        logger.info("userModel");
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        model.addAttribute("user", user);
    }
    
    @RequestMapping(value="login1")
    public String login(Model model) {
        User user = (User) model.asMap().get("user");
        user.setUsername("Fuck1");
        System.out.println(user);
        return "user/result1";
    }
}
