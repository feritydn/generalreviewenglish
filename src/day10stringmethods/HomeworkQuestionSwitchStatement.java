package day10stringmethods;

import java.util.Scanner;

public class HomeworkQuestionSwitchStatement {

	public static void main(String[] args) {
		/* Get the month name from the user, if the month name is one of 31 days, 
		print "This month is 31 days" on the screen.
		If the month name is one of the 30-day months, print 
		"This month is 30 days" on the screen.
		If the month name is one of the months that draw 28 or 29, print 
		"This month is February" on the screen.
		Print "Invalid month name" for names other than these names. */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a month name");
		String month = scan.next().toLowerCase();
		
		switch (month) {
		case "january" : 
			System.out.println("This month is 31 days");
			break;
		case "march" : 
			System.out.println("This month is 31 days");
			break;
		case "may" : 
			System.out.println("This month is 31 days");
			break;
		case "july" : 
			System.out.println("This month is 31 days");
			break;
		case "august" : 
			System.out.println("This month is 31 days");
			break;
		case "october" : 
			System.out.println("This month is 31 days");
			break;
		case "december" : 
			System.out.println("This month is 31 days");
			break;	
		case "april" : 
			System.out.println("This month is 30 days");
			break;	
		case "june" : 
			System.out.println("This month is 30 days");
			break;
		case "september" : 
			System.out.println("This month is 30 days");
			break;
		case "november" : 
			System.out.println("This month is 30 days");
			break;
		case "februray" : 
			System.out.println("This month is February");
			break;
		default :
			System.out.println("Invalid month name");
		}
		scan.close();
	}

}
