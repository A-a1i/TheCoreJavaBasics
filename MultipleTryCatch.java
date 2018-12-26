package exceptionhandlingprograms;

public class MultipleTryCatch {
	public static void main(String[] args) {
		int i,c;
		int a[]={10,20};
		try
		{
			for(i=0;i<a.length;i++)
			{
				c=a[i]/i;
			}}
			catch(ArrayIndexOutOfBoundsException b)
			{
				System.out.println(b.getMessage());
			}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("remaining code");
		}
		
		
	
	}


