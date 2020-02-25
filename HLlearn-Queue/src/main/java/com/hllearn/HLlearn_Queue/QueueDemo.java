package com.hllearn.HLlearn_Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class QueueDemo {

	BlockingQueue<String> basket = new ArrayBlockingQueue<String>(3);
	
	public void produce() throws InterruptedException {
		basket.put("An Apple");
	}
	
	public String consume() throws InterruptedException {
		String apple = basket.take();
		return apple;
	}
	
	public int getAppleNumber() {
		return basket.size();
	}
	
	public static void testQueue() {
		
		final QueueDemo queueDemo =new QueueDemo();
		
		class Producer implements Runnable {
			public void run() {
				try {
					while(true) {
						System.out.println("生产者准备生产苹果："+System.currentTimeMillis());
						queueDemo.produce();
						System.out.println("生产者生产苹果完毕："+System.currentTimeMillis());
						System.out.println("生产完后有苹果："+queueDemo.getAppleNumber());
						Thread.sleep(300);
					}
				}catch(InterruptedException ex) {
					
				}
			}
		}
		
		class Consumer implements Runnable{
			public void run() {
				try {
					while(true) {
						Thread.sleep(1000);
						System.out.println("消费者准备消费苹果：" + System.currentTimeMillis());
						queueDemo.consume();
						System.out.println("消费者消费苹果完毕：" + System.currentTimeMillis());
						System.out.println("消费完后有苹果："+queueDemo.getAppleNumber()+"个");
					}
					  
				}catch(InterruptedException ex) {
					
				}
			}
		}
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		
		service.submit(producer);
		service.submit(consumer);
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		}
		service.shutdownNow();
	}
	
	public static void main(String[] args) {
		QueueDemo.testQueue();
	}
}
