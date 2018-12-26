package basic_programs;

import java.util.Scanner;

public interface PercentageLadder {
	public static void main(String args[])
	{

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter percent");
	double percent=sc.nextDouble();
	
		
		if (percent<35)
		{
			System.out.println("Failed");
		}
		else if(percent>=35 && percent<55)
		{
			System.out.println("pass");
		}
		else if(percent>=55 && percent<60)
		{
			System.out.println("2nd class");
		}
		else if(percent>=60 && percent<75)
		{
			System.out.println("1st class");
		}
		else
		{
			System.out.println("distnctn");
		}
	}
}

