package com.day3.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.day3.demo.model.Employee;
import com.day3.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
  @Autowired
	EmployeeRepository re;
  public Employee saveinfo(Employee e) {
	  return re.save(e);
  }
  public List<Employee> show(){
	  return re.findAll();
  }
}