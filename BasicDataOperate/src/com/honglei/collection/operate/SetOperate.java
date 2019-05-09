package com.honglei.collection.operate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetOperate {

	public static void main(String[] args) {
		
		// HashSet ���򣨴����ȡ����˳��ͬ�������ظ���������
		// �ײ��ǹ�ϣ��ṹ��Ҳ��ɢ�б�ṹ�����Һ�ɾ���죬�����  HashSet�д洢�Զ��������Ҫ��дhashCode������equals()����
		
		// TreeSet ���Զ�set�����е�Ԫ�ؽ�������Ĭ�ϰ���asic������Ȼ˳������
		// ֮����TreeSet����������Ϊ�ײ��Ƕ�����������Խ��Խ��,TreeSet������TreeMap��ʵ�ֵ�
		// TreeSet�����е��Զ���������ʵ��Comparable�ӿ�
		
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
