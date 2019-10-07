package com.java.practice.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Arraylists {

	public static void main(String args[]) {
		
		//System.out.flush();
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("shaik");
		al.add("rahmat");
		al.add("John");
		al.add("Johnson");
		
		
		al.add(2, "JIMMY");
		
		al.addAll(Arrays.asList("one", "two"));
						
		
		System.out.println("Before clear function Arraylist size is : " +al.size());		
		al.forEach( e -> { System.out.println(e); });
		
		
		System.out.println("Item at index 2 : "+al.get(2));		
		System.out.println("Removed item is : "+al.remove(2));
		System.out.println("is john item present : "+al.contains("John"));
		//System.out.println("Remove if John is present : "+al.removeIf(x -> {x == "John"}));
		
		
		
		//al.clear();		
		//System.out.println("After clear function Arraylist size is : " +al.size());
		
		al.forEach(s -> { System.out.println(s); });
		//System.out.println(al);
		
		/*Iterator it = al.iterator();		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	
		for(String s: al) {
			System.out.println(s);
		}
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}*/
		
		
		
		/*try {
			//Serialization
			FileOutputStream fos = new FileOutputStream("file");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			oos.close();.
			
			//Deserialization			
			FileInputStream fis = new FileInputStream("file");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList a = (ArrayList)ois.readObject();
			
			System.out.println(a);
			
		} catch(Exception e) {
			System.out.println(e);
		}*/
	}
}