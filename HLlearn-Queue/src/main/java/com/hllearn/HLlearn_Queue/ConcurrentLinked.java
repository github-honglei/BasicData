package com.hllearn.HLlearn_Queue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinked {

	public static void main(String[] args) {
		
		// 基于链接节点
		// 无界
		// 线程安全
		// 先进先出
		// 不允许null值
		ConcurrentLinkedQueue<String> clq = new ConcurrentLinkedQueue<String>();
		clq.add("a"); // 添加元素
		clq.add("b");
		clq.offer("c");
		System.out.println(clq.poll());//取出头元素并删除
		System.out.println(clq.peek());//取出头元素不删除
	}
}
