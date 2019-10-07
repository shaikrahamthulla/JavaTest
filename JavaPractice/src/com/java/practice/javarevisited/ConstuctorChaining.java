package com.java.practice.javarevisited;

class Parent {
	private String name;

	protected Parent() {
		this("");
		System.out.println("no argument constructor of parent called");
	}

	protected Parent(String s) {
		this.name = s;
		System.out.println("one argument constructor of parent class");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class Child extends Parent {
	private String name;

	protected Child() {
		this("");
		System.out.println("no argument constructor of child called");
	}

	protected Child(String s) {
		super(s);
		System.out.println("one argument constructor of super class called from sub class");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class ConstuctorChaining {

	public static void main(String args[]) {
		Child child = new Child("shaik");
		System.out.println();
		Child emptychild = new Child();

	}
}
