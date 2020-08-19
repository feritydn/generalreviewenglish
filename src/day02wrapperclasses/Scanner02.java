package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		// Let the user enter an edge length of the square, and we will print the perimeter and area of the square on the screen.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter an edge length of the square.");
		
		int lenght = scan.nextInt();
		
		System.out.println(lenght+lenght+lenght+lenght);
		System.out.println(lenght*lenght);
		 scan.close();
		

	}

}
