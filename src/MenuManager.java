import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
	
		while (num != 6) {
			System.out.println("*** Course Management System Menu ***");
			System.out.println("1. Add Course");
			System.out.println("2. Delete Course");
			System.out.println("3. Edit Course");
			System.out.println("4. View Course");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6:");
			num = input.nextInt();
			if (num == 1) {
				AddCourse();	
			}
			else if (num == 2) {
				DeleteCourse();
			}
			else if (num == 3) {
				EditCourse();
			}
			else if (num == 4) {
				ViewCourse();
			}
			else {
				continue;
			}
			
		}
		
	}
	
	public static void AddCourse() {
		Scanner input = new Scanner(System.in); 
		System.out.print("Course number:");
		String courseNumber = input.next();
		System.out.print("Class number:");
		int classNumber = input.nextInt();
		System.out.print("Course name:");
		String courseName = input.next();
		System.out.print("Professor name:");
		String professorName = input.next();
		System.out.print("Credit:");
		int credit = input.nextInt();
	}
	
	public static void DeleteCourse() {
		Scanner input = new Scanner(System.in); 
		System.out.print("Course number:");
		String courseNumber = input.next();
	}
	
	public static void EditCourse() {
		Scanner input = new Scanner(System.in); 
		System.out.print("Course number:");
		String courseNumber = input.next();
	}
	
	public static void ViewCourse() {
		Scanner input = new Scanner(System.in); 
		System.out.print("Course number:");
		String courseNumber = input.next();
	}

}
