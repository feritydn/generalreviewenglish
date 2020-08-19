package day06ifstatement;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		// to write if statement "if () {}"
		// The word "condition" is very important.
		
		if (2<3) {
			System.out.println("run if body");
		}
		
		System.out.println("if body didn't run");

		// create an int variable and assign a value to it
		// If the value you assign is positive, print "positive" on the screen
		// If the value you assign is negative, print "negative" on the screen.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter an integer");
		
		int num = scan.nextInt();
		
		if (num>=0) {
			System.out.println("Positive");
		}
		if (num<0) {
			System.out.println("Negative");
		}
		
		scan.close();
	}

}
