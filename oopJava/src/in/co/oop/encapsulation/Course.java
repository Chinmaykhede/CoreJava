package in.co.oop.encapsulation;

public class Course {
	private int CourseId;
	private String CourseName;
	private String Duration;
	private double Fees;
	private String TrainerName;

	public int getCourseId() {
		return this.CourseId;
	}

	public void setCourseId(int CourseId) {
		this.CourseId = CourseId;
	}

	public String getCourseName() {
		return this.CourseName;
	}

	public void setCourseName(String CourseName) {
		this.CourseName = CourseName;
	}

	public String getDuration() {
		return this.Duration;
	}

	public void setDuration(String Duration) {
		this.Duration = Duration;
	}

	public double getFees() {
		return this.Fees;
	}

	public void setFees(double Fees) {
		this.Fees = Fees;
	}

	public String getTrainerName() {
		return this.TrainerName;
	}

	public void setTrainerName(String TrainerName) {
		this.TrainerName = TrainerName;
	}
}
