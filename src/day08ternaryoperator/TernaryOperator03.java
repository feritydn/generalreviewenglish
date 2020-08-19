package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator03 {

	public static void main(String[] args) {
		// Get two numbers from the user
		// Print the small number on the screen

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter two digits");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		int result = (num1<=num2)? num1:num2;
		System.out.println(result);

		scan.close();
	}

}
