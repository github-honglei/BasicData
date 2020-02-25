package com.hanshow.factorymethod;

public class MultipleFactory {

	public Behavior productLion() {
		return new Lion();
	}
	
	public Behavior productTiger() {
		return new Tiger();
	}
}
