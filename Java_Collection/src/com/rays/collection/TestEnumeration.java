package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.addElement("Chinmay");
		v.addElement("B.Teh");
		v.addElement("CSE");
		v.addElement("5.10");
		v.addElement("9848755758");
		System.out.println(v);
		System.out.println("----------Enumeration-----------");
		Enumeration e =  v.elements();
		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}
	}

}
