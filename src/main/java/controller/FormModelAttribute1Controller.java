package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user2")
public class FormModelAttribute1Controller {
    @RequestMapping(value="/{formName}")
    public String loginForm(@PathVariable String formName) {
        return "user2/" + formName;
    }
}
