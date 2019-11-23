package com.Exceptions;

public class UncheckedExceptionsExamples {

	public static void main(String[] args) {

		
		
		  int a=10; 
		  
		  try
		  {
			  System.out.println(a/0); //Arithmetic Exception
		  }
		  catch(ArithmeticException e)
		  {
			  System.out.println("Entered into catch block");
		  }
		  finally
		  {
			  System.out.println("Entered into finally block");		// Finally block will always execute.
		  }
		  
		  
	/*	  String s =null;
		  try
		  {		  
		  System.out.println(s.length()); //Nullpointer Exception
		  }
		  catch(Exception e)			//Write Exception e when we don't know about which exception it will throw.
		  {
			  System.out.println("Entered into catch block");
		  }
		  
		  String x = "abc";
		  int y = Integer.parseInt(x); //Numberformat Exception
		  
		  int array[] = new int[5]; //ArrayIndexOutOfBounds Exception 
		  array[10] = 100;	*/
		 
	}

}
