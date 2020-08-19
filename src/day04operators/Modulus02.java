package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		// Write the program that gives the sum of the first and last digits 
		// of the number of four digits entered by the user.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter a four digit number");
		
		int num = scan.nextInt();
		// we divide an integer by 10 to find the last digit. modulus 10
		int lastDigit = num%10;
		// To find the first digit, it is necessary to divide 1000
		int firstDigit = num/1000;
		
		int result = lastDigit + firstDigit;
		
		System.out.println(result);

		scan.close();
	}

}
