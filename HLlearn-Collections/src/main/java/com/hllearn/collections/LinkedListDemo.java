package com.hllearn.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		//初始化
		LinkedList<String> linkedList= new LinkedList<String>();
		LinkedList<String> linkedList1= new LinkedList<String>(Collections.nCopies(5, "A"));
		
		//在链表结尾处添加元素
		linkedList.add("B");
		linkedList.add(0, "B");
		linkedList.addFirst("B");
		linkedList.addLast("B");
		linkedList.addAll(Collections.nCopies(5, "A"));
		linkedList.addAll(0,Collections.nCopies(5, "A"));
		
		//覆盖
		linkedList.set(0, "B");
		
		//获取
		linkedList.get(0);
		linkedList.getFirst();
		linkedList.getLast();
		
		//删除
		linkedList.remove();//队列header
		linkedList.remove(1);
		linkedList.remove("B");
		linkedList.removeFirst();
		linkedList.removeLast();
		
		//清空
		linkedList.clear();
		
		//查找
		linkedList.indexOf("B");
		linkedList.lastIndexOf("B");
		
		//包含
		linkedList.contains("B");
		
		//转数组
		linkedList.toArray();
		
		//同步
		List list = Collections.synchronizedList(linkedList);
		
	}
}
