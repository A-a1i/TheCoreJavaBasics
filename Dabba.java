package interthreadcommunication;

public class Dabba 
{
	int dno;
	boolean order=false; 
	public synchronized void put(int dno)//Dosa master will put in dabba
	{
		if(order==true)//true status represents when dabba is get full 
		{
		try
		{
			wait();//wait call to release the lock
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		this.dno=dno;
		order=true;
		System.out.println("Put The dosa"+dno);
		notify();
	}
	 public synchronized void get()//supplier will get from dabba
	{
		if(order==false)//false status represents when there is no dosa to get
		{
		try
		{
			wait();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		System.out.println("Got The Dosa"+dno);
		order=false;
		
		notify();
	}

}
