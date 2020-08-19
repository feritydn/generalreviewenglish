package day03operators;

import java.util.Scanner;

public class Wapper03 {

	public static void main(String[] args) {
		
		// Let's get the name and surname from the user and print it on the screen
		// Let's print the address of the usernames Let screen (2nd street Bakirkoy Istanbul Turkey)
		// Let's get the age from the user and print it on the screen.
		// Users, "I live in Turkey. True / false"), let's ask the answer Let's print the screen
		// true or false
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter your name and surname");
		
		String name = scan.nextLine();
		
		System.out.println("Please anter your address");
		
		String address = scan.nextLine();
		
		System.out.println("Please enter your age");
		
		int age = scan.nextInt();
		
		System.out.println("I live in Turkey (True or False)");
		
		boolean trBl = scan.nextBoolean();
		
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Age: " + age);
		System.out.println("I live in Turkey: " + trBl);
		
		scan.close();

	}

}
