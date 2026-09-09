package com.rays.Map;

import java.util.Hashtable;

public class TestHashTable {
	
//	HashTable does not contain duplicate key
//	Hashtable does not contain null key
//	HashTable does not contain null value
//	Hashtable not maintain order
	public static void main(String[] args) {
		Hashtable h = new Hashtable();
		h.put(101, "Chinmay");
		h.put(102, "Hema");
		h.put(103, "Harshit");
		h.put(104, "Karuna");
		h.put(105, "Abhishek");
		h.put(106,"Harshad");
		h.put(107, "Niketan");
		System.out.println("HashTable:"+h);
		System.out.println("-------------------HashTable Methods--------------");
		System.out.println(h.get(105));
		System.out.println(h.containsKey(107));
		System.out.println(h.containsValue("Chinmay"));
		System.out.println(h.values());
		System.out.println(h.entrySet());
		//System.out.println(h.remove(107));
		System.out.println(h.keySet());
	}

}
