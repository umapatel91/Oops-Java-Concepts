package com.oopsconcepts;

public class Calculation {

	int x=10;
	int y=20;
	
/*	void sum()  // Case1 - Not taking any parameter and also not returned any value.
	{
		System.out.println(x+y);
	} */
	
/*	int sum1()  // Case2 - Not taking any parameter but returning value.
	{
		return(x+y);
	} */
	
/*	void sum2(int a, int b)  // Case3 - taking parameter but not returned any value.
	{
		System.out.println(a+b);
	} */
	
	int sum3(int p, int q)  // Case4 - taking parameters and also returning value.
	{
		return(p+q);
	} 
	
	
	public static void main(String[] args) {

		Calculation cal = new Calculation();
	//	cal.sum(); 							// Case1
		
	/*	int res = cal.sum1(); 				// Case2
		System.out.println(res); */
		
	//	cal.sum2(100, 200); 				// Case 3
		
		int res2 = cal.sum3(500, 600); 		// Case 4
		System.out.println(res2);
		
		
		
	}

}
