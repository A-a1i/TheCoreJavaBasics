package ObjMarker;

public class Circle {
	float pi=3.14f,area;
	int r=5;
	public float areaC()
	{
		area=pi*r*r;
		return area;
	}
	public static void main(String args[])
	{
		Circle c = new Circle();
		float area=c.areaC();
		System.out.println(area);
		System.out.println(c.areaC());
		
		
	}
}
