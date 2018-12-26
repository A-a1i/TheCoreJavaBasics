package basic_program;
import java.util.Scanner;

public class Reverse {
	public static void main(String args[])
	{
		int rev=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number");
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
