package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(1100, "S1"));
		studentList.add(new Student(1005, "S2"));
		studentList.add(new Student(1001, "S3"));
		studentList.add(new Student(1002, "S4"));
		studentList.add(new Student(1010, "S5"));
		
		Collections.sort(studentList);
		
		for(Student x: studentList) {
			System.out.println(x.id+" "+x.name);
		}
 	}
}
