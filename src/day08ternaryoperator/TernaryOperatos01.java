package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperatos01 {

	public static void main(String[] args) {
		// get a number from the user
		// If the number is positive or 0, write positive or 0 on the screen
		// If negative, write negative on the screen.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		
		int num = scan.nextInt();
		
		// 1. Way ==> IfElse
		
		if (num>=0) {
			System.out.println("Positive or 0");
		}else {
			System.out.println("Negative");
		}

		// 2. Way ==> // Ternary Operator 
		
		// Condition ==> ? if true : if false;
		
		String result = (num >=0) ? "Positive or 0" : "Negative";
		
		System.out.println(result);
		scan.close();
		
	}

}
