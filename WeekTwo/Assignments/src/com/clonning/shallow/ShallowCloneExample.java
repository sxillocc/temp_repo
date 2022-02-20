package com.clonning.shallow;


public class ShallowCloneExample {
	public static void main(String args[]) {
		
		Student s1 = new Student(1001, "Student1", "Delhi", "Delhi");
		Student s2 = s1.clone();
		
		s1.name = "Student2";
		s2.location.state = "Maharashtra";
		System.out.println(s1.toString());
		System.out.println(s2.toString());
	}
}
