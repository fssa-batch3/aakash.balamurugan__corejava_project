package day19.practic;
//import java.util.regex.Pattern;
import java.util.*;

public class UserValid {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		User valid = new User();

		try {
			System.out.println("enter id");
			String id = s.nextLine();
			valid.setId(Integer.parseInt(id));
		

			System.out.println("Enter Name:");
			String name = s.nextLine();
			valid.setName(name);
		

			System.out.println("Enter password:");
			String password = s.nextLine();
			valid.setPassword(password);
		

			System.out.println("Enter email:");
			String email = s.nextLine();
			valid.setEmail(email);
			
			System.out.println(valid.getId());
			System.out.println(valid.getName());
			System.out.println(valid.getPassword());
			System.out.println(valid.getEmail());

		} catch (IllegalArgumentException e) {

			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		s.close();

	}
}

