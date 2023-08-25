package com.day3.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.day3.demo.model.Employee;
import com.day3.demo.service.EmployeeService;


@RestController
public class EmployeeController {
	@Autowired
  EmployeeService ser;
	@PostMapping("add")
	public Employee adddata(@RequestBody Employee e) {
		return ser.saveinfo(e);
	}
	@GetMapping("print")
	public List<Employee> show(){
		return ser.show();
	}

}