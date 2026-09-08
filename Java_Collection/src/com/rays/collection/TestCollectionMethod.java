package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionMethod {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();

		c1.add("Chinmay");
		c1.add(10);
		c1.add(5.9);
		c1.add('K');
		c1.add(true);

		System.out.println("c1: " + c1);
		System.out.println("c1 size: " + c1.size());

		System.out.println("--------");

		Collection c2 = new ArrayList();

		c2.add("Hariom");
		c2.add(6);
		c2.add(2.5);
		c2.add('H');
		c2.add(false);

		System.out.println("c2: " + c2);
		System.out.println("c2 size: " + c2.size());

		System.out.println("------");
		System.out.println(c1.containsAll(c2));
		c1.addAll(c2);
		System.out.println(c1.containsAll(c2));
		System.out.println("c1 after addAll c2: " + c1);
		System.out.println("c1 is empty: " + c1.isEmpty());
		c1.clear();
		System.out.println("c1: " + c1);

		System.out.println("c1 is empty: " + c1.isEmpty());

	}
}
