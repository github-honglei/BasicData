package com.hllearn.FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Demo1 extends Abstract1 {

	
	
	public static void main(String[] args) {
		String abc="123";
		Consumer c = (o) -> {
			System.out.println(o+"000");
			System.out.println(o);
		};
		c.accept(abc);
		
		Function<Integer, Integer> f = s -> ++s;
		Function<Integer, Integer> g = s -> s * 2;
		
		System.out.println(f.compose(g).apply(1));
		System.out.println(f.andThen(g).apply(1));
		System.out.println(Function.identity().apply(1));
		
		Predicate<String> p = o -> o.equals("test");
		
		
		
		
		
		
		
		
	}


	@Override
	void mothod1() {
		// TODO Auto-generated method stub
		
	}

}
