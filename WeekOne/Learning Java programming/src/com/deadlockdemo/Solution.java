package com.deadlockdemo;

public class Solution {
	public static void main(String[] args) {
		Resource1 r1 = new Resource1();
		Resource2 r2 = new Resource2();
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				synchronized(r2){
					try {
						synchronized(r1) {
							try {
								sleep(2000);
								System.out.println("Block 1");
								
							}catch(Exception e) {}
						}
					}catch(Exception e) {}
				}
			}
			
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				synchronized(r1){
					try {
						synchronized(r2) {
							try {
								sleep(2000);
								System.out.println("Block 2");
								
							}catch(Exception e) {}
						}			
					}catch(Exception e) {}
				}
			}			
		};
		
 		t1.start();
		t2.start();
		
	}
}
