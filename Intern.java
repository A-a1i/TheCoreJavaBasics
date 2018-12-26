package stringhandling;

public class Intern {
public static void main(String args[])
{
	String s="hello";
	String s2=new String ("hello");
	//System.out.println(s==s2);
	String s1=s2.intern();
	System.out.println(s1==s);
	
		
	
}
}
