package com.java.practice.callby;

class Person{
	String name;
	Person(String name){
		this.name= name;
	}
}

public class Callby {

	public static void main(String[] args) {
		
		//pass by value
		/*int n = 100;
		System.out.println("Before call n is : "+n);
		intM(n);
		System.out.println("After call n is : "+n);
		*/
		
		//pass by value
		/*String s = "shaik";		
		System.out.println("Before call s is : "+s);
		stringM(s);
		System.out.println("After call s is : "+s);*/
		
		//pass by value
		/*boolean f = false;
		System.out.println("Before call f is : "+f);
		booleanM(f);
		System.out.println("After call f is : "+f);*/
		
		//pass by reference
		/*int a[] = new int[10];		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;		
		System.out.println("Before call a is : "+a[1]);
		arrayM(a);
		System.out.println("After call a is : "+a[1]);*/
		
		//call by reference
		Person p = new Person("shaik");
		System.out.println("Before call p name is : "+p.name);
		objectM(p);
		System.out.println("After call p name is : "+p.name);
		
		
	}
	
	static void objectM(Person x) {
		x.name = "rahamthulla";
		System.out.println("In call x name is : "+x.name);
	}
	
	static void arrayM(int x[]) {
		x[1] = 1000;
		System.out.println("In call x is : "+x[1]);
	}
	
	static void booleanM(boolean x) {
		x = true;
		System.out.println("In call x is : "+x);
	}
	
	static void stringM(String x) {
		x = "rahamthulla";
		System.out.println("In call x is : "+x);
	}
	
	static void intM(int x) {
		x = 111;
		System.out.println("In call x is : "+x);
	}

}
