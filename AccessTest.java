package InheritancePrograms;

public class AccessTest
{
	void m1()
	{
		
		
		m2();
		m3();
		m4();
		System.out.println("asd");
	}
	static void m2()
	{
		m3();
		AccessTest q=new AccessTest();
		q.m4();
		System.out.println("qwerty");
		

	}
	void m4()
	{
		System.out.println("xyz");
	}
	static void m3()
	{
		System.out.println("pqr");
	}
	
}


