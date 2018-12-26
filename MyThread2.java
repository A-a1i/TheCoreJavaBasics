package multithreading;

public class MyThread2 extends Thread{
	Table tab;
	MyThread2(Table tab)
	{
		this.tab=tab;
	}
	public void run()
	{
		
			tab.printable(10);
		
	}
}
