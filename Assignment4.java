package com.oopsconcepts;

public class Assignment4 {
	
	int x;
	int y;
	int z;
	
	Assignment4()
	{
		
	}
	
	Assignment4(int a, int b, int c)
	{
		x=a;
		y=b;
		z=c;
	}
	
	void sum()
	{
		System.out.println("Sum of three numbers are:" +(x+y+z));
	}
	
	
	void getStuData(int sid, String sname)
	{
		System.out.println("Student Id is :" + sid + " " + "Student Name is:" +sname);
	}
	
	void getStuMarks(int Sub1, int Sub2, int Sub3)
	{
		System.out.println("Marks in Sub1:" +Sub1);
		System.out.println("Marks in Sub2:" +Sub2);
		System.out.println("Marks in Sub3:" +Sub3);

	}
	
	int totalMarks(int Sub1, int Sub2, int Sub3)
	{
		return (Sub1+Sub2+Sub3);
		
	}

	public static void main(String[] args) {

		Assignment4 sa = new Assignment4();
		sa.getStuData(101, "Pankit");
		
		Assignment4 sa1 = new Assignment4();
		sa1.getStuMarks(1000, 200, 300);		
		
		Assignment4 sa3 = new Assignment4();
		System.out.println("Total Marks are:" +sa3.totalMarks(1000, 200, 300));
		
		Assignment4 sa2 = new Assignment4(10, 20, 30);
		sa2.sum(); 
		
	}

}
