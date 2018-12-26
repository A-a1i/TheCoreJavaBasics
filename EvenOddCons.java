package basic_program_two;

import java.util.Scanner;

public class EvenOddCons
{
	int limit;
	public EvenOddCons(int limit)
	
	{
		this.limit=limit;	
	}
	void display()
	{
		if(limit%2==0)
		{
			
				
				System.out.println("entered number is even");
			}
			else
			{
				System.out.println("entered number is odd");
		}
	}
		public static void main(String args[])
		{
			Scanner p =new Scanner(System.in);
			System.out.println("Enter no");
			int limit = p.nextInt();
			EvenOddCons f = new EvenOddCons(limit);
			f.display();		
		}
}
	