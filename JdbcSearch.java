package jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		
		try {
			try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			PreparedStatement ps=con.prepareStatement("select *from emp3 where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			Emp e=new Emp();
			while(rs.next())
			{
				e.setName(rs.getString("name"));
				e.setLocation(rs.getString("location"));
				e.setSalary(rs.getDouble("salary"));
			}
			System.out.println(e);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

}
}
