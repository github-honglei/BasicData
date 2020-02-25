package com.hanshow.HLlearn_Thread;

public class ThreadLocalDemo {

	static class MyThread extends Thread{
		private static ThreadLocal<Integer> threadlocal = new ThreadLocal<Integer>() {
			//匿名内部类
			@Override
			protected Integer initialValue() {
				return Integer.valueOf(1);
			}
		};
		
		@Override
		public void run() {
			super.run();
			for(int i = 0;i<3;i++) {
				threadlocal.set(i);
				System.out.println(getName() + " threadlocal.get() = "+ threadlocal.get());
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		MyThread myThreadA = new MyThread();
		myThreadA.setName("MythreadA");
		
		MyThread myThreadB = new MyThread();
		myThreadB.setName("MythreadB");
		
		myThreadA.start();
		myThreadB.start();
	}
}
