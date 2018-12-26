package basic_programs;

public class SwapWithTwo {
	public static void main(String args[])
	{
		int a=10;
		int b=20;
		
		System.out.println("before swapping");
		System.out.println("value of num1 is"+ a);
		System.out.println("value of num2 is"+b);
		
		a=a+b;
		b=b-a;
		a=a-b;
		System.out.println("after swapping");
		System.out.println("value of num1 is"+ a);
		System.out.println("value of num2 is"+b);
	}
}
