package day09switchoperator;

import java.util.Scanner;

public class Switch03 {

	public static void main(String[] args) {
		// Enter user month name
		// Let the program write the month number on the screen
		// lowercase letters work for all
		// If you enter the wrong month name, “Please enter the current month name”

		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the month name");
		String month = scan.next().toLowerCase();
		
		switch (month) {
			case "january" :
				System.out.println("1. month");
			break;
			case "fabuary" :
				System.out.println("2. month");
			break;
			case "march" :
				System.out.println("3. month");
			break;
			case "april" :
				System.out.println("4. month");
			break;
			case "may" :
				System.out.println("5. month");
			break;
			case "june" :
				System.out.println("6. month");
			break;
			case "july" :
				System.out.println("7. month");
			break;
			case "august" :
				System.out.println("8. month");
			break;
			case "september" :
				System.out.println("9. month");
			break;
			case "october" :
				System.out.println("10. month");
			break;
			case "november" :
				System.out.println("11. month");
			break;
			case "december" :
				System.out.println("12. month");
			break;
			default :
				System.out.println("Please enter the current month name");
		}
		scan.close();
	}

}
