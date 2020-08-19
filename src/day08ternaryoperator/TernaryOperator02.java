package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		// Get two numbers from the user
		// If these numbers are equal, print their sums on the screen
		// If these numbers are different, print the product of these two numbers on the screen
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		double result = (num1==num2)? num1+num2 : num1*num2;
		System.out.println(result);
		scan.close();

	}

}
