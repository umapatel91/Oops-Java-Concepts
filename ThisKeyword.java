package com.oopsconcepts;

public class ThisKeyword {

	int a,b;  // instance variables or class variables
	
	void get(int a, int b)	// method variables or external variables
	{
		this.a=a;
		this.b=b;
	}
	
	void printValue()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		ThisKeyword th = new ThisKeyword();
		th.get(10, 20);
		th.printValue();

	}

}
