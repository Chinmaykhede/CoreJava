package com.rays.collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
//	Set contain only unique elements
//	Set contain one null value
//	Order of set is not define
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add("Gunjan");
		s.add(null);
		s.add("Rakesh");
		s.add("Rubby");
		s.add("Daimond");
		s.add(null);
		s.add("Gold");
		s.add("Silver");
		s.add("Rakesh");
		System.out.println(s);
	}

}
