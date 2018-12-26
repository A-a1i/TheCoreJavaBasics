package ObjMarker;
import java.util.Scanner;
public class ConstAdd {
		int a,b,c;
		ConstAdd(int a, int b)
		{
		this.a=a;
		this.b=b;
		}
		void add()
		{
		c=a+b;
		System.out.println(c);
		}
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a");
			int a=sc.nextInt();
			System.out.println("enter b");
			int b=sc.nextInt();
			ConstAdd c = new ConstAdd(a,b);
			c.add();
		}
}
