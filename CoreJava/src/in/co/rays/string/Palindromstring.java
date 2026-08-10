package in.co.rays.string;

public class Palindromstring {
	public static void main(String[] args) {
		String name ="kanak";
		String rev="";
		for(int i =name.length()-1; i>=0;i--) {
			rev=rev+name.charAt(i);
		
		}if(name.equals(rev)) {
			System.out.println("palidrom");
	}else {
		System.out.println("not palidrom");
	}
}
} 