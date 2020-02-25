package com.hllearn.HLlearn_Queue;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlock {

	public static void main(String[] args) {
		
		// 链表阻塞队列
		// 无界队列
		// 生产和消费并行
		LinkedBlockingQueue lbq = new LinkedBlockingQueue();
		lbq.add("a");
		lbq.contains("a");
		lbq.remove(); // 移除头部元素
		lbq.toArray(); // 转数组
		lbq.element(); //取出头部元素不删除。
	}
}
