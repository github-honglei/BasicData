package com.hllearn.adapter;

public class Adapter extends Source implements Targetable {

	public void method2() {
		System.out.println("This is targetable method");
	}
}
