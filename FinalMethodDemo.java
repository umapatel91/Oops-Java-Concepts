package com.oopsconcepts;


class Bike
{
	final void run()	//final method, so we can't override this method in child class.
	{
		System.out.println("Running.....");
	}
}

class Honda extends Bike
{
	// void run()	// we can not override this method from parent because it is defined as final method. so it shows error.
	{
		System.out.println("Started.....");
	}
}

public class FinalMethodDemo {

	public static void main(String[] args) {

		
	}

}
