package com.readwrite;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Notepad {
	private Lock lock;
	private String data;
	
	public Notepad(String initialdata) {
		lock = new ReentrantLock();
		this.data = initialdata;
	}
	
	public void readNotepad() {
		System.out.println("Data: ");
		System.out.println(data);
		System.out.println();
	}
	
	public void writeNotepad(int i, String data, String threadName) {
		lock.lock();
		System.out.println("Writer: "+threadName);
		for(int k=0; k<i; k++) {
			this.data += ("k="+k+data+"\n");
		}
		System.out.println("Writer "+threadName+" Stopped Writing");
		lock.unlock();
	}
}
