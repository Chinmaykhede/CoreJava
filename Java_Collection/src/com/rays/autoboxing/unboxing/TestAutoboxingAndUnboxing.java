package com.rays.autoboxing.unboxing;

public class TestAutoboxingAndUnboxing {
	public static void main(String[] args) {
		int a = 25;
		Integer b = a; // Autoboxing
		System.out.println(b);
		System.out.println("--------------------");
		int c = b; // Unboxing
		System.out.println(c);
		System.out.println("-----Methods-------");
		System.out.println(Integer.max(35, 89));
		System.out.println("-----------");
		String str = "50";
		int d = Integer.parseInt(str); // parseInt String to Convert int
		System.out.println("String to Integer: " + d);
		System.out.println("-------------");
		String s = String.valueOf(d);// valueOf Integer to Convert String
		System.out.println("Integer to String: "+d);

	}

}
