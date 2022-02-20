package com.example.employees.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeTable")
public class Employee {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name, department, city;
	
	public Employee(int id, String name, String department, String city) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.city = city;
	}
	public Employee(String name, String department, String city) {
		super();
		this.name = name;
		this.department = department;
		this.city = city;
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
