package com.rays.collections.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparableMarksheet {
	public static void main(String[] args) {
		ArrayList<Marksheet> list = new ArrayList<Marksheet>();
		list.add(new Marksheet("105", "Baldev", 36));
		list.add(new Marksheet("101", "Puneet", 66));
		list.add(new Marksheet("103", "Ramdulera", 62));
		list.add(new Marksheet("102", "Deepk", 33));
		list.add(new Marksheet("104", "Salman", 78));
		list.add(new Marksheet("106", "Varun", 23));
		list.forEach(System.out::println);
		System.out.println("------Sorted Marksheet------");
		Collections.sort(list); // use comparable interface
		list.forEach(System.out::println);
	}

}
