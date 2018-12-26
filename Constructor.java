package basic_program_two;  

/*overloading possible only in class*/

public class Constructor {
	{
		System.out.println("welcome");
	}
	Constructor()
	{
		this(10,10);
		System.out.println("zero");
	}
	Constructor(int a)
	{
		System.out.println("1para");
	}
	Constructor(int a,int b)
	{
		this(10);
		System.out.println("2 para");
	}
	Constructor(float b)
	{
		this ();
		System.out.println("float cons");
	}
	public static void main(String args[])
	{
		Constructor d3 =new Constructor(10.5f);
		/*Constructor d =new Constructor();
		Constructor d1 =new Constructor(10);
		Constructor d2 =new Constructor(10,10);
		Constructor d3 =new Constructor(10.5f);*/
	}
	

}
