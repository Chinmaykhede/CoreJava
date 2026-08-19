package in.co.oop.encapsulation;

public class TestLibrary {
	public static void main(String[] args) {
		Library l = new Library();
		l.setlibraryId(5001L);
		l.setlibraryName("Rays");
		l.setaddress("Indore");
		l.settotalBook(2);
		l.setcontactNo("7456903581");
		
		System.out.println("library ="+l.getlibraryId());
		System.out.println("libraryName ="+l.getlibraryName());
		System.out.println("address ="+l.getaddress());
		System.out.println("totalBook ="+l.gettotalBook());
		System.out.println("contactNo ="+l.getcontactNo());
	}

}
