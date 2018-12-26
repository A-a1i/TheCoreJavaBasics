package InheritanceProg;

 class Moto {
	 void calling()
		{
			System.out.println("grand parent");
		}
		void sms()
		{
			System.out.println("SMS from parent");
		}
}
 class G4 extends Moto{
	 void internet()
	 {
		 System.out.println("4G");
	 }
	 void SMS()
	 {
		 System.out.println("SMS parent");
	 }
 }
public class MobileLevel extends G4
{
	public void SMS()
	{
		System.out.println("SMS call:child call");
	}
	void internet()
	{
		System.out.println("5G");
	}

public static void main(String args[])
	{
	MobileLevel s = new MobileLevel();
	s.sms();
	s.calling();
	s.internet();
	}
}
