package com.basicjavaconcepts;

public class StringMethods {

	public static void main(String[] args) {

		String s ="Welcome";
		String s1 = " Java";
		System.out.println("Length of string:" +s.length()); // Length of String
		System.out.println("Print Full Message:" +s.concat(s1)); // Joining of strings
		System.out.println("Print Full Message:" +s.concat(s1.trim())); // Remove Space 
		System.out.println("Trim Space:" +s1.trim());
		
		//CharAt()
		
		s ="Welcome";
		System.out.println(s.charAt(5)); //return character based on index number, index will start from 0
		
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("wel")); //false because of case sensitive
		
		//Compare String equals()
		
		s = "Welcome";
		s1 = " Welcome";
		
		System.out.println(s.equals(s1));
		
		//Replace character
		
		System.out.println(s.replace("Welcome", "Welcome Selenium"));
		
		// Extracting substring from the main string
		System.out.println(s.substring(0, 3));
		
		//Converting Case
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
	}

}
