package exceptionhandlingprograms;

public class ClassCastDemo {
	public static void main(String[] args) {
		try{
		NullPointerException a=(NullPointerException)new Exception();
		}
		catch(ClassCastException e)
		{
			System.out.println(e);
		}
		System.out.println("Remaining code");
	}

}
