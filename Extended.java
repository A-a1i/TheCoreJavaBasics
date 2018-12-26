package Abstraction;
interface A
{
	void m1();
}
interface B extends A
{
	void m2(); 	
}


public class Extended implements B {
	public void m1()
	{
		System.out.println("method 1");
	}
	
	public void m2()
	{
		System.out.println("method 2");
	}
	
	public void m3()
	{
		System.out.println("method 3");
	}
	public static void main(String args[])
	{
		Extended e=new Extended(); // can call all three as it belong to extended class
		e.m1();
		e.m2();
		e.m3();
		
		B a=new Extended ();
		a.m1();
		a.m2();
		//a.m3(); //can't be called as it is unique 
		
		//A a=new Extended (); CANT USE B AS IT IS A CHILD
		//a.m1(); it can be called
		//a.m2(); it can't be called as it belong to child
		
	}
	

}
