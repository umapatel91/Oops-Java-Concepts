package com.oopsconcepts;

public class FinalKeywordExample {
	
	final int speed = 40;	// final variable, so we cannot change the value in future

	public static void main(String[] args) {

		FinalKeywordExample fk = new FinalKeywordExample();
		// fk.speed = 50;		// complie time error because speed assign as final variable.
		System.out.println(fk.speed);
	}

}
