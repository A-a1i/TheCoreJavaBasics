package InheritanceProg;

class Mobile {
	void calling()
	{
		System.out.println("calling");
	}
	void sms()
	{
		System.out.println("SMS from parent");
	}
}
	public class Samsung extends Mobile
	{
		public void sms()
		{
			super.sms();
			System.out.println("SMS on");
		}
		void internet()
		{
			System.out.println("2G");
		}
		public static void main(String args[])
		{
		  Samsung s=new Samsung();
			s.sms();
			s.calling();
			s.internet();
	}

}
