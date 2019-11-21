package com.basicjavaconcepts;

public class Assignment1 {

	public static void main(String[] args) {
		//1. Print Hello My Name
		System.out.println("Hello");
		System.out.println("My Name is Uma!!");
		
		int x=10;
		int y=20;
		int a;
		
		//2. Sum of two numbers.
		int z=x+y;
		System.out.println("Sum of x and y is:" +z);
		
		//3. Swap of two numbers.
		System.out.println("Value of x and y before swap is:" +x +" " +y);
		a=x;
		x=y;
		y=a;
		System.out.println("Value of x and y after swap is:" +x +" " +y);
	}

}
