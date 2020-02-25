package com.hanshow.factorymethod;

public class Tamer {

	public static void main(String[] args) {
		Behavior behavior = produce("lion");
		behavior.roar();
	}
	
	private static Behavior produce(String animal) {
		if(animal.equals("lion")) {
			return new Lion();
		}else if(animal.equals("tiger")) {
			return new Tiger();
		}else {
			return null;
		}
	}

}
