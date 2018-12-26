package Abstraction;

 abstract class maruti 
{
		void color()
		{
			System.out.println("white");
		}
		abstract void break1();
		abstract void engine();
}
 abstract class altok10 extends maruti
 {
	 void cc()
	 {
		 System.out.println("1000cc");
	 }
 }

public class AbsDemo extends altok10
{
	public void break1()
	{
		System.out.println("active");

	}
	public void engine()
	{
		System.out.println("active too");
	}
	

public static void main(String args[])
{
	//
	AbsDemo m =new AbsDemo();
	m.color();
	m.engine();
	m.break1();
	m.cc();
}
}