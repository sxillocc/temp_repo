package com.cyclic.barrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
	public static int totalThreads = 3;
	public static int x = 2;
	public static CyclicBarrier mCyclicBarrier = new CyclicBarrier(totalThreads);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread() {
			public void run() {
				try {
					Thread.sleep(5000);
					x = x + 2;
					
					System.out.println("t1: number of thread awaiting here is "+mCyclicBarrier.getNumberWaiting()); 
					System.out.println("t1: I'm going to await state");
					mCyclicBarrier.await();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				try {
					Thread.sleep(2000);
					x = x + 3;
					
					System.out.println("t2: number of thread awaiting here is "+mCyclicBarrier.getNumberWaiting()); 
					System.out.println("t2: I'm going to await state");
					mCyclicBarrier.await();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		t1.start();
		t2.start();
		
		try {
			
			System.out.println("mainThread: number of thread awaiting here is "+mCyclicBarrier.getNumberWaiting()); 
			System.out.println("mainThread: I'm going to await state");
			mCyclicBarrier.await();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Barrier broken, x is "+x);
	}

}
