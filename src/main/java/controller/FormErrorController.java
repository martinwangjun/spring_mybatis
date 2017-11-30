package controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pojo.User;
import validator.UserValidator;

@Controller
@RequestMapping("/formerror")
public class FormErrorController {
    private static final Logger logger =
            Logger.getLogger(FormErrorController.class);
    
    @RequestMapping(value="/register",method=RequestMethod.GET)
    public String registerForm(Model model) {
        User user = new User();
        model.addAttribute("user",user);
        return "formerror/registerForm";
    }
    
    @InitBinder
    public void initBinder(DataBinder binder) {
        binder.setValidator(new UserValidator());
    }
    
    @RequestMapping(value="/register", method=RequestMethod.POST)
    public String register(@Validated User user, 
            Errors errors) {
        if (errors.hasFieldErrors()) {
            logger.info(errors);
            return "formerror/registerForm";
        }
        return "formerror/registerResult";
    }
}
