package com.java.practice.thread;

class Multi extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
			System.out.println(i);
		}

	}
}

public class Theads {

	public static void main(String args[]) {
		Multi m = new Multi();
		Multi m1 = new Multi();
		Multi m2 = new Multi();
		
		System.out.println("id of m:"+m.getId());  
		System.out.println("id of m1:"+m1.getId());
		
		System.out.println("Name of m: "+m.getName());  
		System.out.println("Name of m1: "+m1.getName());  
		
		m1.setName("multi one");
		
		System.out.println("Name of m1: "+m1.getName());  
		
		m.start();
		try {
			m.join(1500);
		} catch(Exception e) {
			System.out.println(e);
		}
		m1.start();
		m2.start();
	}

}
