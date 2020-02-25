package com.hllearn.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Demo1 {

	public static void main(String[] args) {
		List<A> list = new ArrayList<A>();
		list.stream().filter(a -> a.getCol1().equals("A")).count();
	}
	
	private void method1() {
		ThreadLocal<A> a = ThreadLocal.withInitial((Supplier<? extends A>) ()-> new A());
	}
}

class A{
	private String col1;
	private String col2;
	public String getCol1() {
		return col1;
	}
	public void setCol1(String col1) {
		this.col1 = col1;
	}
	public String getCol2() {
		return col2;
	}
	public void setCol2(String col2) {
		this.col2 = col2;
	}
	
}
