package com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		
		PriorityQueue<String> p = new PriorityQueue<String>();
		p.add("First");
		p.add("2nd");
		p.add("Third");
		
		System.out.println(p);
		p.poll();
		System.out.println(p);
		
		//how to iterate?
		Iterator<String> it = p.iterator();
		while(it.hasNext()) {
			String x = (String) it.next();
			System.out.println(x);
		}
		
		for(String x: p) {
			System.out.println(x);
			
		}
	}
}
