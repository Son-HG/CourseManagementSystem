package Course;

import java.util.Scanner;

public class Gyeongnam_National_University_of_Science_and_Technology extends Course {
	
	public void getUserInput(Scanner input) {
		System.out.print("Course number:");
		int courseNumber = input.nextInt();
		this.setCoursenumber(courseNumber);
		
		int answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you know a Class number? (Y/N) ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Class number:");
				String classNumber = input.next();
				this.setClassnumber(classNumber);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setClassnumber("");
				break;
			}
			else {
			}
			
		}
		
		//System.out.print("Class number:");
		//int classNumber = input.nextInt();
		//this.setClassnumber(classNumber);

		System.out.print("Course name:");
		String name = input.next();
		this.setName(name);;
		
		System.out.print("Professor name:");
		String professor = input.next();
		this.setProfessor(professor);
		
		System.out.print("Credit:");
		int credit = input.nextInt();
		this.setCredit(credit);
	}

}
