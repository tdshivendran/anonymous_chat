package com.scsu.anon.model;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.scsu.anon.dao.LoginDao;
import com.scsu.anon.utils.DbConnection;

public class LoginModel {
	DbConnection dbConnection = new DbConnection();
	public String uname;
	public String pwd;
	public String login(List<LoginDao> loginList){
		
		
		String password = loginList.get(0).getPassword();
		String username = loginList.get(0).getUsername();
		password=MD5(password);
		String query = "SELECT * FROM NewUser where email='"+username+"'";
		Connection con= dbConnection.createNewConnection();
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())
			{
				uname = rs.getString("email");
				pwd = rs.getString("password");
				if(uname.equalsIgnoreCase(username) && pwd.equalsIgnoreCase(password)){
					return "Success";
				}
				
			}
			
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		

		System.out.println("failure");
		return "Failure";
	}
	public String MD5(String password) {
		// TODO Auto-generated method stub
		
		
		
			         
	        String md5 = null;
	         
	        if(null == password) return null;
	         
	        try {
	             
	        //Create MessageDigest object for MD5
	        MessageDigest digest = MessageDigest.getInstance("SHA-1");
	         
	        //Update input string in message digest
	        digest.update(password.getBytes(), 0, password.length());
	 
	        //Converts message digest value in base 16 (hex) 
	        md5 = new BigInteger(1, digest.digest()).toString(16);
	 
	        } catch (NoSuchAlgorithmException e) {
	 
	            e.printStackTrace();
	        }
	       
		return md5;
	
	
		
	}

}
