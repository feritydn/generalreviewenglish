package day14dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// Get Number from User
		// If the number is less than 10, print "You Won" on the screen.
		// If the number is greater than 10 or 10, print "Enter an integer" on the screen.
		
		Scanner scan = new Scanner (System.in);
		int num=0;
		do {
			System.out.println("Please enter an integer");
			num = scan.nextInt();
		}while(num>=10);
		System.out.println("You Won");
scan.close();
	}

}
