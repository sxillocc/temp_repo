package com.clonning.shallow;

public class Student implements Comparable<Student>{
	public int id;
	public String name;
	public Location location;
	
	public Student(int id, String name, String city, String state) {
		super();
		this.id = id;
		this.name = name;
		location = new Location(city, state);
	}
	
	public String toString() {
		return this.id+" : "+this.name+" from "+this.location.city+", "+this.location.state;
	}
	
	public Student clone() {
		return this;
	}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
	
}