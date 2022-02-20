package com.functioninterface;

import java.util.function.Predicate;

//Predicate is a Functional Interface 
//abstract method is boolean test(T t)
//Syntax - Predicate<T> some_instance = parameter -> return_value;


public class PredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> isEqual = i->(i%2==0);
		System.out.println(isEqual.test(5));
	}

}
