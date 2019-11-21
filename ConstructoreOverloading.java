package com.oopsconcepts;

public class ConstructoreOverloading {
	
	
	
	ConstructoreOverloading(int a, int b) 			//1
	{
		System.out.println(a+b);
	}
	
	ConstructoreOverloading(int a, double b) 		//2
	{
		System.out.println(a+b);
	}
	
	ConstructoreOverloading(double a, double b) 	//3
	{
		System.out.println(a+b);
	}
	
	ConstructoreOverloading(int a, int b, int c) 	//4
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		
		ConstructoreOverloading co = new ConstructoreOverloading(10, 50); // As per assign value, Constructor will be called
		
		

	}

}
