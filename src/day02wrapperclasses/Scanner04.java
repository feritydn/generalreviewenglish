package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		/*
		 * Write a program that takes the dimensions of the rectangle from the user
		 *  and then calculates the area and the perimeter of the rectangle and prints it on the screen.
		 */

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter the width and length of the rectangle");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println(num1*num2);
		System.out.println((num1+num2)*2);
		
		scan.close();
	}

}
