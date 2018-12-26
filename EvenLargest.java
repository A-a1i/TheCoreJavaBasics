package arrayprograms;



public class EvenLargest {
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		int k=a[0];
		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
		 if(a[i]>k)
		 {
			 k=a[i];
		 }
		}
		System.out.println(k);
		if(k%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("not even");
		}
		
	}
}
