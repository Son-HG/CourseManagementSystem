import java.util.Scanner;

public class CourseManager {
	Course course;
	Scanner input;
	CourseManager(Scanner input){
		this.input = input;
	}
	
	public void addCourse() {
		
		course = new Course();
		System.out.print("Course number:");
		course.coursenumber = input.nextInt();
		
		System.out.print("Class number:");
		course.classnumber = input.nextInt();
		
		System.out.print("Course name:");
		course.name = input.next();
		
		System.out.print("Professor name:");
		course.professor = input.next();
		
		System.out.print("Credit:");
		course.credit = input.nextInt();
	}
	
	public void deleteCourse() {
		System.out.print("Course number:");
		int courseNumber = input.nextInt();
		if (course == null) {
			System.out.println("The course has not been registered.");
			return;
		}
		if (course.coursenumber == courseNumber) {
			course = null;
			System.out.println("The course is deleted.");
		}
	}
	
	public void editCourse() {
		System.out.print("Course number:");
		int courseNumber = input.nextInt();
		if (course.coursenumber == courseNumber) {
			System.out.println("The course to be edited is " + courseNumber);
		}
	}
	
	public void viewCourse() {
		System.out.print("Course number:");
		int courseNumber = input.nextInt();
		if (course.coursenumber == courseNumber) {
			course.printInfo();
		}
	}

}
