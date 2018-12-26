package basic_programs;

import java.util.Scanner;

public class NoOfNotes {
	public static void main(String args[])
	{
		int amt;int notes;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amt");
		amt=sc.nextInt();
		if(amt%100!=0)
		{
			System.out.println("invalid amt");
		
		}
		else
		{
			if (amt>=1000)
			{
				notes=amt/1000;
				amt=amt%1000;
				System.out.println("the no of 1000 notes is"+notes);
			}
			if (amt>=500)
			{
				notes=amt/500;
				amt=amt%500;
				System.out.println("the no of 500 notes is"+notes);
			}
			if (amt>=100)
			{
				notes=amt/100;
				System.out.println("the no of 100 notes is"+notes);
			}
		}
	}

}
