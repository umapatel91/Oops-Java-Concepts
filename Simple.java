package com.accessmodifiers;

class A
{
	
	// 1. private access modifier
/*	 private int data = 10; 
	 private void m1(){ } */
	 
	//2. default access modifier
	int data = 10;
	void m1()
	{
		System.out.println(data);
	} 	
	
}

public class Simple {

	public static void main(String[] args) {
		
		A aobj = new A();
		aobj.data = 20;			// compile time error when try to access private things
		aobj.m1();				// compile time error
		
		
		
	}

}
