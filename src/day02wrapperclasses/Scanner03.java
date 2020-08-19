package day02wrapperclasses;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		// write a program that calculates the cup of a number received from the user
		// cup of a = a*a*a
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number");
		
		int num = scan.nextInt();
		
		System.out.println(num*num*num);
		
		scan.close();

	}

}
