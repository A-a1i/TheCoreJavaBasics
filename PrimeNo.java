package basic_programs;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		int i;
	for(i=2; i<=num; i++)
	{
		if(num%i==0)
		{
			break;
		}
	}
	    if(num==i)
		{
			System.out.println("entered value is prime no.");
		}
		else
		{
			System.out.println("entered value is a not prime no.");
		}
	}

}
