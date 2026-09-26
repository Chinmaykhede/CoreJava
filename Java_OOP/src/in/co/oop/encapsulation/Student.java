package in.co.oop.encapsulation;

public class Student {
	private Long studentId;
	private String name;
	private String email;
	private String moblieNo;
	private String course;
	
	public Long getStudentId() {
		return this.studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId=studentId;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public String getMoblieNo() {
		return moblieNo;
	}
	public void setMoblieNo(String moblieNo) {
		this.moblieNo = moblieNo;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

}
