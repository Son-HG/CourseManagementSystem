
public class Course {
	int coursenumber;
	int classnumber;
	String name;
	String professor;
	int credit;
	
	public Course() {
	}
	
	public Course(int courseNumber, String courseName) {
		this.coursenumber = courseNumber;
		this.name = courseName;
	}
	
	public Course(int courseNumber, int classNumber, String courseName, String professorName, int credit) {
		this.coursenumber = courseNumber;
		this.classnumber = classNumber;
		this.name = courseName;
		this.professor = professorName;
		this.credit = credit;
	}
	;
	public void printInfo() {
		System.out.println("courseNumber:" + coursenumber + " classNumber:" + classnumber + " courseName:" + name + " professorName:" + professor + " credit:" + credit);
	}
	
}
