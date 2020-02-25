package com.hanshow.abstractfactory;

public class TigerFactory implements Product{

	public Behavior product() {
		return new Tiger();
	}

}
