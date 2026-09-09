package com.rays.Map;

import java.util.HashMap;
import java.util.Map;

public class TestHashMapMethods {
	public static void main(String[] args) {
		Map m = new HashMap();
		m.put(101, "Chinmay"); // HashMap me data add/update karne ke liye
		m.put(102, "Hema");
		m.put(103, "Harshit");
		m.put(104, "Karuna");
		m.put(105, "Abhishek");
		m.put(106, "Harshad");
		m.put(107, "Niketan");
		System.out.println("HashMap:" + m);

		System.out.println(m.get(105)); // key ki value return karti hai

		System.out.println(m.containsKey(101)); // Check karti hai key present hai ya nahi boolean return karti hai

		System.out.println(m.containsValue("Hema")); // Check karti hai value present hai ya nahi boolean return karti
														// hai

		System.out.println(m.size()); // HashMap ka size kitne key-value hai

		System.out.println(m.isEmpty()); // HashMap empty hai ya nahi

		System.out.println(m.keySet()); // HashMap me present saari keys deta hai

		System.out.println(m.values()); // HashMap me present saari values deta hai

		System.out.println(m.entrySet()); // Key+Value dono return karta hai
		
        System.out.println(m.remove(107)); // key-value ko remove karta hai
        
        System.out.println("HashMap:"+m);
        
    //    m.clear(); // clear data karta hai

	}

}
