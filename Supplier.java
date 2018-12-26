package interthreadcommunication;

public class Supplier  implements Runnable
{
	Dabba b;
	Supplier (Dabba b)
	{
		this.b=b;
		 new Thread(this,"SupplierMaster").start();
	}
@Override
	public void run() {
	int i=0;
		while(i<20)
		{
			b.get();
			i++;
		}
	}
	}
		
		



