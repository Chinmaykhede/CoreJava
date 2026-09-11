package com.rays.collections.sorting;

import java.util.ArrayList;
import java.util.Iterator;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Rakesh", 1000);
		Employee e2 = new Employee(2, "Sita", 45000);
		Employee e3 = new Employee(3, "Gill", 62000);
		Employee e4 = new Employee(4, "Sankalp", 55333);
		Employee e5 = new Employee(5, "Shruti", 42000);
		ArrayList list = new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		System.out.println(list);
		System.out.println("-------foreach------------");
		for (Object o : list) {
			System.out.println(o);

		}
		System.out.println("-----------Iterator-------------");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}

}
