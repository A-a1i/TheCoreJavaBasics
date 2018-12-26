package exceptionhandlingprograms;

public class NumberFormatDemo {
	public static void main(String[] args) {
		try{
		Integer i=new Integer("abc");
		System.out.println(i);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		System.out.println("remaining code");
	}

}
