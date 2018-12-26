package stringhandling;

public class IndexOfDemo {
	public static void main(String args[])
	{
		String z1= "hellohello";
		String z2= "hello";
		System.out.println(z1.indexOf('h'));
		System.out.println(z1.indexOf("lo"));
		System.out.println(z1.indexOf('h', 3));
		System.out.println(z1.indexOf("he", 2));		
		System.out.println(z1.lastIndexOf("l"));
		System.out.println(z1.lastIndexOf("lo", 7));
		System.out.println(z1.charAt(2));
		System.out.println(z1.replace("h", "H"));
		System.out.println(z1.replaceAll("h", "H"));
		
}

}
