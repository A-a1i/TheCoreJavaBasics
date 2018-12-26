package stringhandling;

public class demoNew {
	public static void main(String args[])
	{
		String s1="coder";
		String s2=new String("Coder");
		s1.equals(s2);
		boolean a=s1.equals(s2);
		System.out.println(a);
		System.out.println(s1.equalsIgnoreCase(s2));
		int b=s1.length();
		System.out.println(b);  
		
	}
}

