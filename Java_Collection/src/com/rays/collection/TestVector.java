package com.rays.collection;

import java.util.Vector;

public class TestVector {
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add("Ram");
		v.add("Sita");
		v.add("Gita");
		v.add(3, "34567890");
		//System.out.println(v);
		v.addElement("Niketan");
		
		System.out.println(v.elementAt(0));
		System.out.println(v.get(1));
	}

}
