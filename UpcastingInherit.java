package InheritancePrograms;

class parent 
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
public class UpcastingInherit extends parent
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
	parent p=new UpcastingInherit();
	p.call();
    //p.gotSMS(); 
}
}