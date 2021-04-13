import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		CourseManager courseManager = new CourseManager(input);
		int num = 0;
	
		while (num != 5) {
			System.out.println("*** Course Management System Menu ***");
			System.out.println("1. Add Course");
			System.out.println("2. Delete Course");
			System.out.println("3. Edit Course");
			System.out.println("4. View Courses");
			System.out.println("5. Exit");
			System.out.println("Select one number between 1-5:");
			num = input.nextInt();
			if (num == 1) {
				courseManager.addCourse();	
			}
			else if (num == 2) {
				courseManager.deleteCourse();
			}
			else if (num == 3) {
				courseManager.editCourse();
			}
			else if (num == 4) {
				courseManager.viewCourses();
			}
			else {
				continue;
			}
			
		}
		
	}
	
}
