package com.hanshow.singleton;

public class LazyModel {

	private static volatile LazyModel lazyModel = null;
	
	private LazyModel() {
		
	}
	
	public static LazyModel getInstance() {
		if(lazyModel ==  null) {
			synchronized (LazyModel.class) {
				if(lazyModel == null) {
					lazyModel = new LazyModel();
				}
			}
		}
		return lazyModel;
	}
	
	public void print() {
		System.out.println("Hello World");
	}
}
