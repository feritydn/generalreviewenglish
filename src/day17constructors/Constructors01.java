package day17constructors;

public class Constructors01 {
	
	String name = "Ali Can";
	int age = 33;
	
	public static void main(String[] args) {
		growing(33);
		newName("hakan");
	}

	public static void newName(String newName) {
		System.out.println(newName);
		
	}

	public static void growing(int age) {
		age++;
		System.out.println(age);
		
		
	}

}
