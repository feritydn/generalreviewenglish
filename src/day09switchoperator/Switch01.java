package day09switchoperator;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// The program that writes "First letter" when you find the letter "A", 
		// "second letter" when you find the letter B,
		// "Third letter" when you find the letter C, "Fourth letter" when you find the letter D
		// write using else if () and switch ()
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a letter");
		char letter = scan.next().toUpperCase().charAt(0);
		
		switch (letter) {
		case 'A' :
			System.out.println("First Letter");
			break;
		case 'B' :
			System.out.println("Second Letter");
			break;
		case 'C' :
			System.out.println("Third Letter");
			break;
		case 'D' :
			System.out.println("Forth Letter");
			break;
			
			default :
				System.out.println("you entered wrong character");
		}
		scan.close();	

	}

}
