package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		// let the user give two integers, the program will print the sum and the product of these integers on the screen
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter two integers");
		int num1 = scan.nextInt();
		
		int num2 = scan.nextInt();
		
		System.out.println(num1*num2);
		System.out.println(num1+num2);
		scan.close();

	}

}
