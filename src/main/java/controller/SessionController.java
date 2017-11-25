package controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import pojo.User;

@Controller
@RequestMapping(value = "/useradmin")
//将Model中的属性名为user的放入HttpSession对象当中
@SessionAttributes("user")
public class SessionController {
    private static final Logger logger = Logger.getLogger(SessionController.class);
    
    @RequestMapping(value="{formName}")
    public String loginForm(
            @PathVariable String formName) {
        return "useradmin/" + formName;
    }
    
    @RequestMapping(value="/login")
    public String login(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password,
            Model model
            ) {
        User user = new User();
        user.setLoginname(loginname);
        user.setPassword(password);
        user.setUsername("Admin");
        model.addAttribute("user", user);
        logger.debug(user);
        return "useradmin/" + "welcome";
    }
}
