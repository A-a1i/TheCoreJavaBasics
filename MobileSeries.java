package InheritancePrograms;

/*multilevel_inheritance*/

class Models {
	void calling()
	{
	System.out.println("calling");	
	}
	void sms()
	{
		System.out.println("call");	
	}
	}

class s9 extends Models
{
void calling()
{
	System.out.println("calling");	
}
void sms()
{
	System.out.println("internet");		
}
}
public class MobileSeries extends s9
{
	public void sms()
	{
		System.out.println("sms");
	}
	void internet()
	{
		System.out.println("2g");		
}

public static void main(String args[])
{
	MobileSeries s=new MobileSeries ();
	 s=new MobileSeries();
	    s.calling();
		s.sms();
		s.internet();
	 
	
}
}
