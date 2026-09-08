package com.rays.collection;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(0, "Tushar");
		al.add(1, "23");
		al.add(2, "Bhopal");
		al.add(3, "M.P");
		System.out.println("ArrayList: " + al);
		al.addFirst("Student");
		System.out.println(al);
		al.addLast("India");
		System.out.println(al);
		System.out.println("---------------------");
		ArrayList al2 = new ArrayList();
		al2.add("Anurag");
		al2.add("20");
		al2.add("Bihar");
		al2.add("U.P");
		System.out.println(al2);
		al2.addFirst("NEET Student");
		System.out.println(al2);
		al2.addLast("India");
		System.out.println(al2);
		al.addAll(al2);
		System.out.println("After adding two Collection:"+al);
		al.contains("Bhopal");
		System.out.println(al);
		System.out.println(al.containsAll(al2));
		System.out.println(al.isEmpty());
		System.out.println(al.remove(0));
		System.out.println(al);
		System.out.println(al.removeAll(al));
		System.out.println(al);
		
	}

}
