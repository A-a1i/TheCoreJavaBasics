package stringhandling;

public class AlphabeticalOrder {
	public static void main(String args[])
	{
		String name[]={"Prashant","Mayur","Tejas","Ali","Nandani","Prajakta","Ashlesha"};
		for(int  i=0;i<name.length;i++)
		{
			for(int j=i+1;j<name.length;j++)
			{
				if(name[i].compareToIgnoreCase(name[j])>0)
				{
					String temp=name[i];
					name[i]=name[j];
					name[j]=temp;
				}
			}
		}
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		
		
	}
}
