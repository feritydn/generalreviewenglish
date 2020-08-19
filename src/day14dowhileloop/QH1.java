package day14dowhileloop;

import java.util.Scanner;

public class QH1 {

	public static void main(String[] args) {
		// Get a String from the user and print the screen 
		// by replacing the first letter and last letter of this String.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a String");
		String str = scan.next();
		char first = str.charAt(0);
		char last = str.charAt(str.length()-1);
		System.out.println(last + str.substring(1, str.length()-1) + first);
		scan.close();

	}

}
