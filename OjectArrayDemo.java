package arrayprograms;

import java.util.Scanner;

public class OjectArrayDemo {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int id;
		String name;
		Emp e []=new Emp[5];
		for(int i=0;i<e.length;i++)
		{
			System.out.println("enter id");
			id=sc.nextInt();
			System.out.println("enter name");
			name=sc.next();
			e[i]=new Emp(id,name);
		}
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}
	}
}
