package day15methodcreation;

import java.util.Scanner;

public class MethotCreation03 {

	public static void main(String[] args) {
		// Let's make a simple calculator.
		
		// let the user do the action and select it with the process symbol.
		// Let's ask the user to enter two numbers
		// print the correct result according to the two numbers entered and the operation selected.
		Scanner scan = new Scanner(System.in);
		System.out.println("\"+, -, X,: select one of the operations\"");
		char symbol = scan.next().charAt(0);
		System.out.println("Please enter the firts integer");
		int num1 = scan.nextInt();
		System.out.println("please enter the second integer");
		int num2 =scan.nextInt();
		process(symbol,num1,num2);
		scan.close();
	}
	
	public static void process(char symbol, int num1, int num2) {
		switch (symbol) {
		case '+':
			System.out.println(num1 + num2);
			break;
		case '-':
			System.out.println(num1 - num2);
			break;
		case 'X':
			System.out.println(num1 * num2);
			break;
		case ':':
			System.out.println(num1 / num2);
			break;	
		default:
			System.out.println("You entered the wrong process");
		}
	}

}
