package exceptionhandlingprograms;

public class ArithmaticDemo {
	public static void main(String[] args) {
		int a=10,b=0;
		try{
			
		int c =10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		//System.out.println(e);
		//e.printStackTrace();
		//System.out.println("not this");
		}
		
		System.out.println("Remaining Code");

	}

}
