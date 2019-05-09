package com.honglei.collection.operate;

import java.util.ArrayList;
import java.util.List;

public class People implements Comparable<People>{

	private String name;
	private int age;
	
	public People() {
		
	}
	
	public People(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public static List<People> getPeopleList(){
		return new ArrayList<People>(){
			{
				add(new People("wang",15)); 
				add(new People("zhao",20));
				add(new People("qian",22));
			}
		};
	}

	@Override
	public int compareTo(People o) {
		if(this.age > o.age) {
			return 1;
		}else if(this.age < o.age) {
			return -1;
		}else {
			return this.name.compareTo(o.name);
		}
	}
}
