package day07nestedif;

import java.util.Scanner;

public class InterviewQuestionLeapYear {

	public static void main(String[] args) {

		// Ask the user to enter the year.
		// If the entered year is a leap year, print the "leap year" on the screen.
		// If it is not "leap year" print on the screen "not leap year"

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a year");

		int year = scan.nextInt();

		if (year % 100 == 0) {
			if (year % 400 == 0) {
				System.out.println("Leap Year");
			} else {
				System.out.println("Not Leap Year");
			}
		} else if (year % 100 != 0) {
			if (year % 4 == 0) {
				System.out.println("Leap Year");
			} else {
				System.out.println("Not Leap Year");
			}
		}
		scan.close();
	}

}
