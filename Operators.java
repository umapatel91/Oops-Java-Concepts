package com.basicjavaconcepts;

public class Operators {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		// Arithmetic Operators: + - * / %
		System.out.println("------------------Arithmetci Operators---------------------");
		System.out.println("Sum of a and b is:" +(a+b));
		System.out.println("Diff. of a and b is:" +(b-a));
		System.out.println("Mult of a and b is:" +(a*b));
		System.out.println("Div. of a and b is:" +(b/a));
		System.out.println("Mod. of a and b is:" +(b%a));

		
		//Relational Operators: == < > <= >= !=
		//Always return boolean value
		System.out.println("-----------------Relational Operators--------------------");
		System.out.println(a==b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);

		//Logical Operators: && || !
		//Works between two boolean
		
		boolean x=true;
		boolean y=false;
		System.out.println("--------------------Logical Operators---------------------");
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
		
		//Increment/Decrement Operators: ++ --
		System.out.println("----------------Increment/Decrement Operators------------------");
		
		a++;  //a=a+1
		System.out.println(a);
		
		b--; //b=b-1
		System.out.println(b);

	
	}

}
