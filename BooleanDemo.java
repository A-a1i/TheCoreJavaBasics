package basic_programs;

public class BooleanDemo {
	public static void main(String args[])
	{
		boolean sat=true;
		boolean ssat=true;
		boolean hsat=true;
		
		if(sat==true)
		{
			if(ssat==true)
			{
				if(hsat==true)
				{
					System.out.println("meeting is been arranged");
				}
				else
				{
					System.out.println("meeting has been canceled");
				}
			}
				else
				{
					System.out.println("due to second sat meeting has been posponed");
				}
		}
				else
				{
					System.out.println("meeting has been canceled due to holiday");
				}	
			}
}

