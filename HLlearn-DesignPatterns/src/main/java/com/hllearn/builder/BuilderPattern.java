package com.hllearn.builder;

public class BuilderPattern {

	/*
	 * 将一个复杂对象的构建和表示分离。
	 * */
	
	public static void main(String[] args) {
		Director director = new Director();
		Builder builder = new ConcreteBuilder();
		
		director.Construct(builder);
		builder.getComputer();
		Computer computer = builder.getComputer();
		computer.print();
	}
}
