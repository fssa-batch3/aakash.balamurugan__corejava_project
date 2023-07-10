package day03.practice;

public class TestUser {
public static void main(String[] args) {
	User u1 = new User("aakash","1234asd#","Aakash@gmail.com");
	User u2 = new User();
	
	
	  System.out.println("name="+u1.getName()+", email="+u1.getEmailId()+", password="+u1.getPassword());
	  System.out.println("name="+u2.getName()+", email="+u2.getEmailId()+", password="+u2.getPassword());

}
}
