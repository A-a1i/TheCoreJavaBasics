package arrayprograms;

import java.util.Scanner;

public class AdditionOfMatrix {
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter row");
		int row=sc.nextInt();
		System.out.println("enter col");
		int col=sc.nextInt();
		
		int a[] []=new int[row][col];
		int b[] []=new int[row][col];
		int c[] []=new int[row][col];
		if(row==col)
		{
		System.out.println("array for a");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix is");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			System.out.print(""+a[i][j]);	
			}
		
		System.out.println(" ");	
		
		}
		
		System.out.println("array for b");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix is");
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			System.out.print(" "+b[i][j]);	
			}
			System.out.println(" ");
		}
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Addition is");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("  "+c[i][j]);
			}
			System.out.println("  ");
		}
		
		
		
	}
	
		else
		{
			System.out.println("addtion not possible");
		}
	}

}
