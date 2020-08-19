package day16overloading;

import java.util.Scanner;

public class HQ2 {

	public static void main(String[] args) {
		// Get the name and surname from the user. Write the program that prints the first letters of the user's name and surname 
		// as capital letters and the other letters as small letters on the screen.
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = scan.next();
		System.out.println("Please enter your surname");
		String surname = scan.next();
		System.out.println("Please enter your name2");
		String name2 = scan.next().toLowerCase();
		System.out.println("Please enter your surname2");
		String surname2 = scan.next().toLowerCase();
		name(name, surname);
		name2(name2, surname2);
		scan.close();
	}
	public static void name(String name,String surname) {
		name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		surname = surname.substring(0, 1).toUpperCase() + surname.substring(1).toLowerCase();
		System.out.println(name + " " + surname);
	}
	public static void name2(String name2,String surname2) {
		name2 = name2.substring(0, 1).toUpperCase() + name2.substring(1);
		surname2 = surname2.substring(0, 1).toUpperCase() + surname2.substring(1);
		System.out.println(name2 + " " + surname2);
	}
}
