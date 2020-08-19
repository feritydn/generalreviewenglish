package day10stringmethods;

import java.util.Scanner;

public class StringMethod03 {

	public static void main(String[] args) {
		// CharAt () method returns the character in a given index.
		String str1 = "cimbombom";
		// Write the code found in the charter in the 4th index of str 1.
		System.out.println(str1.charAt(4)); // o
		System.out.println(str1.charAt(0)); // c
		System.out.println(str1.charAt(6)); // b
		// NOTE: If we write a number larger than the index of the last letter of the given string, 
		// java returns exception. This is a very big mistake.

		 // Length () method returns how many characters the string contains.
		System.out.println(str1.length()); // 9
		// length is always larger than index because it starts counting from 1.
		// ask the user to enter his name then print the last letter of his/her name on the screen.
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter your name");
		String name = scan.nextLine();
		int lenght = name.length();
		System.out.println(name.charAt(lenght-1));
		scan.close();
	}

}
