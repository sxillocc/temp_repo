package com.learning;


public class Overloaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(overloader(5));
		System.out.println(overloader(5,5));
		System.out.println(overloader(5,5,5));
	}
	
	public static int overloader(int x) {
		return x*x;
	}
	
	public static int overloader(int x, int y) {
		return x+y;
	}
	public static int overloader(int x, int y, int z) {
		double s = (x+y+z)/2.0;
		double ans = Math.sqrt((s*(s-x)*(s-y)*(s-z)));
		return (int) ans;
	}

}
