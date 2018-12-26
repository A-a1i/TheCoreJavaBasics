package basic_programs;

public class OperatorDemo2 {
	public static void main(String args[])
	{
	int a=100, b=200, c,e,f,g,h;
	c=a++;
	e=--b;
	System.out.println(e++);
	f=e++;
	f--;
	System.out.println(g=++f);
	h=e++;
	h--;
	--a;
	c++;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
	System.out.println(h);
}
}
