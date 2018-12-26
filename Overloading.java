package ObjMarker;

public class Overloading {
	{
		System.out.println("welcome");
	}
	static {
		System.out.println("Hola");
	}
	Overloading()
	{
		/*this(10);*/
		System.out.println("Hello");
	}
	Overloading(int a)
	{
		/*this(10,10);*/
		System.out.println("1 par");
	}
	Overloading(int a,int b)
	{
		/*this(10.5f);*/
		System.out.println("2 par");
	}
	Overloading(float b)
	{
		System.out.println("float ovld");
	}
	public static void main(String args[])
	{
	/*Overloading d= new Overloading();
	Overloading d1= new Overloading(10);
	Overloading d2= new Overloading(10,10);
	Overloading d3= new Overloading(10.5f);*/
	}
}
