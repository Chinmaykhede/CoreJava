package com.rays.collection;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		Stack s = new Stack();
		// s.push("Hema Didi");
		for (char c = 'a'; c <= 'z'; c++) {
			s.push(c);
		}
		System.out.println(s);

		System.out.println(s.peek());// last element display
		System.out.println(s.pop()); // last element remove because of LIFO(last in first out)
		System.out.println(s);
	}
}
