package com.oopsconcepts;

public class ConstructorDemo {
	
	int x;
	int y;
	
	ConstructorDemo()  // Default Constructor
	{
		x = 10;
		y = 20;
	}
	
	ConstructorDemo(int a, int b)  // Parameterized Constructor
	{
		x=a;
		y=b;
	}
	
	void display()
	{
		System.out.println(x+y);
	}

	public static void main(String[] args) {

		ConstructorDemo cmd = new ConstructorDemo(); // Invokes default constructor
		cmd.display();
		
		ConstructorDemo cd = new ConstructorDemo(40, 60); //Invokes Parameterized constructor
		cd.display();
		
	}

}
