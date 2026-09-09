package com.rays.Map;

import java.util.TreeMap;

public class TestTreeMap {
	// TreeMap data key-value pair me store karta hai aur keys ko sorted order me
	// rakhta hai
	public static void main(String[] args) {
		TreeMap t = new TreeMap();
		t.put(10, "Avengers");
		t.put(9, "Thor");
		t.put(8, "Ironman");
		t.put(7, "Captain Amarica");
		t.put(6, "Loki");
		t.put(5, "Captain Marvel");
		t.put(4, null);
		t.put(3, "Karish");
		t.put(2, "Hulk");
		t.put(1, null);
		System.out.println("TreeMap:" + t);
		System.out.println("----------TreeMap Methods--------------");
		System.out.println(t.firstKey());
		System.out.println(t.lastKey());
		System.out.println(t.containsKey(10));
		System.out.println(t.containsValue("Thor"));
		System.out.println(t.size());
		System.out.println(t.headMap(5));
		System.out.println(t.tailMap(5));
		System.out.println(t.subMap(2, 5));
	}

}
