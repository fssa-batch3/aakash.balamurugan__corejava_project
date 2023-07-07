package day02.practice;

public  class Logger {
	public static void debug (String msg) {//writng the method for debug with string as an params
		System.out.println("DEBUG: " + msg);
	}
	public static void info (String msg) {//writng the method for info with string as an params
		System.out.println("info: " + msg);
	}
	
	public static void error (String msg) {//writng the method for error with string as an params

		System.out.println("error: " + msg);
	}
	
	public static void debug (int num) {//writng the method for debug with int as an params
		System.out.println("DEBUG: " + num);
	}
	
	
	public static void info (int num) {//writng the method for info with int as an params
		System.out.println("info: " + num);
	}
	
	public static void error (int num) {//writng the method for error with int as an params
		System.out.println("error: " + num);
	}
	
	// Similarly write overloaded methods for error and info.
	
	public static void main(String[] args) {
		Logger obj = new Logger();// creating the instance of the class Logger
		//calling the object method with string as the argums
		obj.debug("string");
		obj.error("string");
		obj.info("String");
		//calling the object method with int as the argums
		obj.debug(12);
		obj.error(34);
		obj.info(56);
	}
}