package jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcUpdate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		
		
		
		try {
			try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			PreparedStatement ps=con.prepareStatement("update emp3 set name=? where id=?");
			ps.setString(1,name);
			ps.setInt(2, id);
			int i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("success");
			}
			else
			{
				System.out.println("not update");
			}
			
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

}

	}

