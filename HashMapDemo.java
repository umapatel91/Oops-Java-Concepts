package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		//1.Declaration
		
		// HashMap hm = new HashMap();
		
		HashMap <Integer,String> hm = new HashMap <Integer,String> ();	//Integer is a Key and String is Value
		
		//2.Adding pairs into hashmap
		hm.put(101, "John");
		hm.put(102, "Smith");
		hm.put(103, "David");
		hm.put(104, "Scott");
		hm.put(105, "Kim");
		
		System.out.println(hm);
		
		//3.Remove pair from hashmap
		hm.remove(103);
		
		System.out.println("After removing a pair:" +hm);
		
		//4.Read values from hashmap using for loop
		
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		
	}

}
