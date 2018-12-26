package multithreading;

public class Demo extends Thread {
	public Demo()
	{
		Thread t = new Thread(this);	//current class obj
		t.start();
	}
	public void run()
	{
		for(int i = 0;i<5;i++)
		{
			System.out.println("My thread"+i);
		}
	}
	public static void main(String args[])
	{
		Demo d = new Demo();	//born state
		for(int j = 0;j<5;j++)
		{
			System.out.println("main thread"+j);
		}
	}

}
