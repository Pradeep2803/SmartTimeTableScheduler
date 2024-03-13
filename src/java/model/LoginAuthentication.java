package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DBConnector;
import dto.LoginDto;

public class LoginAuthentication {

	
	public boolean  authenticate(LoginDto l)
	{
		String email = l.getEmail();
		String password = l.getPassword();
		
		Connection con = null ; 
		con = DBConnector.getConnection();
		String query = "SELECT password FROM user WHERE email='"+email+"' ";
		try 
		{
			Statement st = DBConnector.getStatement();
			ResultSet rs =st.executeQuery(query);
			if(rs.next())
			{
				
				
				return true ;
			}
			
			else
			{
				return false;
			}
		}
		catch(SQLException e)
		
		{
			System.out.println(e);
		}
		
		
		
		
		return false ;
	}
	
}
