package Assignment3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FindCustomer {

	public static void main(String[] args) {

		try 
		{
			String sql = "select * from customer where cid = ?";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rahilimcs", "root", "Rahil1234");
			
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, 101);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				System.out.println("Record Found");
			}
			else
			{
				System.out.println("No Record Found");
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
