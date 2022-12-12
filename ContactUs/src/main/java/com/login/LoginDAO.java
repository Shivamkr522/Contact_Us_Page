package com.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
	public static final String DATABASE = "ContactUsDB";
    public static final String HOST_NAME = "localhost";
    public static final String HOST = "5432";
    public static final String USER = "postgres";
    public static final String PASSWORD = "postgres";
    
    public boolean isValidUser(Login usercheck) {
    	try {
    		Class.forName("org.postgresql.Driver");
    		Connection con = DriverManager.getConnection("jdbc:postgresql://"+HOST_NAME+":"+HOST+"/"+DATABASE,USER,PASSWORD);
    		String query = "Select uname,upass from admintable where uname = ? and upass = ?";
    		PreparedStatement prep = con.prepareStatement(query);
    		prep.setString(1, usercheck.getUname());
    		prep.setString(2, usercheck.getUpass());
    		ResultSet rt = prep.executeQuery();
    		while(rt.next()) {
    			if(rt.getString(1)!=null&&rt.getString(2)!=null) {
    				return true;
    			}
    			else
    				break;
    		}
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	return false;
    }
}
