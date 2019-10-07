package com.java.practice.javarevisited;

public class Revisited {
	
	public static int iStatic = 10;
	public static void staticMethod() {
		System.out.println("static method is accessed from non-static method");
		System.out.println("static method can access static variable : "+iStatic);
	}
	
	public void nonStatic() {
		System.out.println("can access static variable inside non static-method : "+iStatic);
		staticMethod();
	}

	public static void main(String[] args) {
		
		Revisited r = new Revisited();
		r.nonStatic(); 
	}
}
