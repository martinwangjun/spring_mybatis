package controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.Boy;

@Controller
@RequestMapping("/boy")
public class BoyController {
    private static final Logger logger = 
            Logger.getLogger(BoyController.class);

    @RequestMapping(value="/addBoy", method=RequestMethod.GET)
    public String addBoyForm() {
        logger.info("register的GET方法被调用");
         return "boy/addBoyForm01";
    }
    
    @RequestMapping(value="/addBoy", method=RequestMethod.POST)
    public String addBoy(
            @RequestParam("id") Integer id,
            @RequestParam("name") String name,
            @RequestParam("school") String school, 
            Model model) {
        logger.info("register POST方法被调用了");
        Boy boy = new Boy();
        boy.setId(id);
        boy.setName(name);
        boy.setSchool(school);
        logger.info(boy);
        model.addAttribute("boy", boy);
        return "boy/addBoyResult01";
    }
}
