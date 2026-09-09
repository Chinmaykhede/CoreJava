package com.rays.Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestSortedMap {
//	SortedMap Maintain order
//	Sortedmap allow Multipal null values
	public static void main(String[] args) {
		SortedMap sm = new TreeMap();
		sm.put(1, "Avengers");
		sm.put(2, "Thor");
		sm.put(3, "Ironman");
		sm.put(4, "Captain Amarica");
		sm.put(5, "Loki");
		sm.put(6, "Captain Marvel");
		sm.put(7, null);
		sm.put(8, "Karish");
		sm.put(9, "Hulk");
		sm.put(10, null);
		System.out.println("SortedMap: "+sm);
		
		System.out.println("--------SortedMap Methods----------");
		
		System.out.println(sm.firstKey()); // data ki Small key return karta hai
		
		System.out.println(sm.lastKey()); // data ki Big key return karta hai
		
		System.out.println(sm.containsKey(10)); // check karta hai ki given key TreeMap me available hai ya nahi
		
		System.out.println(sm.containsValue("Thor"));//check karta hai ki given value  TreeMap me available hai ya nahi
		
		System.out.println(sm.size());//TreeMap me total entries ki number return karta hai
		
		System.out.println(sm.headMap(5));// given key se pehle wali saari entries ka ek view return karta hai   or  Agar given key ko bhi include karna hai ex: (key , true)
		
		System.out.println(sm.tailMap(5));//given key se baad wali saari entries ka ek view return karta hai 
		
		System.out.println(sm.subMap(1, 5));// two keys ke beech ka data return karta hai
	}

}
