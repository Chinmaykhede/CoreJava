package in.co.raya.array;

public class TestArrayInChar {
	public static void main(String[] args) {
		char[] name= new char[7];
		name[0]='C';
		name[1]='h';
		name[2]='i';
		name[3]='n';
		name[4]='m';
		name[5]='a';
		name[6]='y';
		for(char ch:name) {
			System.out.print(ch);
		}
		System.out.println();
		System.out.println("-----------");

	for(int i=0;i<name.length;i++) {
		System.out.println(name[i]+"="+ i);
		
	}
	

}
}
