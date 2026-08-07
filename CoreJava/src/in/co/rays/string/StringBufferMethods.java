package in.co.rays.string;
// Methods are same Builder and Buffer
public class StringBufferMethods {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Chinmay Khede ");
		sb.append("Hello");
		System.out.println(sb);
		
		System.out.println( "capacity  "+sb.capacity());
		
		System.out.println("Length " +sb.length());
		
		System.out.println("char " +sb.charAt(8));
		
		System.out.println("index " +sb.indexOf("Khede"));
		
		System.out.println("replace "+sb.replace(8, 13, "soni"));
		
		System.out.println("revers "+sb.reverse());
	}

}
