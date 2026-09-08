package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {

		Collection c = new ArrayList();
		c.add(45);
		c.add("Rakesh");
		c.add('R');
		c.add(5.8);
		c.add(true);

		System.out.println(c);
		System.out.println("size of c: " + c.size());// Number of elements
//
		System.out.println("---------");
//
		for (Object o : c) {
			System.out.println(o);
		}
//
		System.out.println("--------");
		System.out.println(c.contains(45)); // membership checking
		System.out.println(c.contains('a'));
		System.out.println("---------");
		System.out.println(c.remove(87)); //Remove an element
		System.out.println(c.remove('a'));
		System.out.println(c);
		System.out.println("size of c: " + c.size());
//
//	}

	}

}
