package multithreading;

public class ImplementsDemo implements Runnable{
	public ImplementsDemo()
	{
		Thread t = new Thread(this);
		t.start();
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("my thread"+i);
		}
	}
	public static void main(String args[])
	{
		ImplementsDemo i = new ImplementsDemo();
		for(int j=0;j<5;j++)
		{
			System.out.println("main thread"+j);
		}
	}
}
