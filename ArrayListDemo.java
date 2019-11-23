package com.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		//1. How to declare Arraylist
		
		   ArrayList list = new ArrayList();	//We can store any type of element/s
		// ArrayList <Integer> list = new ArrayList <Integer>();	//Store Integer value
		
		//  ArrayList <String> list = new ArrayList <String>();	//Store String value
		  
		//2. Adding values to Arraylist
		  
		  list.add("John");		//0
		  list.add("David");	//1
		  list.add("Scott");	//2
		  list.add("Smith");	//3
		  list.add(100); 		//4
		  list.add('A');		//5
		  
		//3. Size of Arraylist
		  
		  System.out.println(list.size());	//output will be 4
		  System.out.println("Before removing elements:" +list);			//Print Arraylist values
		  
		//4. Remove an element
		  
		  list.remove(2);					//Remove 2 number element : Scott
		  System.out.println(list.size());	//output will be 3
		  System.out.println("After removing elements:" +list);
		  
		//5. Insert a new element into Arraylist
		  
		  list.add(1, "Kim");
		  System.out.println(list.size());	
		  System.out.println("After inserting elements:" +list);
		  
		//6. Read values from arraylist using for loop
		  
		/*  for(String s:list)		//String can store only string value
		  {
			  System.out.println(s);
		  }	*/
		  
		  
		  for(Object s:list)		//Object type variable can hold any type of value. 
			  						//So when we use ArrayList list = new ArrayList(); then use Object type instead of String or Integer
		  {
			  System.out.println(s);
		  }
		  
		  
		
		
		
		
		
	}

}
