package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.Clerk;

@Controller
@RequestMapping("/clerk")
public class ClerkController {
    @RequestMapping(value="/register", method=RequestMethod.GET)
    public String registerForm(Model model){
        Clerk clerk = new Clerk();
        clerk.setSex("男");
        model.addAttribute("clerk", clerk);
        
//        List<String> sexList = new ArrayList<>();
//        sexList.add("男");
//        sexList.add("女");
//        model.addAttribute("sexList", sexList);

        Map<String, String> sexList = new HashMap<>();
        sexList.put("男", "Male");
        sexList.put("女", "Female");
        model.addAttribute("sexList", sexList);
        
        return "clerk/radioForm";
    }
    
    @RequestMapping(value="/register", method=RequestMethod.POST)
    public String registerResult(
            @RequestParam("sex") String sex,
            Model model) {
        Clerk clerk = new Clerk();
        clerk.setSex(sex);
        model.addAttribute("clerk", clerk);
        return "clerk/radioResult";
    }
}
