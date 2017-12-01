package controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import pojo.User;

@Controller
@RequestMapping("/useri18n")
public class UserI18nController {
    private static final Logger logger = 
            Logger.getLogger(UserI18nController.class);
    
    @RequestMapping(value="{formName}")
    public String loginForm(
            @PathVariable String formName,
            Model model) {
        User user = new User();
        model.addAttribute("user", user);        
        return "useri18n/" + formName;
    }
}
