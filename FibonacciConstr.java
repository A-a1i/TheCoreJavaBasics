package ObjMarker;
import java.util.Scanner;
public class FibonacciConstr {
	int a=0,b=1, c, lipd;
	public FibonacciConstr(int lipd)
	{
		this.lipd=lipd;
	}
	void display()
	{
		for(int i=0;i<=lipd;i++)
		{
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
				System.out.println("enter no");
				int lipd = sc.nextInt();
				FibonacciConstr k=new FibonacciConstr(lipd);
				k.display();
	}
}
