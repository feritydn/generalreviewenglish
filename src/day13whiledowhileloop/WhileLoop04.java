package day13whiledowhileloop;

import java.util.Scanner;

public class WhileLoop04 {

	public static void main(String[] args) {
		// Multiplication table for the number entered by the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int num1 = scan.nextInt();
		int num2 = 1;
		while (num2<11) {
			System.out.println(num1 +  " x " + num2 + " =: "+ (num1*num2));//25
			num2++;
		}
scan.close();
	}

}
