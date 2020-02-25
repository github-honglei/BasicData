package com.hllearn.HLlearn_Queue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ArrayBlocking {

	public static void main(String[] args) throws InterruptedException {
		
		// 基于数组的阻塞队列
		// 必须指定队列长度
		// 有界队列
		// 生产和消费非并行处理
		// 
		ArrayBlockingQueue<String> abq = new ArrayBlockingQueue<String>(2);
		abq.add("2");
		abq.offer("1");// 如果队列已满，返回false
		abq.offer("3", 2, TimeUnit.SECONDS);//设置超时时间，超过时间，不添加元素
		abq.put("4");// 会一直等待
		abq.poll();
		abq.poll(2, TimeUnit.SECONDS); // 指定时间取不到，返回null
		abq.take(); // 取出头部元素，如果队列为空，阻断进入等待状态。
		abq.element(); //取出头部元素，不删除。
		
		List list = new ArrayList();
		abq.drainTo(list, 2);
	}
}
