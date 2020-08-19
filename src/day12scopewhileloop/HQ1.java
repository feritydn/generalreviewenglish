package day12scopewhileloop;

import java.util.Scanner;

public class HQ1 {

	public static void main(String[] args) {
		// Get the name of the country where the user lives from
		// second letter from start and second letter from last
		// print on the screen in capital letters.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the name of the country you live in.");
		String country = scan.nextLine().toUpperCase();
		
		System.out.println(country.charAt(1));
		System.out.println(country.charAt(country.length()-2));
		scan.close();
	}

}
