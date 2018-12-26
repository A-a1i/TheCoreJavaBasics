package InheritancePrograms;

class GetSetDemo1
{
	
	private int id;
	private String name;
	private double salary;
	
	public int getID() 
	{
		return id;
	}
	public void setID(int id)
	{
		this.id=id;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
		
	
}
 public class GetSetDemo
{
	public static void main(String args[])
	{
		GetSetDemo1 d =new GetSetDemo1();
		
		d.setID(20);
		System.out.println(d.getID());
		
		d.setName("qwerty");
		System.out.println(d.getName());
		
		d.setSalary(30000);
		System.out.println(d.getSalary());
	}
}
