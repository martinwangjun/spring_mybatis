package controller;

import javax.servlet.http.HttpSession;

import org.apache.log4j.chainsaw.Main;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pojo.User;

@Controller
@RequestMapping("/login")
public class UserLoginController {
    
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String login() {
        return "login/loginForm";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public ModelAndView login(
            String loginname, String password,
            ModelAndView mv, HttpSession session) {
        if(loginname != null && loginname.equals("martin")
                && password!= null && password.equals("123456")) {
            User user = new User();
            user.setLoginname(loginname);
            user.setPassword(password);
            user.setUsername("管理员");
            session.setAttribute("user", user);
            mv.setViewName("redirect: main");
        } else {
            mv.addObject("message", "登录名或密码错误");
            mv.setViewName("login/loginForm");
        }
        return mv;
    }
    
    @RequestMapping(value="/main")
    public String detail() {
        return "login/main";
    }
    
    @RequestMapping(value="/logout", method=RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "login/loginForm";
    }
}
