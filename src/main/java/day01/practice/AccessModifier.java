package day01.practice;


public class AccessModifier {
	private  String a = "a";
	private static String b = "b";
	private static String c = "c";
	private static String d = "d";
	
	private String getA() {
		return a;
	}
	
	public static void main(String[] args) {
		
		AccessModifier aakash = new AccessModifier();
		
		System.out.println(aakash.getA());
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);		
	}

	

	
}
