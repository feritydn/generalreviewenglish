package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {
		
		// Ask the user to enter a character
		// If the character is a letter, check if it is a lowercase letter
		// If it is lowercase, print "Small Letter" on the screen
		// If it is a capital letter, write "Capital Letter" on the screen
		// If it is not a letter, print "Not a letter" on the screen
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a Character");
		
		char ch = scan.next().charAt(0);
		
		String result = (ch>='A'&& ch<='Z' || ch >='a' && ch<='z')? 
				(ch >='a' && ch<='z' ? "Small leter":"Capital Letter") : "Not a letter";
		System.out.println(result);
		scan.close();
	}

}
