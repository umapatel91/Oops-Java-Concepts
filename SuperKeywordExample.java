package com.oopsconcepts;

class Animal {

	String color = "White";
	
	void eating()
	{
		System.out.println("Eating....");
	}
	
	Animal()		//Constructor
	{
		System.out.println("Animal is created...");
	}
}

class Dog extends Animal{
	
	String color = "Black";
	
	void displaycolor()
	{
		System.out.println(color);	// This will print Black because color is override in Dog class
		System.out.println(super.color);	// This will print White because super keyword refer it's immediate parent (Animal) class.
	}
	
	void eating()
	{
		System.out.println("Eating bread......"); 
		super.eating();
	}
	
	Dog()		//Constructor
	{
		super(); //Invoked parent class constructor
		System.out.println("Dog is created...");
	}
	
}
public class SuperKeywordExample {

	public static void main(String[] args) {

		Dog d = new Dog();
		d.displaycolor();
		d.eating();		
	}

}

