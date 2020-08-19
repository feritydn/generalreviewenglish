package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		// Get a number from the user
		// if this number is positive check if it is greater than 9
		// Print a positive number on the screen if it is larger than 9.
		// If it is smaller than 9 and greater than zero, put a digit on the screen
		// if negative, print a number on the screen

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter an integer");

		int num = scan.nextInt();
		
		if (num>=0) {
			if(num>=0 && num <=9) {
				System.out.println("Digit");
			}else {
				System.out.println("Positive number");
			}
		}else {
			System.out.println("Negative Number");
		}
		scan.close();
	}

}
