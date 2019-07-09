package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Employee;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@RequestMapping("/welcome")
	public String showWelcome(ModelMap map) {
		map.addAttribute("message","Hello UI");
		List<Employee> emps=Arrays.asList(
				new Employee(101,"YDixit",987.65),
				new Employee(102,"SDixit",997.65),
				new Employee(103,"ADixit",999.65)
				);
		map.addAttribute("list",emps);
		return "Welcome";
	}
	@RequestMapping("/reg")
	public String showReg(ModelMap map) {
		map.addAttribute("employee",new Employee());
		return "Register";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveData(@ModelAttribute Employee employee, ModelMap map) {
		
		map.addAttribute("employee",employee);
		
		return "Info";
	}
	
	
}
