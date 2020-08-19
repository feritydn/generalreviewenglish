package day09switchoperator;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		// Take a mark from the user and print A, B, C or D on the screen according to the following rules.
		// 1st. less than 50 - D
		//2nd. 50 (inclusive) to 60 - C
		// 3. 60 (inclusive) to 80 - B.
		// 4. 80 (inclusive) above-A

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your mark");
		int mark = scan.nextInt();
		
		if (mark>=0 && mark<50) {
			mark =0;
		}else if (mark >=50 && mark<60) {
			mark =50;
		}else if (mark >=60 && mark <80) {
			mark =60;
		}else if (mark>=80 && mark<=100) {
			mark =80;
		}
		
		
		switch (mark) {
			case 0 :
				System.out.println("D");
			break;
			case 50 :
				System.out.println("C");
			break;
			case 60 :
				System.out.println("B");
			break;
			case 80 :
				System.out.println("A");
			break;
			default :
				System.out.println("you entered the wrong value");
		}
		scan.close();
	}

}
