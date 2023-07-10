package day19.practic;

import java.util.regex.Pattern;

	public class User {
		int id;
		String name;
		String password;
		String email;

		public int getId() {

			return id;
		}

		public void setId(int id) throws IllegalArgumentException {
			if (id < 0) {
				throw new IllegalArgumentException("Invalid id");
			} else {
				this.id = id;
			}
		}

		public String getName() {
			return name;
		}

		public void setName(String line) {
			String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,}$";

			Boolean isMatch = Pattern.matches(regex, line);
			if (isMatch) {
				this.name = line;
			} else {
				throw new IllegalArgumentException("The name must have only alphabets atleast of 8 charaters");
			}

		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,}$";
			Boolean isMatch = Pattern.matches(regex, password);
			if (isMatch) {
				this.password = password;
			} else {
				throw new IllegalArgumentException(
						"enter valid password contains atleast one uppercase , one lowercase , numbers and one special charater.");
			}

		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

			Boolean isMatch = Pattern.matches(regex, email);
			if (isMatch) {
				this.name = email;
			} else {
				throw new IllegalArgumentException("eneter valid email");
			}
		}

	}

