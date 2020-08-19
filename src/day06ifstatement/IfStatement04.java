package day06ifstatement;

import java.util.Scanner;

public class IfStatement04 {

	public static void main(String[] args) {
		
		// Create one string variable and assign the value of a day with a small letter
		// If the value you assign is one of the weekdays
		// "Print Weekdays" on the screen
		// If it's one of the weekend days, print "Weekend" on the screen.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a day name");
		
		String day = scan.nextLine().toLowerCase();
		
		if (day.equals("sunday") ||day.equals("saturday")) {
			System.out.println("Weekend");
			
		}
		
		if (day.equals("monday")||day.equals("teusday")||day.equals("wednasday")||day.equals("thursday")||day.equals("friday")) {
			System.out.println("Weekday");
		}

		scan.close();
	}

}
