package interthreadcommunication;
public class DosaMaster implements Runnable {
	Dabba b;
	DosaMaster(Dabba b)
	{
		this.b=b;
		new Thread(this,"DosaMaker").start();
	}
	@Override
	public void run() {
		int dno=0;
		int i=0;
		while(i<20)
		{
			b.put(dno++);
			i++;
			
		}
	}

}
