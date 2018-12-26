package basic_program_two;

import java.util.Scanner;

public class FibonacciSeriesTwo 
{
	
	int a=0,b=1,c, qwerty;
	public FibonacciSeriesTwo(int qwerty)
	{
		this.qwerty=qwerty;
	}
	 void display()
	 {
		for(int i=0;i<=qwerty;i++)
			{
				c=a+b;
			    System.out.println(a);
			    a=b;
			    b=c;
	         }
	 }

	 public static void main(String args[])
	 {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter number");
	int qwerty =sc.nextInt();
	FibonacciSeriesTwo f = new FibonacciSeriesTwo(qwerty);
	f.display();	
}
}
