package com.rays.stream;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class TestStream {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Ironman");
		list.add("Shaktiman");
		list.add("Hero");
		list.add("Thor");
		list.add("Loki");
		list.add("Hero");
		list.add("Doctor Strange");
		list.add("Hulk");
		list.add("Captain Marvel");
		list.add("Krish");
		
		list.forEach(System.out::println);
		System.out.println("--------Sorted list----------");
		//Collections.sort(list);
		list.forEach(System.out::println);
		System.out.println("---------Stream-----------");
		list.stream().sorted().distinct().forEach(System.out::println);//distinct remove duplicate
		System.out.println("---------ReverseOrder-------------");
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("----------Map Method----------");
		// Use lambda Exprestion
		list.stream().map(e -> e.toUpperCase()).distinct().forEach(System.out::println);
		
		
	
	
	}
}
