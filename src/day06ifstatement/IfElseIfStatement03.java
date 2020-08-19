package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
		// Ask the user for a 6 digit number. Can also start with 0
		// 20% probability of winning, 30% probability, 50% probability to lose
		// Write a program for the jackpot game.

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a six-digit number.Can start with 0 ");

		int num = scan.nextInt(); 
		
		if (num<200000) {
			System.out.println("You won");
		}else if(num>=200000 && num<500000) {
			System.out.println("Try again.");
		}else {
			System.out.println("You lost");
		}

		scan.close();
	}

}
