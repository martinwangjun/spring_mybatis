package controller;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController{
    private static final Logger logger = Logger.getLogger(HelloController.class);
    
    @RequestMapping(value="/hello")
    public ModelAndView hello() {
        logger.info("hello方法被调用");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello World by Annotation! @ " + new Date());
        mv.setViewName("/WEB-INF/content/welcome.jsp");
        return mv;
    }
    
    @RequestMapping(value="/helloWorld", method=RequestMethod.GET)
    public String helloWorld(Model model) {
        return "helloWorld";
    }
}
