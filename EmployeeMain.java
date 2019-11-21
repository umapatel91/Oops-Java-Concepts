package com.oopsconcepts;

public class EmployeeMain {
	
	public static void main(String[] args)
	{
		
		Employee e = new Employee();
		e.eid = 101;
		e.ename = "Uma";
		e.sal = 5.5f;
		e.salary = 500;
		e.deptno = 10;
		e.job = "Tester";		
		e.display();
		
		Employee e1 = new Employee();
		e1.eid = 102;
		e1.ename = "Pankit";
		e1.sal = 5.452f;
		e1.salary = 40050;
		e1.deptno = 12;
		e1.job = "Developer";		
		e1.display();
	}

}
