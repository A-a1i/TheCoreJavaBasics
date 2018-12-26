package basic_programs;

import java.util.Scanner;

public class PallindromeNo {
	public static void main(String args[])
	{
		int a,rev=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter no");
		int num = sc.nextInt();
		a=num;
		while(num>0)
		{
			rev=rev*10;
			rev=num%10+rev;
			num=num/10;
		}
		if(a==rev)
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}
	}

}
