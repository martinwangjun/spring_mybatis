package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user2")
public class ModelAttribute4Controller {

    /**
     * 如果@RequestMapping和@ModelAttribute同时修饰一个方法，
     * 那么这个时候：
     * 1. return的"admin"就不是View的名称，而是model中"username"的值
     * 2. 这个时候的视图就是"login4"，结合这个类完整的代码，这个视图就是
     *    "user2/login4.jsp"
     * 
     * @return
     */
    @RequestMapping(value="/login4")
    @ModelAttribute(value="username")
    public String login4() {
        return "admin"; 
    }
    
}
