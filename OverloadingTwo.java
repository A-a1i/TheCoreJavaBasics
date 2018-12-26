package ObjMarker;

public class OverloadingTwo {
	OverloadingTwo()
	{
		this(10,10);
		System.out.println("Hello");
	}
	OverloadingTwo(int a)
	{
		
		System.out.println("1 par");
	}
	OverloadingTwo(int a,int b)
	{
		this(10);
		System.out.println("2 par");
	}
	OverloadingTwo(float b)
	{
		this();
		System.out.println("float ovld");
	}
	public static void main(String args[])
	{
	OverloadingTwo d= new OverloadingTwo(10.5f);
	/*Overloading d1= new Overloading(10);
	Overloading d2= new Overloading(10,10);
	Overloading d3= new Overloading(10.5f);*/
	}
}
