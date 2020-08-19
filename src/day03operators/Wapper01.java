package day03operators;

import java.util.Scanner;

public class Wapper01 {

	public static void main(String[] args) {
		// Write a program that takes the name and surname from the user and prints it on the screen.
		// (use String)
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your name and surname");
		
		String name = scan.nextLine(); // To get a String we just use next() or nextLine()
									   //  nextLine() takes all the string entered in the next() for just one word.
									   //  the next method stops getting the string in the first space
		System.out.println(name);

		scan.close();
	}

}
