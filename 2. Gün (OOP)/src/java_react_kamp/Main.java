package java_react_kamp;

import services.*;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1,"Osman Soner","osmansoner@gmail.com","123456789");
		Student student2 = new Student(2,"Safa Soner","osmansoner@gmail.com","123456789");
		Student[] students = {student1,student2};
		
		Instructor instructor1 = new Instructor(1,"Engin Demiroğ","https://www.filepicker.io/api/file/GsqiGFGCRmuBuel0qqF3","https://www.kodlama.io/courses/1542426/author_bio"); 
		Instructor instructor2 = new Instructor(2,"Safa Soner", "https://www.filepicker.io/api/file/GsqiGFGCRmuBuel0qqF3","https://www.kodlama.io/courses/1542426/author_bio");
		Instructor[] Instructors = {instructor1, instructor2};
		
		
		Course course1 = new Course(1, "(2022) Yazılım Geliştirici Yetiştirme Kampı (JAVA)", "https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://cdn.filestackcontent.com/qUyYtyzXTrOSH2M2ApBh", instructor2, "0");
		Course course2 = new Course(2, "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", "https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/Cs7lHNsJSCi1mkPzo8fT", instructor2, "0");
		Course[] courses = {course1,course2};
		
		CourseService courseService = new CourseService();
		courseService.addToMyCourses(course1, student1);
		courseService.addCommentOnCourses(course1, student1, "Kurs çok güzel");
		
		
		
		

	}

}
