package in.co.rays.string;

public class Stringcount {
	public static void main(String[] args) {
		String str = "Google";
		int count = 0;
		char ch = 'o';
		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				count++;
			}
		}
		System.out.println("count is  " + count);
	}

}
