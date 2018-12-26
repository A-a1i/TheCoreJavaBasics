package exceptionhandlingprograms;

public class CustomException {
	public static void main(String[] args) {
		
			int age=22;
			try
			{
				if(age>20)
				{
					throw new AgeException("valid");
				}
				else
				{
					System.out.println("not valid");
				}
			}
			catch(AgeException e)
			{
				System.out.println(e);
				e.printStackTrace();
				System.out.println("throws exception");
			}
		}
	}


