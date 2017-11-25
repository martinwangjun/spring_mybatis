package controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.User;

@Controller
@RequestMapping(value="/user")
public class User3Controller {
    private static final Log Logger = LogFactory.getLog(User3Controller.class);
    
    @ModelAttribute
    private void userModel(String loginname, String password,
            ModelAndView mv) {
        Logger.info("userModel in login3.");
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        mv.addObject("user", user);
    }
    
    @RequestMapping(value="/login3")
    private ModelAndView login3(ModelAndView mv) {
        Logger.info("ModelAndView Start.");
        User user = (User)mv.getModel().get("user");
        user.setUsername("User Test - Dummy");
        System.out.println(user);
        mv.setViewName("user/result3");
        return mv;
    }
}
