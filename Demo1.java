package InheritanceProg;

public class Demo1 {
	void m1()
	{
		m3();
		m4();
		System.out.println("dp");
	}
	static void m2()
	{
		m3();
		Demo1 d = new Demo1();
		d.m4();
		System.out.println("di");
	}
	void m4()
	{
		System.out.println("dc");
	}
		static void m3()
		{
			System.out.println("kj");
		}
public static void main(String args[])
	{
	
	}
}