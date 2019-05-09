package com.honglei.collection.operate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetOperate {

	public static void main(String[] args) {
		
		// HashSet 无序（存入和取出的顺序不同），不重复，无索引
		// 底层是哈希表结构，也称散列表结构，查找和删除快，添加慢  HashSet中存储自定义对象需要重写hashCode（）和equals()方法
		
		// TreeSet 可以对set集合中的元素进行排序，默认按照asic码表的自然顺序排序
		// 之所以TreeSet能排序是因为底层是二叉树，数据越多越慢,TreeSet是依靠TreeMap来实现的
		// TreeSet集合中的自定义对象必须实现Comparable接口
		
		Set<People> treeSet = new TreeSet<People>(); 
		Set<People> hashSet = new HashSet<People>(); 
		
		People p1 = new People("zhang",21);
		People p2 = new People("zhang",22);
		People p3 = new People("zhang",23);
		treeSet.add(p1);
		treeSet.add(p2);
		treeSet.add(p3);
		treeSet.forEach(e ->{
			System.out.println(e.getName()+"/"+e.getAge());
		});
		
		hashSet.add(p1);
		hashSet.add(p2);
		hashSet.add(p3);
		hashSet.forEach(e ->{
			System.out.println(e.getName()+"/"+e.getAge());
		});
		
		treeSet.addAll(treeSet);
		hashSet.addAll(treeSet);
		
		List<People> pList = new ArrayList<People>();
		treeSet.addAll(pList);
		hashSet.addAll(pList);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
