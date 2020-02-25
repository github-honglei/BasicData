package com.hllearn.adapter;

public class AdapterPattern {
	public static void main(String[] args) {
		
		Targetable targetable = new Adapter();
		targetable.method1();
		targetable.method2();
		
		Source source = new Source();
		Targetable targetable1 = new Wrapper(source);
		targetable1.method1();
		targetable1.method2();
	}
}
