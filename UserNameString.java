package stringhandling;

import java.util.Scanner;

public class UserNameString {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mail");
		String s=sc.next();
		
		int j=s.indexOf('@');
		String s2=s.substring(0,j);
		System.out.println(s2);

}
}
