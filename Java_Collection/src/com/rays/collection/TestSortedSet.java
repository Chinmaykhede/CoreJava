package com.rays.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet {
//	SortedSet is Interface 
//	SortedSet is order set in ASC
	public static void main(String[] args) {
		SortedSet st = new TreeSet();
		st.add("g");
		st.add("a");
		st.add("c");
		st.add("e");
        st.add("b");
		st.add("d");
		st.add("f");
		st.add("c");
//		st.add(101); Jis type data ek bar store ho gaya fir dusre type ka data add karne par Exception aayegi ClassCastException
		System.out.println(st);
	}

}
