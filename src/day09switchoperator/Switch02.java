package day09switchoperator;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		// Let the user enter the number of the day
		// Let your program write the name of the day
		// do this using switch ().

		Scanner scan = new Scanner(System.in);
		System.out.println("Please write the day number");
		int day = scan.nextInt();
		
		switch (day) {
		case 1 :
			System.out.println("Sunday");
			break;
		case 2 :
			System.out.println("Monday");
			break;
		case 3 :
			System.out.println("Teusday");
			break;
		case 4 :
			System.out.println("Wednasday");
			break;
		case 5 :
			System.out.println("Thursday");
			break;
		case 6 :
			System.out.println("Friday");
			break;
		case 7 :
			System.out.println("Saturday");
			break;	
			
		default :
			System.out.println("You entered the wrong day number");
		}
		scan.close();
	}

}
