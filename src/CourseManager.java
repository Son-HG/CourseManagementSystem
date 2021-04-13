import java.util.ArrayList;
import java.util.Scanner;

import Course.Course;
import Course.Gyeongnam_National_University_of_Science_and_Technology;

public class CourseManager {
	ArrayList<Course> courses = new ArrayList<Course>();
	Scanner input;
	CourseManager(Scanner input){
		this.input = input;
	}
	
	public void addCourse() {
		int SchoolNum = 0;
		Course course ;
		while (SchoolNum != 1 && SchoolNum != 2) {
			System.out.print("1 for Gyeongsang_National_University");
			System.out.print("2 for Gyeongnam_National_University_of_Science_and_Technology");
			System.out.print("Select num for School between 1 and 2 : ");
			SchoolNum = input.nextInt();
			if (SchoolNum == 1) {
			    course = new Course();
			    course.getUserInput(input);
			    courses.add(course);
				break;
			}
			else if (SchoolNum == 2) {
				course = new Gyeongnam_National_University_of_Science_and_Technology();
				course.getUserInput(input);
				courses.add(course);
				break;
			}
	        else {
	        	System.out.print("Select num for School between 1 and 2 : ");
	        }
		}
	}
	
	public void deleteCourse() {
		System.out.print("Course number:");
		int courseNumber = input.nextInt();
		int index = -1;
		for (int i = 0; i < courses.size(); i++) {
			if (courses.get(i).getCoursenumber() == courseNumber) {
				index = i;
				break;
			}	
		}
		if (index >= 0) {
			courses.remove(index);
			System.out.println("The course "+ courseNumber +"is deleted.");
		}
		else {
			System.out.println("The course has not been registered.");
			return;
		}
	}
	
	public void editCourse() {
		System.out.print("Course number:");
		int courseNumber = input.nextInt();
		for (int i = 0; i < courses.size(); i++) {
			Course course = courses.get(i);
			if (course.getCoursenumber() == courseNumber) {
				int num = -1;
				while (num != 6) {
					System.out.println("*** Course Info edit Menu ***");
					System.out.println("1. edit Course number");
					System.out.println("2. edit Class number");
					System.out.println("3. edit Course name");
					System.out.println("4. edit Professor name");
					System.out.println("5. edit Credit");
					System.out.println("6. Exit");
					System.out.println("Select one number between 1-6:");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Course number:");
						int coursenumber = input.nextInt();	
						course.setCoursenumber(courseNumber);
					}
					else if (num == 2) {
						System.out.print("Class number:");
						String classnumber = input.next();
						course.setClassnumber(classnumber);
					}
					else if (num == 3) {
						System.out.print("Course name:");
						String name = input.next();
						course.setName(name);
					}
					else if (num == 4) {
						System.out.print("Professor name:");
						String professor = input.next();
						course.setProfessor(professor);
					}
					else if (num == 5) {
						System.out.print("Credit:");
						int credit = input.nextInt();
						course.setCredit(credit);
					}
					else {
						continue;
					} //if
				} //while
				break;
			}// if
		}// for
	}
	
	public void viewCourses() {
//		System.out.print("Course number:");
//		int courseNumber = input.nextInt();
		System.out.println("# of registered courses:" + courses.size());
		for (int i = 0; i < courses.size(); i++) {
			courses.get(i).printInfo();
		}
	}
}
