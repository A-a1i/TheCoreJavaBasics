package InheritancePrograms;

class parenta
{
void call()
{
System.out.println("parents call");	
}
void sms()
{
	System.out.println("parents sms");	
}
}
public class DownCasting extends parenta
{
public void gotCALL()
{
	System.out.println("CALL");		
}
public void gotSMS()
{
	System.out.println("SMS");		
}



public static void main(String args[])
{
	parenta p=new DownCasting();
	DownCasting d=(DownCasting) p;
	d.gotCALL();
	d.gotSMS();
	d.call();
	/*DownCasting d=(DownCasting) new parenta();/*DownCasting done */
	
}
}