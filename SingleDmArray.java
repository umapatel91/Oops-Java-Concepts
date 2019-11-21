package com.basicjavaconcepts;

public class SingleDmArray {

	public static void main(String[] args) {
		/*
		 * int a[] = new int[5]; // declared array with size 5, starting index is 0, last
		 * index is 4
		 * 
		 * //Storing/Inserting values into array
		 * 
		 * a[0]=10; a[1]=10; a[2]=10; a[3]=10; a[4]=10;
		 */
		
		int a[]={10,20,30,40,50};  // Declare an array without specifying size
		
		System.out.println("Length of an array is: " +a.length); // Print length of an array
		System.out.println(a[2]); // Read Specific Value
		
		/*for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}*/
		
		//Read value using enhanced for loop
		
		for(int i:a) {
			System.out.println(i);
		}
		
	}

}
