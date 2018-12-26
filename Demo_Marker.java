package Abstraction;

public class Demo_Marker implements Cloneable
{
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Demo_Marker [id=" + id + ", name=" + name + "]";
	}
	public Demo_Marker (int id, String name)
	{
		super();
		this.id=id;
		this.name=name;
		
	}
	public static void main(String[]args) throws CloneNotSupportedException{
	Demo_Marker s= new Demo_Marker(1,"abc");
	System.out.println(s);
	Demo_Marker d1= (Demo_Marker) s.clone();
	System.out.println(d1);
	
}
}
