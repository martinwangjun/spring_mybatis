package controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/user2")
public class ModelAttribute1Controller {
    
    private static final Logger logger = Logger.getLogger(ModelAttribute1Controller.class);
    
    // @ModelAttribute修饰的方法会先于login1调用
    // 使用@ModelAttribute注释的value属性，来指定model属性的名称,model属性对象就是方法的返回值
    @ModelAttribute(value="loginname")
    public String userModel1(
            @RequestParam("loginname") String loginname) {
        logger.debug(loginname + "@" + System.currentTimeMillis());
        return loginname;
    }
    
    @RequestMapping(value="/login1")
    public String login1(Model model) {
        logger.debug("login1 Starts!!!! @ " + System.currentTimeMillis());
        return "user2/result1";
    }
}
