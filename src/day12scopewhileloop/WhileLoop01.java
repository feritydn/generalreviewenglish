package day12scopewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		// // when num is less than 4
		while (num1<4) { 
			System.out.println("Ali Can");
			num1++; // If we forget this line, there will be endless cycle.
		}
		
		// Print integers from one to ten using the while loop.
		int num2 = 1;
		while (num2<11) {
			System.out.print(num2 + " ");
			num2++;
		}
		System.out.println();
		// even numbers from 1 to 20 using the while loop
		int num3 = 2;
		while (num3<21) {
			System.out.print(num3 + " ");
			num3 += 2;
		}
		System.out.println();
		// dividing with 3 from 5 to 120 using a while loop
		int num4 = 5;
		while (num4<121) {
			if (num4 %3 ==0) {
				System.out.print(num4 + " " );
			}
			num4++;
		}
	}

}
