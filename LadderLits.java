package basic_program;

import java.util.Scanner;

public class LadderLits {
	public static void main (String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Percent");
		
		
		{
	
		
		double percent =sc.nextDouble();
		if(percent<35)
		{
			System.out.println("Failed");
		}
		else if(percent>=35 && percent < 55)
		{
			System.out.println("pass calss");
		}
		else if(percent>=55  && percent <60)
		{
			System.out.println("Second calss");
		}
		else if (percent>=60 && percent<75)
		{
			System.out.println("First class");
		}
		else
		{
			System.out.println("distinction");
		}
	}
	}
}



