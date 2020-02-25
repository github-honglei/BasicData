package com.hllearn.HLlearn_Queue;

import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlocking {

	public static void main(String[] args) {
		
	}
	
	public void test04() throws Exception{
	    //队列里元素必须实现Comparable接口,用来决定优先级
	    PriorityBlockingQueue<String> pbq=new PriorityBlockingQueue<String>();
	    pbq.add("b");
	    pbq.add("g");
	    pbq.add("a");
	    pbq.add("c");
	    //获取的时候会根据优先级取元素,插入的时候不会排序,节省性能
	    //System.out.println(pbq.take());//a,获取时会排序,按优先级获取
	    System.out.println(pbq.toString());//如果前面没有取值,直接syso也不会排序
	    Iterator<String> iterator = pbq.iterator();
	    while(iterator.hasNext()){
	        System.out.println(iterator.next());
	    }
	}

	public void test05(){
	    PriorityBlockingQueue<Person> pbq=new PriorityBlockingQueue<Person>();
	    Person p2=new Person("姚振",20);
	    Person p1=new Person("侯征",24);
	    Person p3=new Person("何毅",18);
	    Person p4=new Person("李世彪",22);
	    pbq.add(p1);
	    pbq.add(p2);
	    pbq.add(p3);
	    pbq.add(p4);
	    System.out.println(pbq);//没有按优先级排序
	    try {
	        //只要take获取元素就会按照优先级排序,获取一次就全部排好序了,后面就会按优先级迭代
	        pbq.take();
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    //按年龄排好了序
	    for (Iterator iterator = pbq.iterator(); iterator.hasNext();) {
	        Person person = (Person) iterator.next();
	        System.out.println(person);
	    }
	}
}
class Person{
	Person(String name,int age){
		
	}
}
