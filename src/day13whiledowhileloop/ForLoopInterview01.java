package day13whiledowhileloop;

import java.util.Scanner;

public class ForLoopInterview01 {

	public static void main(String[] args) {
		// Get a String from the user and print this String in reverse on the screen.
		// Don't go to Interview without knowing this question
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence or word");
		String str = scan.nextLine();
		int lenght = str.length();
		
		for (int i=lenght-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
scan.close();
	}

}
