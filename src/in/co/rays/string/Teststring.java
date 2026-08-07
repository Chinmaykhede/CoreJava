package in.co.rays.string;

public class Teststring {
	public static void main(String[] args) {
		String name = "my name is chinmay";
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(4));
		System.out.println(name.indexOf("may"));
		System.out.println(name.indexOf("i"));
		System.out.println(name.lastIndexOf("a"));
		System.out.println(name.replace('m','n'));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.startsWith("my"));
		System.out.println(name.endsWith("may"));
		System.out.println(name.substring(4));

}
}