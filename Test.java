package com.interfaceexamples;

interface A
{
	int a = 10;			// in interface variables by default act as static and final so we need to give some value.
	
	void m1(); 			// abstract method so no body here, by default public
}

public class Test implements A {
	
	public void m1()		// we must have to specify public modifier because we are using method from interface and we have not specify any modifier in interface so by default it will be public.
	{
		System.out.println(a);
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.m1();
		
		// If we want to use interface then use bellow syntax.		
		A a = new Test();
		a.m1();
		
	}

}
