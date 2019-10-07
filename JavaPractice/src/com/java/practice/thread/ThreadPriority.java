package com.java.practice.thread;

class Task extends Thread{
	
	public void run() {
		System.out.println("Name is : "+ Thread.currentThread().getName()+ "   Priority is : "+ Thread.currentThread().getPriority() + "  Is Daemon : "+ Thread.currentThread().isDaemon());
		
	}
}

public class ThreadPriority {

	public static void main(String args[]) {
		
		Task t = new Task();
		Task t1 = new Task();
		
		t.setName("one");
		t1.setName("two");
		
		t.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY);
		
		t.setDaemon(true);
		
		
		
		t.start();
		t1.start();
		
	}
}
