package Abstraction;

 abstract class Maruti {
	void color()
	{
		System.out.println("white");
	}
	abstract void break1();
	abstract void gear();
}
 abstract class Maruti890000 extends Maruti
  {
  void gender()
 	{
	 System.out.println("depends");
 	}
  }
public class AbstractDemo extends Maruti890000
	{
	public void break1()
	{
		System.out.println("break works");
	}
	public void gear()
	{
		System.out.println("ur bike is in 3rd gear");
	}
	
		public static void main(String args[])
		{
			AbstractDemo d = new AbstractDemo();
			//Maruti d = new AbstractDemo();
			d.break1();
			d.gear();
			d.color();
			d.gender();
		}
		}