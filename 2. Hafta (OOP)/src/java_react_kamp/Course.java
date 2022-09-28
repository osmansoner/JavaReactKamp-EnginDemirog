package java_react_kamp;

public class Course {
	
	
	public Course(int courseId, String courseName, String imageURL, Instructor instructor, String progressOfUser) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.imageURL = imageURL;
		this.instructor = instructor;
		this.progressOfUser = progressOfUser;
	}
	
	
	
	int courseId;
	public String courseName;
	public String imageURL;
	public Instructor instructor;
	public String progressOfUser;
	
	
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getImageURL() {
		return imageURL;
	}
	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public String getProgressOfUser() {
		return progressOfUser;
	}
	public void setProgressOfUser(String progressOfUser) {
		this.progressOfUser = progressOfUser;
	}
	

}
