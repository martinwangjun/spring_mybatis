package controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user2")
public class ModelAttribute2Controller {
    private static final Logger logger = Logger.getLogger(ModelAttribute2Controller.class);
    
    @ModelAttribute
    public void userModel2(
            @RequestParam("loginname") String loginname,
            @RequestParam("password") String password,
            Model model
            ) {
        model.addAttribute("loginname", loginname);
        model.addAttribute("password", password);
    }
    
    @RequestMapping("/login2")
    public String login() {
        logger.debug("login2 works");;
        return "user2/result2";
    }
}
