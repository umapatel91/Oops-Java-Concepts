package com.accessmodifiers2;
import com.accessmodifiers3.Sample2;

//3. Protected access modifier example

/* public class Sample extends Sample2{

	public static void main(String[] args) {

		Sample s = new Sample();
		s.m1();
	} */

//4. Public access modifier example

public class Sample{

	public static void main(String[] args) {

		// Need to create object for Sample2 class
		
		Sample2 s2 = new Sample2();
		s2.m1();
	}

}
