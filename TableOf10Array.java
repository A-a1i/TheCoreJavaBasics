package arrayprograms;
import java.util.Scanner;

public class TableOf10Array {
	public static void main(String args[])
	{
		int a,c;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		a=sc.nextInt();
		for(int i=0;i<10;i++)
		{
			c=a*i;
			System.out.println(+a+"x"+i+ "=" +c);
		}
	}

}
