package day11.solved;

import java.sql.*;

public class MySqlConnection {
public static void main(String[] args) throws SQLException {
	String url =  "jdbc:mysql://localhost:3306/fssa";
	String userName = "root";
	String password = "123456";
	String query = "SELECT * FROM users";
	Connection con = DriverManager.getConnection(url,userName,password);
	
	Statement statement = con.createStatement();
	ResultSet resultSet = statement.executeQuery(query);
	
	while(resultSet.next()) {
		System.out.println("Id: "+resultSet.getInt(1));
		System.out.println("Name: "+resultSet.getString(2));
		System.out.println("EmailId: "+resultSet.getString(4));
		
	}
	con.close();
}
}
