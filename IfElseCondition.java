package com.basicjavaconcepts;

public class IfElseCondition {

	public static void main(String[] args) {

		// 1. Check Eligibility
		int age=10;
		
		if(age>=20) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}
		
		// 2. Check Odd/Even Number
		int number=10;
		//number = number/2;
		
		if(number%2 == 0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
		
		// 3. Find Larger Number
		
		int x = 30;
		int y = 20;
		
		if(x>y) {
			System.out.println("x is larger than y");
		}
		else {
			System.out.println("x is smaller than y");
		}
	}

}
