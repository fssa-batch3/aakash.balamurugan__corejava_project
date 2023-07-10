package betterMe;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.time.*;


public class EventValidator {
	public static boolean validate(Event Event)
			throws IllegalArgumentException {

		// check for nullity of the parameter
		if (Event == null) {
			throw new IllegalArgumentException("Argument is " + "NULL");
		}
		// Check for name, name should only have alphabets
		// For Simplicity, Check if name has length of 2.
//		validateName(student.name);
//		validateAge(student.age);
//		validateEmail(student.emailId);
//		validateRoll(student.roll);
		return true;
		}
	
	public static boolean validateEventName(String name)
			throws IllegalArgumentException {
		if (name == null || "".equals(name.trim()) || name.length() < 2) {
			throw new IllegalArgumentException(
					"EventName cannot " + "be empty or null");
		}
		return true;
	}
	
	public static boolean validateId(int Id) throws IllegalArgumentException {
		// Assuming its a College Student with age range of
		// 17 to 20
		if (Id >0) {
			return true;
		}
		throw new IllegalArgumentException("Id should not be negative.");

	}
	public static boolean validateDate(LocalDate date) throws IllegalArgumentException {
		// Assuming its a College Student with age range of
		// 17 to 20
		  LocalDate today = LocalDate.now();
		  int dateComparison = date.compareTo(today); 
		  
		   if (dateComparison > 0) {
	            System.out.println("The date is after today's date");
	            return true;
	        } else {
	        	throw new IllegalArgumentException("date should be in the futur.");
	        }
	
	}
}
