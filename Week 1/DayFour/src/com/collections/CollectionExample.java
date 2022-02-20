package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionExample {
	public static void main(String[] args) {
		LinkedHashSet<String> h = new LinkedHashSet<String>();
		
		if(h.isEmpty())
				System.out.println("Is Empty");
		h.add("First");
		h.add("Second");
		h.add("Third");
		System.out.println(h);
		int i=0;
		for(String s: h) {
			System.out.println("Element("+i+"): "+s);
			i++;
		}
		h.add("Second");
		System.out.println("Size: "+h.size());
		System.out.println("Second");
		h.remove("Third");
		Boolean k = h.remove("Second");
		System.out.println("Do we removed Second?: "+k);
		k = h.remove("Third");
		System.out.println("Do we removed Third?: "+k);
		System.out.println(h);

		h.add("Second");
		h.add("Third");
		Iterator<String> itr = h.iterator();
		
	}
}