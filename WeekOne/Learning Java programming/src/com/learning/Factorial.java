package com.learning;

public class Factorial {
	public static void main(String[] args) {
		System.out.println(factorial(12));
		System.out.println(nonRecursiveFactorial(5));
	}
	
	public static int factorial(int n) {
		if(n == 0)
			return 1;
		return n*factorial(n-1);
	}
	
	public static int nonRecursiveFactorial(int n) {
		int ans=1;
		for(int i=1; i<=n; i++) {
			ans = ans * i;
		}
		return ans;
	}
}
