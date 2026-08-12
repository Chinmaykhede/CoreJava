package in.co.raya.array;

public class NoteCountInArray {
	public static void main(String[] args) {
		int amount=5500;
		int[] note= {2000,1000,500,200,100,50,20,10,5,2,1};
		int count=0;
		for(int i=0; i<note.length;i++) {
			count=amount/note[i];
			if(count>0) {
				System.out.println(note[i] +"="+count);
			}
			amount=amount%note[i];
		}
	}

}
