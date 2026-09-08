package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionAll {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();

		c1.add(80);
		c1.add("Bharti");
		c1.add('B');
		c1.add(5.2);
		c1.add(true);

		System.out.println("c1: " + c1);
//		System.out.println("size of c1: " + c1.size());
//		System.out.println("Is Empty: " + c1.isEmpty()); // whether it is empty
//		//c1.clear();// Remove all elements
//		System.out.println(c1);
//		System.out.println("------------");

		Collection c2 = new ArrayList();

		c2.add(80);
		c2.add("Hanuman");
		c2.add('B');

		System.out.println("c2: " + c2);
//		System.out.println("size of c2: " + c2.size());
//
//		System.out.println("--------------");
//
//		//c1.addAll(c2); // Add a Collection
//		//System.out.println("c1 after adding c2: " + c1);
//
//		//System.out.println(c1.removeAll(c2)); // Remove a Collection
//		//System.out.println("c1 after remove c2: " + c1);
//		//System.out.println(c1.removeAll(c2));
//      System.out.println(c1);
     c1.retainAll(c2);
      System.out.println(c1.retainAll(c2));
	}
}
