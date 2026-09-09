package com.rays.Map;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
//	HashMap does not Contain Duplicate key
//	HashMap Contain only one null key
//	HashMap value can be Duplicate
//	HashMap can Contain Multiple null value
//	HashMap not Maintain Order
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put(101, "Chinmay");
		m.put(102, "Hema");
		m.put(103, "Harshit");
		m.put(104, "Karuna");
		m.put(105, "Abhishek");
		m.put(106,"Harshad");
		m.put(107, "Niketan");
		System.out.println("HashMap:"+m);
		
	}

}
