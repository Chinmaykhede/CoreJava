package com.rays.collections.sorting;

import java.util.Comparator;

public class OrderByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.name.compareTo(o2.name); //Sort by name in acs order
		//return o.2.name.compareTo(o1.name);// Sort by name in dsc order
	}
	

}
