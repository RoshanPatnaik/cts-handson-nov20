package com.org;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping(value="/getAllEmployees", method = RequestMethod.GET)
	public ModelAndView viewAllEmployees() {
		List<Employee> list = service.fetchAllEmployees();
		ModelAndView mav = new ModelAndView("index", "list", list);
		return mav;
	}
	
	
	
	
}
