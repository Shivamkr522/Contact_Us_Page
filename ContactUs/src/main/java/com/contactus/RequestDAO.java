package com.contactus;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RequestDAO {
    	public static final String DATABASE = "ContactUsDB";
	public static final String HOST_NAME = "localhost";
	public static final String HOST = "5432";
    	public static final String USER = "postgres";
    	public static final String PASSWORD = "postgres";
	public void saveRequest(Request request) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://"+HOST_NAME+":"+HOST+"/"+DATABASE,USER,PASSWORD);
			String query = "Insert Into contactus(fullname, emailid, message, status) values(?,?,?,?)";
			PreparedStatement prep = con.prepareStatement(query);
			prep.setString(1, request.getName());
			prep.setString(2, request.getEmail());
			prep.setString(3, request.getMessage());
			prep.setString(4, "active");
			prep.executeQuery();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Request> fetchData() {
		List<Request> requestAllUserData = new ArrayList<Request>();
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://"+HOST_NAME+":"+HOST+"/"+DATABASE,USER,PASSWORD);
			String query ="Select * from contactus";
			Statement statement =con.createStatement();
			ResultSet resultSet = statement.executeQuery(query);		
			while(rt.next()) {
				Request contain = new Request();
				int id=Integer.parseInt(resultSet.getString(1));
				contain.setId(id);
				contain.setName(resultSet.getString(2));
				contain.setEmail(resultSet.getString(3));
				contain.setMessage(resultSet.getString(4));
				contain.setTime(resultSet.getString(5));
				contain.setStatus(resultSet.getString(6));
				requestAllUserData.add(contain);
			}
			return requestAllUserData;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	public void changeStatus(Request requestData) throws ClassNotFoundException, SQLException {
        int id = requestData.getId();
        String status = requestData.getStatus();
            	if(status.equals("active")) {
            	status="archive";
            	}
       		else {
            		status="active";
        	}
        String sql ="update contactus set status='"+status+"' where id="+id+";";
        Class.forName("org.postgresql.Driver");
        Connection con= DriverManager.getConnection("jdbc:postgresql://"+HOST_NAME+":"+HOST+"/"+DATABASE,USER,PASSWORD);
        Statement statement=con.createStatement();
        statement.executeQuery(sql);
    }
}
