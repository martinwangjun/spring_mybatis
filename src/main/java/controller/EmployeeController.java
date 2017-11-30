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

import pojo.Department;
import pojo.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @RequestMapping(value="/register", method=RequestMethod.GET)
    public String selectForm(Model model) {
        Employee employee = new Employee();
        employee.setDeptId(2);
        model.addAttribute("employee", employee);
        return "employee/selectForm";
    }
    
    @RequestMapping(value="/register1", method=RequestMethod.GET)
    public String selectForm1(Model model) {
        Employee employee = new Employee();
        employee.setDeptId(2);
        model.addAttribute("employee", employee);
        
        Map<Integer, String> mapDept = new HashMap<>();
        mapDept.put(1, "财务部");
        mapDept.put(2, "开发部");
        mapDept.put(3, "销售部");
        model.addAttribute("depts", mapDept);
        
        return "employee/selectForm1";
    }
    
    @RequestMapping(value="/register2", method=RequestMethod.GET)
    public String selectForm2(Model model) {
        Employee employee = new Employee();
        employee.setDeptId(2);
        model.addAttribute("employee", employee);
        
        Map<Integer, String> mapDept = new HashMap<>();
        mapDept.put(1, "财务部");
        mapDept.put(2, "开发部");
        mapDept.put(3, "销售部");
        model.addAttribute("depts", mapDept);
        
        return "employee/selectForm2";
    }
    
    @RequestMapping(value="/register3", method=RequestMethod.GET)
    public String selectForm3(Model model) {
        Employee employee = new Employee();
        employee.setDeptId(2);
        model.addAttribute("employee", employee);
        
        List<Department> deptList = new ArrayList<>();
        deptList.add(new Department(1, "财务部"));
        deptList.add(new Department(2, "开发部"));
        deptList.add(new Department(3, "IT部"));
        model.addAttribute("depts", deptList);
        
        return "employee/selectForm3";
    }
    
    @RequestMapping(value="/register", method=RequestMethod.POST)
    public String selectResult(
            @RequestParam("deptId") Integer deptId,
            Model model) {
        Employee employee = new Employee();
        employee.setDeptId(deptId);
        model.addAttribute("employee", employee);
        return "employee/selectResult";
    }
}
