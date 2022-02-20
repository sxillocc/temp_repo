package com.functioninterface;

import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String args[]) {
		Supplier<String> giveSomeName = ()->"Shaktiraj";
		Supplier<Integer> giveSomeNumber = ()->108;
		System.out.println(giveSomeName.get());
		System.out.println(giveSomeNumber.get());
		
		
	}
}
