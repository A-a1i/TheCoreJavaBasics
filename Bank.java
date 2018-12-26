package InheritancePrograms;

class RBI {
	void interest()
	{
		System.out.println("6 percent");
	}
}
	 
class ICICI extends RBI
	 
	 {
		 void interest()
		 {
		 System.out.println("6 percent");	
	 }
		 void accountnumber()
		 {
			 System.out.println("15151");	
		 }
	 }
class PNB extends RBI

{
	 void interest()
	 {
	 System.out.println("6 percent");	
}
	 void accountnumberz()
	 {
		 System.out.println("151512");	
	 }
}

public class Bank extends RBI
{
void interest()	
{
	System.out.println("6 percent");	
}


public static void main(String args[])
{
	Bank b = new Bank();
	b.interest();
	ICICI i=new ICICI();
	i.accountnumber();
	PNB p=new PNB();
	p.accountnumberz();
}
}


