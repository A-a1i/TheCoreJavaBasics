package jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcSelect {
public static void main(String[] args) {
	
		try {
			try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			PreparedStatement ps=con.prepareStatement("select *from emp3");
			ResultSet rs =ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("location"));
				System.out.println(rs.getDouble("salary"));
				
			}
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
}
}
