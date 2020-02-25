package com.hllearn.builder;

public class Director {

	public void Construct(Builder builder) {
		builder.buildCPU();
		builder.buildMainboard();
		builder.buildHD();
	}
}
