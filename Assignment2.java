package com.basicjavaconcepts;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {

		
		/*
		 * //1. Print weather number is Positive or Negative
		 * 
		 * int x=3;
		 * 
		 * if(x>=3) { System.out.println("Positive"); }else {
		 * System.out.println("Negative"); }
		 * 
		 * 
		 * //2. Display Multiplication table of 5
		 * 
		 * for(int i=0; i<=10; i++) {
		 * 
		 * System.out.println("5"+"x"+i+"="+(5*i)); }
		 * 
		 * 
		 * //3. Print which is largest number int a=50; int b=40; int c=30;
		 * 
		 * if(a>b && b>c) { System.out.println("a is Largest"); }else if(c>b && b>a){
		 * System.out.println("c is Largest");
		 * 
		 * 
		 * int x,y,z; Scanner s = new Scanner(System.in);
		 * System.out.println("Print first number:"); x=s.nextInt();
		 * System.out.println("Print second number"); y=s.nextInt();
		 * System.out.println("Print third number"); z=s.nextInt();
		 * 
		 * if(x>y && y>z) { System.out.println("X is greatest number"); }else if(x<y &&
		 * y<z) { System.out.println("Z is greatest number"); }
		 */
		
		//4. Count number of digits from given number
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter number:");
		int p = s.nextInt();
		int count;
		
		for(count = 0; p>0; p=p/10 ) {
			count = count+1;			
		}
		System.out.println("Number of digits in this number is:" +count);
	}
}
