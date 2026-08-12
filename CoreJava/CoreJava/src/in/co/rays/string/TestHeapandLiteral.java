package in.co.rays.string;

public class TestHeapandLiteral {
	public static void main(String[] args) {
		String name = "Java";
		String name1 = "Java";
		System.out.println(name==name1); // by value
		
		String name2 =  new String ("Hello Java");
		String name3 =  new String ("Hello Java");
		System.out.println(name2==name3);// by object
		System.out.println(name2.equals(name3));// by value

}
}
