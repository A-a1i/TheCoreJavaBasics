package stringhandling;

public class VowelsString {
	public static void main(String args[])
	{
		String s="coder tech";
		char a[]={'a','e','i','o','u'};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<s.length()-1;j++)
			{
				if(a[i]==s.charAt(j))
				{
					System.out.print(a[i]);
					break;
				}
			}
		}
	}

}
