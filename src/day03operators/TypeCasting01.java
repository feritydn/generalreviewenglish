package day03operators;

public class TypeCasting01 {

	public static void main(String[] args) {
		// There is no need to write an extra code to convert the small data type to the large data type. 
		// java does this automatically (Auto widening)
		
		byte by1 = 101;
		int num1 = by1;
		
		System.out.println(num1);
		
		// Changing the big data type to small data type is not done by java
		// As in the example, we should write the data type that we want to convert
		// to the right side in parentheses.
		
		int num2 = 53;            
		byte by2 = (byte)num2;    
		System.out.println(by2);   

		double num3 = 23.9;
		int by3 = (int) num3;
		System.out.println(by3);
		
		float num4 = -23.9F;
		short by4 = (short) num4;
		System.out.println(by4);
		
		double num5 = 4.8;
		double num6 = 1.4;
		double result1 = num5/num6;
		System.out.println(result1);
		
		int result2 = (int) (num5/num6);
		System.out.println(result2);
		
		int num7 = 5;
		int num8 = 3;
		
		int result3 = num7/num8;
		System.out.println(result3);  // normally the result is 1.6666666 but when the data type is int, only the integer is displayed.
		
		
		
		int num9 = 255;
		byte by5 = (byte) num9;  // why result -1
		System.out.println(by5);  //   

		
		
		
	}

}
