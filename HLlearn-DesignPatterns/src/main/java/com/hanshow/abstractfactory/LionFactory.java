package com.hanshow.abstractfactory;

public class LionFactory implements Product {

	public Behavior product() {
		return new Lion();
	}

}
