//Anonymous

package innerclass;

abstract class Animal 

{
	abstract void jump();
}
abstract class Person
{
	abstract void eat();
}
 
public class Anonymous extends Person
{
	public void eat()
	{
		System.out.println("All Person");
	}
	public static void main(String args[])
	{
		Anonymous p=new Anonymous();
		p.eat();
		Animal a=new Animal()
				{
			void jump()
			{
				System.out.println("hi");
			}
			
				};
				a.jump(); //Anonymous MAIN FUNCTION
		
	}
}