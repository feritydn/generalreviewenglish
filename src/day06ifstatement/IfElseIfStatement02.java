package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement02 {

	public static void main(String[] args) {
		// Ask the user to enter the exam mark as an integer
		//If it enters negative, print "You entered wrong value" on the screen
		//If it is greater than 0 and smaller than 50, print "left the lesson" on the screen
		//If it is greater than 50 and less than 80, print "past the lesson" on the screen.
		//If larger than 80 and smaller than 100, print "Congratulations" on the screen
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your mark");
		int mark = scan.nextInt();
		
		if (mark<0 || mark>100) {
			System.out.println("You entered wrong value");	
		}else if(mark>=0 && mark<50) {
			System.out.println("Left the lesson");
		}else if(mark>=50 && mark<80) {
			System.out.println("Past the lesson");
		}else {
			System.out.println("Congratulations");
		}
		scan.close();
	}

}
