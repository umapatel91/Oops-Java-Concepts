package com.oopsconcepts;

public class Student {
	
	int sid;
	String sname;
	char grade;
	
	Student(int id, String name, char g) // Constructor
	{
		sid = id;
		sname = name;
		grade = g;
	}
	
	void getValues(int id, String name, char g) // Method with parameter
	{
		sid = id;
		sname = name;
		grade = g;
	}
	
	void display() 
	{
		System.out.println(sid+ " " +sname + " " +grade);
	}

}
