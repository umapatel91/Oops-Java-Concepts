package com.oopsconcepts;

public class OverloadMainMethod {
	
	public void main(int x)
	{
		System.out.println(x);
	}
	
	public void main(int x, int y)
	{
		System.out.println(x+y);
	}

	public static void main(String[] args)
	{
		OverloadMainMethod om = new OverloadMainMethod();
		om.main(10);
		om.main(20, 30);
	}
}
