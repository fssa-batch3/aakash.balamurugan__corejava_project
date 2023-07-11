package day01.practice;

public class AccessModifier { // create  a public class
	 
	// Initialize Static string
	private static String a = "a";
	private static String b = "b";
	private static String c = "c";
	private static String d = "d";
	
	public static String getA() {
		return a;
	}
	public static String getB() {
		return b;
	}
	public static String getC() {
		return c;
	}
	public static String getD() {
		return d;
	}
	
	
	public static void main(String[] args) { // main method
		
		System.out.println(getA());
		System.out.println(getB());
		System.out.println(getC());
		System.out.println(getD());		
	}
}
