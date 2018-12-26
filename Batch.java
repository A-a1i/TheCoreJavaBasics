package jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Batch {
	public static void main(String[] args) {
		try {
			try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			PreparedStatement ps=con.prepareStatement("update emp3 set salary=? where id=?");
			ps.setInt(1, 2000);
			ps.setInt(2, 3000);
			ps.addBatch();
			ps.setInt(1, 5000);
			ps.setInt(2, 6000);
			ps.addBatch();
			int count[]=ps.executeBatch();
			for (int i=0;i<count.length;i++)
			{
				System.out.println("query "+i+" has effected "+count[i]+" times");
			}
	}
			catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			
				
			} catch (SQLException e) {
				e.printStackTrace();
			}

	}
}
