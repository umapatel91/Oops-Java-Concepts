package com.Exceptions;

public class CheckedExceptionExamples {

	public static void main(String[] args) throws InterruptedException {

		
		System.out.println("Program is started");
		
	/*	try
		{
			Thread.sleep(5000);				//Interrupted Exception. This is checked exception. It will ask for add try catch block or add throws exception keyword after method name  
		} 
		catch (InterruptedException e) 
		{
			
		}		*/
		
		Thread.sleep(5000);					// Add throws keyword after method name
		
		System.out.println("Program is Closed");
	}

}
