package com.example.employees.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employees.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	List<Employee> findByDepartment(String dept);


	
}
