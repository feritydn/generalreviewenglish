package day03operators;

import java.util.Scanner;

public class Wapper02 {

	public static void main(String[] args) {
		// Get the first name and last name from the user, 
		// and print them one after the other.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your name");
		
		String name = scan.nextLine();
		
		System.out.println("Please enter your surname");
		
		String surname = scan.nextLine();
		
		System.out.println(name);
		System.out.println(surname);
		
		scan.close();

	}

}
