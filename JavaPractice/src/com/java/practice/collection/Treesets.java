package com.java.practice.collection;

import java.util.TreeSet;

public class Treesets {

	public static void main(String[] args) {

		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(6);
		ts.add(4);
		ts.add(6);
		ts.add(1);
		ts.add(2);
		
		ts.forEach(x -> {System.out.println(x);});
		

	}

}
