package arrayprograms;

public class BubbleSort {
	public static void main(String args[])
	{
		int i,j;
		int a[]={30,15,60,40,10};
		System.out.println(a.length);
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
				int temp =a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		
		}
	System.out.println("Sorted array");
	{
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	}
	}

