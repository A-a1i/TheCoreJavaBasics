package basic_programs;

import java.util.Scanner;

public class ReverseNmbr {
	public static void main(String args[])
	{
		int rev=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter no");
		int num = sc.nextInt();
		while(num>0)
		{
			rev=rev*10;
			rev=num%10+rev;
			num=num/10;
		}
		System.out.println(rev);
	}

}
