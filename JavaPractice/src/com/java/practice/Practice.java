package com.java.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Practice {

	public static void main(String args[]) {
		
		//System.out.println("Shaik");
		/*
		String s = "I am am working on on java java";
		
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		String a[] = s.split(" ");
		
		for(int i=0;i<a.length; i++) {			
			if(h.containsKey(a[i])) {
				int value = h.get(a[i]);
				h.put(a[i], ++value);				
			} else {
				h.put(a[i], 1);
			}
		}
		
		for(Map.Entry m: h.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		*/
		
		String s = "shaik";		
		String s1 = "shaik";		
		String s2 = new String("shaik");
				
		s1.concat("rahmat");		
		
		System.out.println(s == s1);
		System.out.println(s.equals(s1));
		
		System.out.println(s == s2 );
		System.out.println(s.equals(s2));
		
		
		
		String str = new String("shaik");
		//String arr[] = s.split("");
		//boolean regex = //;
		//System.out.println(s.matches("s"));
		System.out.println(Pattern.matches("[a-z]*", "shaik"));
		//System.out.println(String.join("", arr));
		
		//System.out.println(Pattern.matches("..s", "as"));
		//System.out.println(Pattern.matches("[a-z]*", "shaik"));
		
		
		
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		
		
		
		
	}
}