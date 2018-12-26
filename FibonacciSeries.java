package basic_programs;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String args [])
	{
		int a=0,b=1,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int value = sc.nextInt();
		for(int i=0;i<=value;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}

}
