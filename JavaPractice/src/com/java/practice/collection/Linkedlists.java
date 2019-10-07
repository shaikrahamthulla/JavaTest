package com.java.practice.collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Pattern;

public class Linkedlists {
	
	public static void main(String args[]) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("shaik");
		ll.add("rahmat");
		ll.add("john");
		ll.add("johnson");
		
		
		ll.add(2, "JOHN");
		
		ll.addAll(4, Arrays.asList("one", "two", "three"));
		
		ll.addFirst("FIRST");
		ll.addLast("LAST");
		
		System.out.println("Item at index 2 : "+ll.get(3));		
		System.out.println("First Item is : "+ll.getFirst());		
		System.out.println("Last Item is : "+ll.getLast());		
		System.out.println("Removed item is : "+ll.remove(3));
		System.out.println("is john item present : "+ll.contains("john"));
		
		ll.addFirst("dummy");
		
		System.out.println("peek of list : "+ll.peek());
		System.out.println("Poll remove frist element from list : "+ll.poll());		
		ll.push("DUMMY");
		ll.pop();
		//System.out.println("push item : "+ll.getFirst());
		
		
		
		ll.forEach(x -> { System.out.println(x); });
		
		//Iterator itr = ll.iterator();
		/*Iterator itr= ll.descendingIterator();		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
	}
}
