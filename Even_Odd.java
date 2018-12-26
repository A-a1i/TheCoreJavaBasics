package basic_program;
import java.util.Scanner;

public class Even_Odd {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("enter number");
		number=sc.nextInt();
		if(number%2==0)
		{
			System.out.println("entered number is even");
		}
		else
		{
			System.out.println("entered number is odd");
		}
	}

}
