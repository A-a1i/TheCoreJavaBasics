package basic_programs;

import java.util.Scanner;

public class LoginTest {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		String un=sc.next();
		
		if(un.equals("ali"))
		{
			System.out.println("Enter password");
			int pwd=sc.nextInt();
			if(pwd==123)
			{
			System.out.println("successful login");
			}
			else
			{
				System.out.println("password wrong");
			}
		}
		else
		{
		System.out.println("invalid username");	
		}
	}
}
