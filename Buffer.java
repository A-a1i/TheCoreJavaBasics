package stringhandling;

public class Buffer {
	public static void main(String args[])
	{
		StringBuffer s= new StringBuffer("Coder Tech Vashi");
		System.out.print("length"+s.length());
		//System.out.print("Capacity:"+s.capacity());
		String str=new StringBuffer().append("Coder").append("Tech").toString();
		System.out.println("String Str:"+str);
		s.replace(0, 5, "sqad");
		System.out.println("after replacing :"+s);
		StringBuffer delstr=s.delete(s.indexOf("Vashi"),s.length());
		System.out.println("after deleting "+delstr);
		System.out.println("reverse"+s.reverse());
	}

}
