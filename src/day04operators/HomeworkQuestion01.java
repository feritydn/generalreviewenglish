package day04operators;

import java.util.Scanner;

public class HomeworkQuestion01 {

	public static void main(String[] args) {

		// Write a program that prints the user's age and name on the screen

		// After getting Integer from the user, we cannot get a String.
		
		// the code will not work if we use nextLine after using nextInt in java
		// use nextLine instead of nextInt and then the String you obtained
		// Integers using integer.parseInt ().
		// Integer.parseInt () works only for strings containing numbers
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		
		String age = scan.nextLine();
		
		int ageNew = Integer.parseInt(age);
		System.out.println(ageNew);
		System.out.println("Please enter your name and surname");
		String name = scan.nextLine();
		System.out.println(name);
		scan.close();
		
		

	}

}
