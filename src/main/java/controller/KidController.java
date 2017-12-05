package controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pojo.Kid;

@Controller
@RequestMapping("/kid")
public class KidController {
    private static final Logger logger = 
            Logger.getLogger(KidController.class);
    
    @RequestMapping(value="/register", method=RequestMethod.GET)
    public String loginForm() {
        return "kid/registerForm";
    }
    
    @RequestMapping(value="/register", method=RequestMethod.POST)
    public String register(
            @ModelAttribute Kid kid,
            Model model) {
        logger.info(kid);
        model.addAttribute("kid", kid);
        return "kid/success";
    }
}
