package basic_program_two;

public class Triangle {
	float length =10;
	float bredth =20;
	float height =15;
	void areaOfTringle()
	
	{
		float area=1/2*bredth*height;
		System.out.println(area);
		}
	void parameterOfTriangle()
	{
		float parameter =length*bredth*height;
		System.out.println(parameter);
	}
	public static void main(String args[])
	{
		Triangle t= new Triangle();
		t.areaOfTringle();
		t.parameterOfTriangle();
		
		
				
	}
}
