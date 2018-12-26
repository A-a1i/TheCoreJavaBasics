package InheritancePrograms;

class head 
{
	int a=10;
	static void m1()
	{
		System.out.println("hello");
	}

}
class EgOverriding extends head
{
	int a=20;
	static void m1()
	{
		System.out.println("hi");
	}
	public static void main(String args[])
	{
		EgOverriding c=new EgOverriding();
		/*System.out.println(c.a);
		head p=new EgOverriding();
		System.out.println(p.a);*/
		/*only method get overrided not variable and also static method*/
		//.m1();
		
		EgOverriding.m1();
		head.m1();
	}
}
