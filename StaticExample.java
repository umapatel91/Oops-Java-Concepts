package com.oopsconcepts;

public class StaticExample {
	
	static int a=10;  // Static variable
	int b=20;		  // Non-static variable
	
	static void m1()	// Static Method
	{
		System.out.println("This is m1 static method.");
	}
	void m2()			// Non - Static Method
	{
		System.out.println("This is m2 non-static method.");
	}
	void m3()  // Non-static method can access both static and non-static variables/methods directly without creating object.
	{
		System.out.println("----This is m3 non-static method----");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {

		// 1. Static methods can access only static stuff.
		System.out.println(a);  // we can print (a) directly without creating object because it is static.
		m1();
		
		//System.out.println(StaticExample.a); Classname is required when we want to use in different class under main method.
		
		// System.out.println(b); incorrect, because b is non static variable.
		// m2(); incorrect, because m2 is no static method.
		
		// 2. Static method can also access non-static stuff but through object.
		StaticExample se = new StaticExample();
		System.out.println(se.b); // Non-static variable through object
		se.m2(); // Non-static method through object
		se.m3();
	}

}
