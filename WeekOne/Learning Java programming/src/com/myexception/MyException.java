package com.myexception;

public class MyException extends Exception{
	public int num;
	public MyException(String s, int num) {
		super(s);
		this.num = num;
	}

}
