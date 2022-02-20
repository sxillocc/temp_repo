package com.readwrite;


public class UserThreads implements Runnable{
	
	private Thread t;
	private String threadName;
	private Notepad notepad;
	
	public UserThreads(String name, Notepad notepad) {
		threadName = name;
		this.notepad = notepad;
	}
	
	public void run() {
		System.out.println("Inside Thread: "+ threadName);
		notepad.writeNotepad(5, "Hello World", threadName);
		notepad.readNotepad();
		System.out.println("Thread is terminating");
	}
	public void start() {
		if(t==null) {
			t = new Thread(this, threadName);
			t.start();
			notepad.readNotepad();
		}
	}
}



