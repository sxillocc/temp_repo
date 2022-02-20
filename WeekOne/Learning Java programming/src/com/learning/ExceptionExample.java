package com.learning;

public class ExceptionExample {
	
	
	public static void main(String[] args) {
		try {
			System.out.println(10/0); // Arthematic exception
		} catch(ArithmeticException e) {
			System.out.println("E1");
		}
	}
}
