package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		// Get the width and length of a rectangle from the user
		// if the width and height are equal, print this square on the screen
		// Print this is a rectangle if it is not equal.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("please enter the length of the rectangle");
		int lenght = scan.nextInt();
		System.out.println("please enter the width of the rectangle");
		int width = scan.nextInt();
		
		if (lenght == width) {
			System.out.println("Square");
		}
		if (lenght != width) {
			System.out.println("rectangle");
		}
		scan.close();
	}

}
