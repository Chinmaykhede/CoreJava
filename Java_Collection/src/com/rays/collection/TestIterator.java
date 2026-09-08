package com.rays.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("Chinmay");
		l.add("Hema");
		l.add("A");
		l.add(34);
		l.add(58665);
		System.out.println(l);

		System.out.println("-------Iterator--------");

		Iterator it = l.iterator();

		while (it.hasNext()) { // Checks whether another element is available
			// hasNext() method return boolean value
			// it.remove(); // java.lang.IllegalStateException

			Object o = it.next(); // next() Return the next element
			System.out.println(o);
			it.remove(); // Removes the current element
		}
		System.out.print(l);
	}

}
