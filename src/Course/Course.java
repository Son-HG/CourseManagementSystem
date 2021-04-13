package Course;

import java.util.Scanner;

public class Course {
	protected School kind = School.Gyeongsang_National_University;
	protected int coursenumber;
	protected String classnumber;
	protected String name;
	protected String professor;
	protected int credit;
	
	public Course() {
	}
	
	public Course(int courseNumber, String courseName) {
		this.coursenumber = courseNumber;
		this.name = courseName;
	}
	
	public Course(int courseNumber, String classNumber, String courseName, String professorName, int credit) {
		this.coursenumber = courseNumber;
		this.classnumber = classNumber;
		this.name = courseName;
		this.professor = professorName;
		this.credit = credit;
	}
	
	public School getKind() {
		return kind;
	}

	public void setKind(School kind) {
		this.kind = kind;
	}

	public int getCoursenumber() {
		return coursenumber;
	}

	public void setCoursenumber(int courseNumber) {
		this.coursenumber = courseNumber;
	}

	public String getClassnumber() {
		return classnumber;
	}

	public void setClassnumber(String classnumber ) {
		this.classnumber = classnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}
	
	public void printInfo() {
		System.out.println("courseNumber:" + coursenumber + " classNumber:" + classnumber + " courseName:" + name + " professorName:" + professor + " credit:" + credit);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Course number:");
		int courseNumber = input.nextInt();
		this.setCoursenumber(courseNumber);
		
		System.out.print("Class number:");
		String classNumber = input.next();
		this.setClassnumber(classNumber);
		
		System.out.print("Course name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Professor name:");
		String professor = input.next();
		this.setProfessor(professor);
		
		System.out.print("Credit:");
		int credit = input.nextInt();
		this.setCredit(credit);
	}
	
}
