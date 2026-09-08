package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add("Chinmay");
		l.add("Kartik");
		l.add("Abhishek");
		l.add("Harshit");
		System.out.println(l);
		System.out.println("------------------------");

		List l2 = new ArrayList();
		l2.add(0, "Arjun");
		l2.add(1, "Gupta");
		l2.add(2, "35");
		System.out.println(l2);
		System.out.println(l.get(0));// get element by index value
		System.out.println(l.set(3, "Jai Hanuman"));// update element
		System.out.println(l);
		

	}

}
