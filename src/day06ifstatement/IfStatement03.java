package day06ifstatement;

public class IfStatement03 {

	public static void main(String[] args) {
		// create a Char variable and assign a capital letter value.
		// if the assigned value is the initial of any of the days of the week
		// print those days
		// if not "there is no  day"
		
		char letter = 'X';
		
		if (letter == 'S') {
			System.out.println("Sunday and Saturday");
		}
		if (letter == 'M') {
			System.out.println("Monday");
		}

		if (letter == 'T') {
			System.out.println("Teusday and Thursday");
		}
		if (letter =='W') {
			System.out.println("Wednesday");
			
		}
		if (letter =='F') {
			System.out.println("Friday");
		}
		if (letter != 'S' && letter != 'M' && letter != 'T' && letter != 'W' && letter != 'F' ) {
		System.out.println("there is no  day");
		}
	}

}
