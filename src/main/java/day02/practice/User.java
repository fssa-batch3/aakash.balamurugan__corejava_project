package day02.practice;

public class User {
private int id;
private String name;
private String password;
private String emailId;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public static void main(String[] args) {
	User obj = new User();
	obj.setId(5);
	obj.setName("Aakash");
	obj.setPassword("Aakash#2");
	obj.setEmailId("aakash@gmail.com");
	
	System.out.println(obj.getEmailId());
	System.out.println(obj.getName());
	System.out.println(obj.getId());
	System.out.println(obj.getPassword());
}

}
