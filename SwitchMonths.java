package basic_programs;

import java.util.Scanner;

public class SwitchMonths {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int ch,year;
		System.out.println("enter year");
		year=sc.nextInt();
		System.out.println("1: jan 2: feb 3: mar 4: apr 5: may 6: jun 7: jul 8: aug 9: sep 10: oct 11: nov 12: dec");
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			System.out.println("no. of days are 31");
		   break;
		
		case 4:case 6:case 9:case 11:
			System.out.println("no. of days are 30");
		   break;
		case 2:
		
			if(year%4==0)
		{
			System.out.println("29");
		}
		else
		{
			System.out.println("28");
		}
			break;
		}
		}
}
