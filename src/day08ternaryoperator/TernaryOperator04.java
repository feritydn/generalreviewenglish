package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {
		
		// Ternary Operator (If else If)
		
		// get a number from the user.
		// If the number is greater than 0, check if it is smaller than 10.
		// If it is less than 10, print a digit on the screen. If not, print a positive number
		// If the number is smaller than zero, write a negative number.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter an integer");
		int num = scan.nextInt();
		
		String result = (num>=0)? (num<10 ? "Digit" : "Positive Number") : "Negative Number";
		System.out.println(result);
		scan.close();
	}

}
