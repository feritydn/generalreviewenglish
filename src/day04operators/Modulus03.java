package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		// Get a 3 digit integer from the user
		// find the sum of the numbers of this number.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number with three digits");
		
		int num = scan.nextInt();
		
		// 10% to get the last digit
		int lastDigit = num%10;
		
		// for the midle number firstly divide the number by 10 then %10
		int midDigit = (num/10)%10;
		
		//divide the number by 100 for the first digit
		int firstDigit = num/100;
		// If the number had 4 digits, we would divide the number 
		// by 1000 for the first digit.
		
		int result = lastDigit + midDigit + firstDigit;
		
		System.out.println(result);
		
		scan.close();
		
	}

}
