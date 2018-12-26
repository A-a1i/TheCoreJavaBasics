package stringhandling;

public class DemoEquals {
	public static void main(String args[])

	{
		char s[]={'c','o','d','e','r'};
		String s1="coder";
		String s2="coder";
		String s3=new String("coder");
		String s4=new String (s);
		System.out.println(s1 == s2);    //true
		System.out.println(s1 == s3);   //compares reference only //false
		System.out.println(s4 == s2);    //s4 is in heap //s2 is in slp
	}
}
