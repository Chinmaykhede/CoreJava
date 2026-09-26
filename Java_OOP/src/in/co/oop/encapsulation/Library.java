package in.co.oop.encapsulation;

public class Library {
	private Long libraryId;
	private String libraryName;
	private String address;
	private int totalBook;
	private String contactNo;

	public Long getlibraryId() {
		return this.libraryId;
	}

	public void setlibraryId(Long libraryId) {
		this.libraryId = libraryId;
	}

	public String getlibraryName() {
		return this.libraryName;
	}

	public void setlibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getaddress() {
		return this.address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

	public int gettotalBook() {
		return this.totalBook;
	}

	public void settotalBook(int totalBook) {
		this.totalBook = totalBook;
	}

	public String getcontactNo() {
		return this.contactNo;
	}

	public void setcontactNo(String contactNo) {
		this.contactNo = contactNo;
	}
}
