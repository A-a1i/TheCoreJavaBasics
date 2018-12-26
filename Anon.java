package innerclass;

interface A
{
	void lunch();
}
interface B
{
	void talk();
}
public class Anon implements A
{
	public void lunch()
	{
		System.out.println("noon");
	}
	public static void main(String args[])
	{
		Anon a=new Anon();
		a.lunch();
		B b=new B()
				{
				
				public void talk()
				{
				System.out.println("less");	
				}
				};b.talk();
				
				
				
		
	}
	}

	

