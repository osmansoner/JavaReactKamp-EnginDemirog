package services;

import java_react_kamp.*;

public class CourseService {

	public void addToMyCourses(Course course, Student student) {
		
		System.out.println(course.courseName + " isimli kurs Kurslarıma eklenmiştir.");
	}
	
	public void addCommentOnCourses(Course course, Student student, String comment) {
		System.out.println(student.getFullName() + " isimli öğrenci " + course.courseName + " kursu için " + comment + " yorumunu yaptı.");
	}
	

}
