package com.rays.collection;

import java.util.ArrayList;
//Generics provides a way in order to communicate the type of a collection to the compiler. 
// Define type of a collection to compiler.                        
                            
public class TestGererics {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
	//	l.add("R");//compilation problem kayou ki same type ka data nahi hai
		System.out.println(l);
	}

}
