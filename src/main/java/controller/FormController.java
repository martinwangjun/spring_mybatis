package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class FormController {
    @RequestMapping(value="/{formName}")
    public String loginForm(@PathVariable String formName) {
        return "user/" + formName;
    }
}
