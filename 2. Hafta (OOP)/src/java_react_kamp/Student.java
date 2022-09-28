package java_react_kamp;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	
	
	public Student(int studentId, String fullName, String email, String password) {
		super();
		this.studentId = studentId;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fullName=" + fullName + ", email=" + email + ", password="
				+ password + "]";
	}
	int studentId;
	private String fullName;
	private String email;
	private String password; 	// Şifrenin daha güvenli tutulması için Hash'lenmesi gerekiyor.
	private List<Course> myCourses = new ArrayList<Course>();
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Course> getMyCourses() {
		return myCourses;
	}
	public void setMyCourses(List<Course> myCourses) {
		this.myCourses = myCourses;
	}
	

}
