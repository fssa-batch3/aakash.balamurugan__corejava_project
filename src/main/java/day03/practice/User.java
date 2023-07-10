package day03.practice;

public class User {
	private String name;
	private String password;
	private String emailId;

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getEmailId() {
		return emailId;
	}

	User(String name, String password, String emailId) {
		this.name = name;
		this.password = password;
		this.emailId = emailId;
	}

	User() {
//		this.name = null;
//		this.password = null;
//		this.emailId = null;
	}
}
