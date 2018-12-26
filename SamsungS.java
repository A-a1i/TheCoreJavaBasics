package InheritancePrograms;

class Mobile 
{
void calling()
{
System.out.println("call");	
}
void sms()
{
	System.out.println("sms from mobile");	
}
}

public class SamsungS extends Mobile
{
	public void sms()
	{
		
		System.out.println("sms");
		super.sms();
	}
	void internet()
	{
		System.out.println("2g");	
	}
	
	public static void main(String args[])
	{
		SamsungS s=new SamsungS();
		s.sms();
		s.calling();
		s.internet();
		
	}
	
}
