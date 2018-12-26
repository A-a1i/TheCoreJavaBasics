package basic_programs;
import java.util.Scanner;

public class ArmstrongNo {
	public static void main(String args[])
	{
		int rev=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter no");
		int num = sc.nextInt();
		int ans=0;
		int a= num;
		while(num>0)
		{
			rev=num%10;
			ans=rev*rev*rev+ans;
			num=num/10;
		}
		if(ans==a)
		{
			System.out.println("arm strng");
		}
		else
		{
			System.out.println("not arm strng");
		}
	}
	
}
