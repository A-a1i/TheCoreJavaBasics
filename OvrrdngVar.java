package InheritanceProg;

 class parent {
	 int a=10;
	static void m1()
	 {
		 System.out.println("hello");
	 }

}
 class OvrrdngVar extends parent
 {
	int a=20;
	static void m1()
	{
		System.out.println("hi");
	}
	 public static void main (String args[])
	 {
		OvrrdngVar c = new OvrrdngVar();
		 //System.out.println(c.a);
		// parent p =new OvrrdngVar();
		//System.out.println(p.a);
		//c.m1();
		OvrrdngVar.m1();
		parent.m1();
	 }
 }
