package com.oopsconcepts;

final class Bike1	// final classs so we can not extend into child class
{
	int speed = 40;
	void run()	
	{
		System.out.println(speed);
	}
}

/*
 * class Honda1 extends Bike1 // compile time error. because parent class is
 * final so we can't extend parent class here. {
 * 
 * }
 */



public class FinalClassDemo {

	public static void main(String[] args) {
		
	}

}
