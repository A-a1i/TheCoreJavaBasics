package exceptionhandlingprograms;

public class NullPointer {
	public static void main(String[] args) {
		String a=null;
		/*System.out.println(a.length());
		System.out.println("remaining code");*/
		try
		{
			System.out.println(a.length());
		}
		catch(Exception e)
		{
			System.out.println("the string has no value");
			e.printStackTrace();
		}
		System.out.println("remaing code");
	}

}
