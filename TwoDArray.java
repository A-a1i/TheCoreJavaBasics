package arrayprograms;
import java.util.Scanner;

public class TwoDArray {
	public static void main(String args[])
	{
		
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter row");
		int row=sc.nextInt();
		System.out.println("enter col");
		int col=sc.nextInt();
		
		int a[] []=new int[row][col];
		System.out.println("enter array elements");
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
			System.out.print("  "+a[i][j]);	
			}
			
		System.out.println(" ");	
		}
	}

}
