package day06ifstatement;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
		// create an int variable assign value
		// if it is even number, print even number on screen
		// If the value is an odd number, print an odd number on the screen.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter an integer");
		int num = scan.nextInt();
		
		if(num %2 ==0) {
			System.out.println("even number");	
		}
		if(num %2 !=0) {
			System.out.println("odd number");
		}
		scan.close();
	}

}
