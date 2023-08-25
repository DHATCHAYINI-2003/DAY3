package com.day3.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.day3.demo.model.*;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
