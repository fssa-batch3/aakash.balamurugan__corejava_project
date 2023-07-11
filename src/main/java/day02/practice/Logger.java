package day02.practice;

public class Logger { // create a class
	
	
	// Example methods for method overloading
	public  void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	
	public void info (String msg) {
		System.out.println("INFO: " + msg);	
	}
	
	public  void error (String msg) {
		System.out.println("ERROR: " + msg);
	}
	
	public void debug (int num) {
		System.out.println("DEBUG INT: " + num);
	}
	
	public void info (int num) {
		System.out.println("INFO INT: " + num);
	}
	
	public void error (int num) {
		System.out.println("ERROR INT: " + num);
	}
	
	
	
	// Similarly write overloaded methods for error and info.
	
	public static void main(String[] args) { // main method starts
		
		Logger log = new Logger(); // create a new object 
		
		// call the method with parameter		s
		
		log.debug("Gokul");
		log.error("prasanna");
		log.info("Name Mismatch");
		log.debug(32);
		log.error(3);
		log.info(43);
		
	}
}