package com.oopsconcepts;

class Parent
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class Child1 extends Parent
{
	int x;
	void show()
	{
		System.out.println(x);
	}
}

class Child2 extends Parent
{
	int y;
	void print()
	{
		System.out.println(y);
	}
}

public class HierarchyInheritance {

	public static void main(String[] args) {
		
		Parent pobj = new Parent();
		pobj.a = 10;
		pobj.display();
		
		Child1 c1obj = new Child1();
		c1obj.a = 20;
		c1obj.x = 30;
		c1obj.display();
		c1obj.show();
		
		Child2 c2obj = new Child2();
		c2obj.a = 45;
		c2obj.y = 50;
		
		c2obj.display();
		c2obj.print();
		
	}

}
