package com.oopsconcepts;

public class StudentMain {

	public static void main(String[] args) {

		Student stu1 = new Student(1011, "Uma", 'B'); // 3. Assign values by using constructor.
				
		// 1. Assign values by using reference variables.
	/*	stu1.sid = 1;
		stu1.sname = "Uma";
		stu1.grade = 'a'; */
		
		// 2. Assign values by using methods.
	/*  stu1.getValues(101, "John", 'A'); */
		
		stu1.display(); 
		
	}

}
