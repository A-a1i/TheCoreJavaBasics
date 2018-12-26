package stringhandling;

public class SplitDemo 
{
	public static void main(String args[])
	{
		String z1="Coder Tech vashi";
		String z[]=z1.split(" "); //returns String Array
		
		for(int i=0;i<z.length;i++)
		{
			System.out.println(z[i]);
		}
	}

}
