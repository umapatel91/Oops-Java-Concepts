package com.basicjavaconcepts;

public class JumpingStatement {

	public static void main(String[] args) {

		//1. Use of Break Statement
		/*
		 * for(int i=1; i<=10; i++) {
		 * 
		 * if(i==5) { break; } System.out.println(i); }
		 */
		
		//2. Use of Continue Statement		
		/*
		 * for(int i=1; i<=10; i++) {
		 * 
		 * if(i==5) { continue; } System.out.println(i); }
		 */
		
		//3. Skip Even Number
		/*
		 * for(int i=0; i<=10; i++) {
		 * 
		 * if(i%2==0) { continue; } System.out.println(i); }
		 */
		
		//4. Skip Even Number second method
		for(int i=1; i<10; i++) {
			
			if(i==2 || i==4 || i==6 || i==8) {
				continue;
			}
			System.out.println(i);
		}
	}

}
