package in.co.raya.array;

import java.util.Arrays;

public class AnagramByArray {
	public static void main(String[] args) {
		String str = "listen";
		String str1 = "silent";
		char[] a = str.toCharArray();
		char[] b = str1.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if (Arrays.equals(a, b)) {
			System.out.println("It is an Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

}
