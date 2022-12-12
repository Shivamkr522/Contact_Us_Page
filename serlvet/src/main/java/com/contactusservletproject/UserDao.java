package com.contactusservletproject;
import java.sql.*;
public class UserDao {
	String adminName,adminPassword;
	public void setUserDao(User user) throws ClassNotFoundException, SQLException {
		String url="jdbc:postgresql://localhost:5432/postgres";
		String username= "postgres";
		String password="postgres";
		Class.forName("org.postgresql.Driver");
		Connection con= DriverManager.getConnection(url,username,password);
		Statement statement=con.createStatement();
		ResultSet resultSet=statement.executeQuery("select username,password from users;");
		while(resultSet.next()) {
			adminName=resultSet.getString("username");
			adminPassword=resultSet.getString("password");
			}
	}
		boolean isValidUser(User adminuser) {
            return (adminName.equals(adminuser.getAdminname())) && (adminPassword.equals(adminuser.getPassword()));
		}
}
