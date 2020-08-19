package day03operators;

public class Operators {

	public static void main(String[] args) {
		// First of all, parentheses
		// After brackets multiply and divide. Works from left to right
		// The last addition and subtraction is done. Works from left to right
		
		int i1 = 12;
		int i2 = 13;
		int i3 = 14;
		int i4 = 15;
		System.out.println(i1 + i2*i3);
		System.out.println(i1*i2 +i3*i4);
		System.out.println((i1+i2)/i4);
		System.out.println(i4 * (i2+i1/3));

	}

}
