package stringhandling;

public class RevesreString 
{
	public static void main(String args[])
	{
		String z="Coder Tech Vashi";
		String z2=z; 
		String z1[]=z.split(" ");
		String rev="";
		for(int i=z1.length-1;i>=0;i--)
		{
			rev=rev+z1[i]+" ";
		}
		System.out.println(rev);
		System.out.println(z);
		if(z2.equals(rev))
		{
			System.out.println("Pallindrome");
		}
			else
			{
				System.out.println("not Pallindrome");	
			}
			}
	
	}

	


