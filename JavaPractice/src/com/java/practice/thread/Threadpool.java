package com.java.practice.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadWorker implements Runnable{
	public String message;
	ThreadWorker(String s){
		message = s;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName() +" Start = "+message);
		processmessage();
		System.out.println(Thread.currentThread().getName() +" End");
	}
	private void processmessage() {
		try { Thread.sleep(2000); } catch(Exception e) { e.printStackTrace(); };
	}
}

public class Threadpool {
	public static void main(String args[]) {
		
		ExecutorService executor = Executors.newFixedThreadPool(5);
		
		for(int i = 0; i<10; i++) {
			Runnable worker = new ThreadWorker(""+i);
			executor.execute(worker);
		}
		executor.shutdown();
		
		while(!executor.isTerminated()) {
			
		}
		System.out.println("Finished all threads");
	}
}
