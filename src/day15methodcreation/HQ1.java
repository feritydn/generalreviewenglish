package day15methodcreation;

import java.util.Scanner;

public class HQ1 {

	public static void main(String[] args) {
		// Tell the user to enter numbers. When the user enters zero,
		// print the sum of all the numbers entered so far on the screen.
		// For example; If 5, 4, 7, 0 is 5 + 4 + 7 = 16, print 16 on the screen
		Scanner scan = new Scanner (System.in);
		int num1 = 0;
		int sum =0;
		do {
			System.out.println("Please enter an integer");
			num1 = scan.nextInt();
			sum = sum + num1;
		}while (num1 !=0);
		
		System.out.println("sum of entered numbers: " + sum);
		scan.close();
	}

}
