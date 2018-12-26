package exceptionhandlingprograms;

public class ArrayIndexDemo {
	public static void main(String[] args) {
		int a[]=new int [2];
		a[0]=10;
		a[1]=30;
		try{
		for(int i=0;i<=a.length;i++)
		{
			System.out.println(a[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		{
			System.out.println("remaing code");
		}
	}

}
