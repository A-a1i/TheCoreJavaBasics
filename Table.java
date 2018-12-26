package multithreading;

public class Table {
	public  synchronized void printable(int a)
	{
		for(int i=1;i<10;i++)
		{
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				
			}
			System.out.println(i*a);
		}
	}
}
