package com.basicjavaconcepts;

public class MultiDmArray {

	public static void main(String[] args) {

		
		  int a[][] = new int [4][2];
		  a[0][0]=100;
		  a[0][1]=200;
		  a[1][0]=300;
		  a[1][1]=400;
		  a[2][0]=500;
		  a[2][1]=600;
		  a[3][0]=700;
		  a[3][1]=800;
		 
		// int a[][]= { {100,200},{300,400},{500,600} };
		
		  System.out.println("Number of rows:" +a.length);
		  System.out.println("Number of columns:" +a[0].length);
		  
	   /* for(int i=0; i<a.length; i++)  //Outer Loop
		  { 
			  for (int j=0; j<a[i].length; j++) //Inner Loop
			  {  
				  System.out.println(a[i][j]);
			  }
		  } */
		  
		  // Enhanced for loop
		  
		  for(int r[]:a) // Make Single dimensional array first. So store (100,200) into r
		  {
			  for(int i:r) // i will take value from r. So first print 100 and then again print 200
			  {
				  System.out.println(i);
			  }
		  }
		  
		  
		
		
	}

}
