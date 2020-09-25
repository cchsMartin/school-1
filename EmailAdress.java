
/**
 *Author: Ayden Bales
 *Date: Sep 23, 2020
 *Description: Unit 1 Project - Create a program that assigns an email address to a Colgan Student.
 */
import java.util.Scanner;

public class EmailAdress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Shark Mail setup!");
		System.out.println("Please enter your first name:");
		String firstName = sc.nextLine();
		System.out.println("Please enter your middle name:");
		String middleName = sc.nextLine();
		System.out.println("Please enter your last name:");
		String lastName = sc.nextLine();
		System.out.println("Finally, please enter your birthday (MM-DD-YYYY, with dashes):");
		String birthday = sc.nextLine();
		String email = lastName.toLowerCase() + firstName.substring(0,1).toUpperCase() + middleName.substring(0,1).toUpperCase() + "@sharkmail.com";
		String password = birthday.substring(0,2) + birthday.substring(3,5) + birthday.substring(6);
		System.out.println("-------------------------------------------------");
		System.out.println("Email: " + email);
		System.out.println("Temp Password: " + password);
		System.out.println("*** This temporary password is very insecure. Please change it immediately! ***");
		System.out.println("-------------------------------------------------");

	}

}
