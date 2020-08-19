package day09switchoperator;

import java.util.Scanner;

public class LeapYearTernary {

	public static void main(String[] args) {
		// Ask the user to enter the year.
		// If the entered year is a leap year, print the "leap year" on the screen.
		// If it is not "leap year" print on the screen "not leap year"

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a year");

		int year = scan.nextInt();
		
		String result = (year %100 == 0)? (year %400 ==0? "Leap Year" : "Not Leap Year") : (year %4 ==0 ? "Leap Year" : "Not Leap Year");
		System.out.println(result);
		scan.close();
	}

}
