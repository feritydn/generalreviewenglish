package day02wrapperclasses;

import java.util.Scanner;

public class Scanner05 {

	public static void main(String[] args) {
		// Write a program that calculates the perimeter and area of a circle whose radius is taken from the user. (use float)
		// note 1: pi =3,14159
		// note 2 : area = pi*radius*radius
		// note 3: perimeter = 2*pi*radius
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter the radius");
		
		float radius = scan.nextFloat(); 
		// data type should be the same after next
		float pi = 3.14159f;
		
		// 
		
		System.out.println(pi*radius*radius);
		System.out.println(2*pi*radius);
		
		scan.close();
		
		

	}

}
