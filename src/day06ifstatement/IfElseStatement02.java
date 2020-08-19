package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {

		// ask the user to enter an integer and this integer
		// write the absolute value on the screen.

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter an Integer");
		
		int num = scan.nextInt();
		
		if (num<0) {
			System.out.println(num*(-1));
		}else {
			System.out.println(num);
		}

		scan.close();
	}

}
