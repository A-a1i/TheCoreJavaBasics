package basic_programs;

import java.util.Scanner;

public class LoginPage {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username");
		String un=sc.next();
		System.out.println("Enter password");
		int pwd=sc.nextInt();
		if(un.equals("ali") && (pwd==123))
		{
			System.out.println("successful login");
		}
		else
		{
		System.out.println("invalid username/password");	
		}
	}

}
