package day15methodcreation;

import java.util.Scanner;

public class MethodCreation02 {

	public static void main(String[] args) {
		// Write a method that translates the hour to seconds, miles to kilometers, kilograms to grams.
		// Create this method outside the main method and call it inside the main method.
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the unit");
		String str = scan.nextLine().toLowerCase();
		System.out.println("Please enter the amount");
		double num = scan.nextDouble();
		converter(str, num);
		scan.close();
	}

	
	public static void converter (String str, double num) {
		switch (str) {
		case "hour":
			System.out.println(num*60*60);
			break;
		case "miles":
			System.out.println(num*1.6);
			break;
		case "kilogram":
			System.out.println(num*1000);
			break;
		default :
			System.out.println("You entered a wrong unit");
		}
		
	}
}
