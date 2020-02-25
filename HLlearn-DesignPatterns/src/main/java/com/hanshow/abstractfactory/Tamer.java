package com.hanshow.abstractfactory;

public class Tamer {

	public static void main(String[] args) {
		Product product = new LionFactory();
		Behavior behavior = product.product();
		behavior.roar();
	}
}
