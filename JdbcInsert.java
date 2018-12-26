package jdbcprograms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class JdbcInsert {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name");
    String name=sc.next();
	System.out.println("enter location");
	String location=sc.next();
	System.out.println("enter salary");
	int salary=sc.nextInt();
	try {
		Class.forName("com.mysql.jdbc.Driver");
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","root");
			PreparedStatement ps=con.prepareStatement("insert into emp3(name,location,salary)values(?,?,?)");
			ps.setString(1, name);
			ps.setString(2,location);
			ps.setInt(3, salary);
			int i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("updated");
			}
			else
			{
				System.out.println("not update");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
