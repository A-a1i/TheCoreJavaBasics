package ObjMarker;
import java.util.Scanner;
public class EvenOddConst {
	int limit;
	public EvenOddConst(int limit)
	{
		this.limit=limit;
	}
	void display()
	{
		if(limit%2==0)
		{
			System.out.println("Entered no. is Even");
		}
		else
		{
			System.out.println("Entered no. is Odd");
		}
	}
	public static void main(String args[])
	{
		Scanner p = new Scanner(System.in);
		System.out.println("Enter no");
		int limit = p.nextInt();
		EvenOddConst k = new EvenOddConst(limit);
		k.display();
	}
}
