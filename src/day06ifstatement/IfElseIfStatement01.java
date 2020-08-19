package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
		/// Get age from user
		// If the age is less than 13, print "Cannot work" on the screen
		// If Age is 13 to 65, print “Workable” on the screen
		// If you are older than 65, print "Retired" on the screen
		// if you enter a negative number, say "age cannot be negative"
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your age");
		
		int age = scan.nextInt();
		
		if (age<0) {
			System.out.println("age cannot be negative");
		}else if(age>=0 && age<13) {
			System.out.println("Cannot work");
			
		}else if(age >=13 && age<=65) {
			System.out.println("Workable");
		}else {
			System.out.println("Retired");
		}
		scan.close();

	}

}
