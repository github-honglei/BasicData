package com.hllearn.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListiteratorDemo {

	public static void main(String[] args) {
		List<String> coll = new ArrayList<String>();
		coll.add("A");
		coll.add("B");
		coll.add("C");
		coll.add("D");
		coll.add("E");
		coll.add("F");
		coll.add("G");
		
		ListIterator<String> lit = coll.listIterator();
		
		while(lit.hasNext()) {
			System.out.println(lit.nextIndex());
			
			String a = lit.next();
			if(a.equals("A")|| a.equals("B")) {
				lit.remove();
			}
		}
		System.out.println(lit);
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previousIndex());
			String b = lit.previous();
			System.out.println(b);
		}
		
		System.out.println(lit.previousIndex());
		
		lit.add("B");
		lit.add("A");
		
		System.out.println(coll);
		
		lit.next();
		lit.next();
		
		lit.set("W");
		System.out.println(coll);
		
		while(lit.hasNext()) {
			String b = lit.next();
			System.out.println(b);
		}
		
		
	}
}
