package basic_program_two;

public class CircleArea {
	float pi=3.14f,area;
	int r =5;
	public float areaC()
	{
		area =pi*r*r;
		return area;
	}
	public static void main(String args[])
	{
		CircleArea c=new CircleArea();
		float area =c.areaC();
		System.out.println(area);
		System.out.println(c.areaC());
				
		
	}
	
	
	
	

}
