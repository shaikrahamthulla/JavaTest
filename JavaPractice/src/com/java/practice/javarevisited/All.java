package com.java.practice.javarevisited;

public class All {
	
	static boolean pallindrome(int num) {
		boolean flag = true;
		String str = Integer.toString(num);
		int i = 0, j = str.length()-1;
		while(i <= j) {
			if(str.charAt(i) != str.charAt(j)) {
				flag = false;
				break;
			}
			i++; j--;
		}
		return flag;
	}
	
	static int reverse(int num) {
		int rev = 0;		
		while(num > 0) {
			rev = (rev * 10) + (num % 10);
			num = (int) num/10;
		}		
		return rev;
	}
	
	static int countOccurance(String str, char c) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == c)
				count++;
		}
		return count;
	}
	//Right angled Triangle
	static void floydTriangle(int rows) {
		int num = 1;
		for(int i=1; i<=rows; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		//System.out.println(pallindrome(12376321));
		//System.out.println(reverse(1234321));
		//System.out.println("Count is : "+countOccurance("i am shaik rahamthulla", 'a'));
		floydTriangle(5);
	}
}
