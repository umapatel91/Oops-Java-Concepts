package com.basicjavaconcepts;

public class WhileLoop {

	public static void main(String[] args) {
		int i=10;
		//Print number in increment 1 to 10
		/*
		 * while(i<=10) { System.out.println(i); i++; }
		 */
		
		//Print even number between 1 to 10
		/*
		 * int i =2;
		 * while(i<=10) { System.out.println(i); i+=2; //i =i+2; }
		 */
		
		//Print odd number between 1 to 10
		/*
		 * int i =1;
		 * while(i<=10) { System.out.println(i); i =i+2; }
		 */
		
		//Print number in decrement 10 to 1
		while(i>0) {
			System.out.println(i);
			i--;     //i =i-2;
		}
		
	}

}
