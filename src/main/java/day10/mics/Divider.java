package day10.mics;

public class Divider {
	public static int divide(int a , int b) throws Exception{
		if(b==0) {
		throw new Exception("Please handled this exception for dividing by zero");
		}else {
			return a/b;
		}
	}
	
	public static void main(String[] args) {
		
		int a = 5;int b=0;
		try {
			Divider.divide(a, b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
