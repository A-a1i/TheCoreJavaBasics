package ObjMarker;

public class ConstructorError {
	ConstructorError (int a)
	{
		System.out.println("1 par");
	}
	ConstructorError ()
	{
		System.out.println("");
	}
	public static void main (String args[])
	{
		ConstructorError d = new ConstructorError();
	}
}
