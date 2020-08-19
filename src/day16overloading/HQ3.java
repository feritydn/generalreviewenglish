package day16overloading;

import java.util.Scanner;

public class HQ3 {

	public static void main(String[] args) {
		// Tell the user to choose one of the words parallelogram, rectangle and triangle, and two numbers. 
		// Whatever shape you choose, write the program that prints the area and perimeter of that shape on the screen.
		Scanner input = new Scanner (System.in);
		System.out.println("\"Enter one of the words parallelogram, rectangular and triangle\"");
		String shape = input.next();
		System.out.println("Please enter the first edge ");
		int num1 = input.nextInt();
		System.out.println("Please enter the second edge ");
		int num2 = input.nextInt();
		shape( shape, num1, num2);
		input.close();
	}

	public static void shape(String shape, int num1, int num2) {
		switch (shape) {
		case "parallelogram":
			System.out.println("parallelogram area: " +  (num1*num2) );
			System.out.println("parallelogram perimeter: " + (2*(num1+num2)));
			break;
		case "rectangular":
			System.out.println("rectangle area: " +  (num1*num2) );
			System.out.println("rectangle perimeter: " + (2*(num1+num2)));
			break;
		case "triangle":
			System.out.println("triangle area: " +  (num1*num2/2) );
			break;	
		default:
			System.out.println("\"You entered the wrong shape name\"");
		}
	}
}
