package controller;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.Department;
import pojo.Staff;

@Controller
@RequestMapping("/formtag")
public class StaffController {
    private static final Logger logger = 
            Logger.getLogger(BoyController.class);
    
    @RequestMapping(value="/register", method=RequestMethod.GET)
    public String registerForm(Model model) {
        Staff staff = new Staff("刘诗诗", "女", 28);
        model.addAttribute("command", staff);
        return "staff/registerForm";
    }
    
    @RequestMapping(value="/register", method=RequestMethod.POST)
    public String registerResult(
            @RequestParam("name") String name,
            @RequestParam("sex") String sex, 
            @RequestParam("age") Integer age,
            Model model) {
        logger.info("register POST方法被调用了");
        Staff staff = new Staff();
        staff.setAge(age);
        staff.setName(name);
        staff.setSex(sex);
        model.addAttribute("staff", staff);
        return "staff/registerResult";
    }
    
    // ----------------------------------------------------
    
    @RequestMapping(value="/register2", method=RequestMethod.GET)
    public String registerForm2(Model model) {
        Staff staff = new Staff("刘诗诗", "女", 28);
        logger.info(staff);
        model.addAttribute("staff", staff);
        return "staff/registerForm2";
    }
    
    @RequestMapping(value="/register2", method=RequestMethod.POST)
    public String registerResult2(
            @RequestParam("name") String name,
            @RequestParam("sex") String sex, 
            @RequestParam("age") Integer age,
            Model model) {
        logger.info("register POST方法被调用了");
        Staff staff = new Staff();
        staff.setAge(age);
        staff.setName(name);
        staff.setSex(sex);
        model.addAttribute("staff", staff);
        return "staff/registerResult2";
    }
    
    // ------------------------------------------------------
    @RequestMapping(value="/checkboxForm", method=RequestMethod.GET)
    public String checkboxForm(Model model) {
        Staff staff = new Staff("张飞", "男", 18);
        staff.setIsLeader(false);
        
        List<String> skillList = new ArrayList<>();
        skillList.add("JAVA");
        skillList.add("Python");
        staff.setSkills(skillList);
        
        List<Department> depts = new ArrayList<>();
        Department dept = new Department(1, "销售部");
        depts.add(dept);
        
        staff.setDepartments(depts);
        model.addAttribute("staff", staff);
        logger.info(staff);
        
/*        // 页面展现复选框内容
        List<String> skillForCheck = new ArrayList<>();
        skillForCheck.add("JAVA");
        skillForCheck.add("Python");
        skillForCheck.add("C#");
        skillForCheck.add("PHP");
        skillForCheck.add("C++");
        skillForCheck.add("SWIFT");*/
        
        Map<String, String> skillForCheck = new HashMap<>();
        skillForCheck.put("JAVA", "Java程序设计");
        skillForCheck.put("Python", "Python爬虫");
        skillForCheck.put("C#", "ASP.NET MVC");
        
        List<Department> departments = new ArrayList<>();
        departments.add(dept);
        departments.add(new Department(2, "财务部"));
        departments.add(new Department(3, "IT部"));
        
        model.addAttribute("skillsList", skillForCheck);
        model.addAttribute("departmentList", departments);
        
        return "staff/checkboxForm";
    }
    
    @RequestMapping(value="/checkboxForm", method=RequestMethod.POST)
    public String checkboxResult(
            @RequestParam("name") String name,
            @RequestParam(value="isLeader", required=false, defaultValue="false") Boolean isLeader,
            @RequestParam(value="skills", required=false) List<String> skills,
            @RequestParam(value="departments") List<String> departments,
            Model model) {
        logger.info("checkboxForm register POST方法");
        
        // 判断是否是null，否则会造成问题
        if(skills == null) {
            skills = new ArrayList<>();
        }
        
        List<Department> depts = new ArrayList<>(); 
        
        Staff staff = new Staff();
        staff.setName(name);
        staff.setAge(12);
        staff.setSex("男");
        staff.setIsLeader(isLeader);
        staff.setSkills(skills);
        skills.forEach(obj->System.out.println(obj));
        
        logger.info(staff);
        model.addAttribute("staff", staff);
        return "staff/checkboxResult";
    }
    
    // ------------------------------------------------------
    
    
    
}
