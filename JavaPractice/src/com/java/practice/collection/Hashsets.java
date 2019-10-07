package com.java.practice.collection;

import java.util.HashSet;

public class Hashsets {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
				
		hs.add("one");
		hs.add("two");
		hs.add("two");
		hs.add("three");
		
		HashSet<String> hsc= (HashSet<String>) hs.clone();
		
		System.out.println("Hashset size is : "+hs.size());
		System.out.println("Hashset is empty : "+hs.isEmpty());
		
		hs.forEach(x -> {System.out.println(x);});

	}

}
