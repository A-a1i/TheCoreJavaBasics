package stringhandling;

import java.util.Scanner;

public class UserMail {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter mail");
		String s=sc.next();
		int i=s.lastIndexOf('.');
		int j=s.indexOf('g');
		String s2=s.substring(j,i);
		System.out.println(s2);
		/*System.out.println(s.indexOf('@'));
		
		String s2[]=s.split(" @ ");
		System.out.println(s.indexOf('@'));
		for(int i=0;i<s2.length-1;i++)
		{
			System.out.println(s.substring(0, '@'));
		}*/
}

}
