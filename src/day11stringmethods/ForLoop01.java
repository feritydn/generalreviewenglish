package day11stringmethods;

public class ForLoop01 {

	public static void main(String[] args) {
		// Create a for loop that prints 6 5 4 3 2 1 0 -1 on the screen.
		for (int i=6; i>-2; i--) {
			System.out.print(i+ " ");
		}
		System.out.println();
		// Create a for loop that prints the numbers 3 4 5 6 7 on the screen.
		for (int i =3; i<8; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		// Create a program that prints the first hundred counts side by side 
		// on the screen and places a space between them
		for (int i =0; i<101; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		// Create a for loop that prints the first 50 even counts on the screen.
		for (int i=2; i<101; i +=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		// Create a for loop that prints the first 50 odd counts on the screen.
		for (int i =1; i<100; i+=2 ) {
			System.out.print(i + " ");
		}
	}

}
