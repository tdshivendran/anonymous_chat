package com.scsu.anon.model;


import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.scsu.anon.dao.NewUserDao;
import com.scsu.anon.utils.DbConnection;


public class NewUserRegistrationModel {
	DbConnection dbConnection = new DbConnection();
	public String createNewUser(List<NewUserDao> newUserList){
		
		//System.out.println("Size: "+newUserList.size());
		/*String query = "insert into USER values('"+newUserList.get(0).getFirstName()+"','"+newUserList.get(0).getLastName()+"','"+newUserList.get(0).getEmail()+"','"+newUserList.get(0).getPassword()+"')";
		System.out.println("Query : "+query);
		Connection con= dbConnection.createNewConnection();
		try {
			Statement st = con.createStatement();
			int result = st.executeUpdate(query);
			if(result==1)
			return "Success";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		
		String password = newUserList.get(0).getPassword();
		password=MD5(password);
		String query = "INSERT INTO NewUser (FirstName,LastName,Email,Password) VALUES (?,?,?,?)";
		Connection con= dbConnection.createNewConnection();
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, newUserList.get(0).getFirstName());
			pstmt.setString(2, newUserList.get(0).getLastName());
			pstmt.setString(3, newUserList.get(0).getEmail());
			pstmt.setString(4, password);
			int result = pstmt.executeUpdate();
			if(result==1){
				return "Success";
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		

		
		return null;
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
