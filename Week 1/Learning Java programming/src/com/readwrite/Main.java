package com.readwrite;

public class Main {
	public static void main(String[] args) {
		Notepad notepad = new Notepad("");
		UserThreads t1 = new UserThreads("User-1", notepad);
		UserThreads t2 = new UserThreads("User-2", notepad);
		t1.start();
		t2.start();
	}
}

