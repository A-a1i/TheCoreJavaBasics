package stringhandling;

public class Conversion {
	public static void main(String args[])
	{
		String s="i got 2 star in 7 sem of 3 semester";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='0')
			{
				System.out.print("zero");
			}
			else if(s.charAt(i)=='1')
			{
				System.out.print("one");
			}
			else if(s.charAt(i)=='2')
			{
				System.out.print("two");
			}
			else if(s.charAt(i)=='3')
			{
				System.out.print("third");
			}
			else if(s.charAt(i)=='4')
			{
				System.out.print("four");
			}
			else if(s.charAt(i)=='5')
			{
				System.out.print("five");
			}
			else if(s.charAt(i)=='6')
			{
				System.out.print("six");
			}
			else if(s.charAt(i)=='1')
			{
				System.out.print("one");
			}
			else if(s.charAt(i)=='7')
			{
				System.out.print("seventh");
			}
			else if(s.charAt(i)=='8')
			{
				System.out.print("eight");
			}
			else if(s.charAt(i)=='9')
			{
				System.out.print("nine");
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
		
	}
	

}
