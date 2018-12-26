package basic_program;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	int ch,a,b;float c;
	System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.mod");
	System.out.println("enter your choice");
	ch=sc.nextInt();
	switch(ch)
	{
	case 1:System.out.println("enter a");
	a=sc.nextInt();
	System.out.println("Enter b");
	b=sc.nextInt();
	c=a+b;
	System.out.println(c);
	break;
	case 2:System.out.println("enter a,b");
	a=sc.nextInt();
	b=sc.nextInt();
	c=a-b;
	System.out.println(c);
	break;
	case 3:System.out.println("enter a,b");
	a=sc.nextInt();	
	b=sc.nextInt();
	c=a*b;
	System.out.println(c);
	break;
	case 4:System.out.println("enter a,b");
	a=sc.nextInt();
	b=sc.nextInt();
	c=a/b;
	System.out.println(c);
	break;
	case 5:System.out.println("enter a,b");
	a=sc.nextInt();
	b=sc.nextInt();
	c=a%b;
	System.out.println(c);
	break;
	default:System.out.println("you entered wrong no");
	}
	
	}

}
