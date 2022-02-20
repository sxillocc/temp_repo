package com.example.employees.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employees.entity.Employee;
import com.example.employees.service.EmployeeServices;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeServices service;
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee emp) {
		return service.saveEmployee(emp);
	}
	
	@PostMapping("/addEmployees")
	public List<Employee> addEmployees(@RequestBody List<Employee> employees) {
		return service.saveEmployees(employees);
	}
	
	@GetMapping("/employees")
	public List<Employee> findAllEmployees(){
		return service.getEmployees();
	}
	
	//below used parameter in findEmployeeById(), should come as request URL
	@GetMapping("/employee_id/{id}")
	public Employee findEmployeeById(@PathVariable int id) {
		return service.getEmployeeById(id);
	}
	
	@GetMapping("/employee_department/{name}")
	public List<Employee> findEmployeeByDepartment(@PathVariable  String dept){
		return service.getEmployeeByDepartment(dept);
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id) {
		return service.deleteEmployee(id);
	}
}

