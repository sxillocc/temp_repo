package com.example.employees.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employees.entity.Employee;
import com.example.employees.repository.EmployeeRepository;

@Service
public class EmployeeServices{
	
	@Autowired
	private EmployeeRepository repository;
	
	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}
	
	public List<Employee> saveEmployees(List<Employee> employees){
		return repository.saveAll(employees);
	}
	
	
	public List<Employee> getEmployees(){
		return repository.findAll();
	}
	
	public Employee getEmployeeById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	public List<Employee> getEmployeeByDepartment(String dept){
		return repository.findByDepartment(dept);
	}
	
	public String deleteEmployee(int id) {
		repository.deleteById(id);
		return "Deleted: " + id;
	}
	
	public Employee updateEmployee(Employee e) {
		Employee t = repository.findById(e.getId()).orElse(null);
		
		if(t != null) {
			t.setName(e.getName());
			t.setDepartment(e.getDepartment());
			t.setCity(e.getCity());
			return repository.save(t);
		}
		
		return null;
	}

	
}
