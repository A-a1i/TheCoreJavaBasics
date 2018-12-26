package exceptionhandlingprograms;

public class StringIndexDemo {
	public static void main(String[] args) {
		String a="Hello";
		try{
		for(int i=0;i<=a.length();i++)
		
		
		{
			System.out.println(a.charAt(i));
		}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("this is not valid");
			
		}
		System.out.println("remaining code");
	}

}
