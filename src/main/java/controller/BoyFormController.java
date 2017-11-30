package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/boy")
public class BoyFormController {
    @RequestMapping(value="{formName}")
    public String showForm(@PathVariable String formName) {
        return "boy/" + formName;
    }
}
