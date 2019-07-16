package Assignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginCreation {

	public static void main(String[] args) {
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rahilimcs", "root", "Rahil1234");
			Statement st = con.createStatement();
			int x = st.executeUpdate("insert into users values ('testuser2', 'testpassword2')");
			
			if(x!=0)
			{
				System.out.println("Insertion Successfull!!");
			}
			else
			{
				System.out.println("Insertion Failed");
			}
			
		}
		catch(SQLException sqle)
		{
			sqle.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
