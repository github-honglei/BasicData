package com.hllearn.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<String>();
		coll.add("A");
		coll.add("B");
		coll.add("C");
		coll.add("D");
		coll.add("E");
		coll.add("F");
		
		Iterator<String> it = coll.iterator();
		while(it.hasNext()) {
			String a = it.next();
			if(a.equals("A")||a.equals("B")) {
				it.remove();
			}
		}
		System.out.println(coll);
	}
}
