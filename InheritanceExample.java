package com.oopsconcepts;

class A
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A		// B is Child Class, A is Parent Class
{
	int b;
	void print()
	{
		System.out.println(b);
	}
}

class C extends B
{
	int c;
	void show()
	{
		System.out.println(c);
	}
}
public class InheritanceExample {

	public static void main(String[] args) {
		
		A aobj = new A();
		aobj.a = 100;
		aobj.display();
		
		B bobj = new B();
		bobj.a = 10;	//A
		bobj.b = 20;	//B
		
		bobj.display();	//A
		bobj.print();	//B
		
		C cobj = new C();
		cobj.a = 25;
		cobj.b = 30;
		cobj.c = 35;
		
		cobj.display();
		cobj.print();
		cobj.show();
		
	}

}
