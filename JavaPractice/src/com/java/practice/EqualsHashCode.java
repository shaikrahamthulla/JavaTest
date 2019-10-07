package com.java.practice;

class Crunchify{
	
	private int value;
	
	Crunchify(int val){
		value = val;
	}
	
	public int getValue() {
		return value;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null)
			return false;
		if(this == o)
			return true;
		if( (o instanceof Crunchify) && ( ((Crunchify)o).getValue() == this.value  )) {
			return true;
		} else {
			return false;
		}					
	}
	
	@Override
	public int hashCode() {
		int result = 0;
		result = (int)(value/11);
		return result;
	}
}

public class EqualsHashCode {

	public static void main(String args[]) {
		Crunchify c1 = new Crunchify(1);
		Crunchify c2 = new Crunchify(1);
		Crunchify c3 = new Crunchify(1);
		Crunchify c4 = new Crunchify(2);
		
		System.out.println(c1.equals(c2));
		System.out.println(c3.equals(c4));
	}
}