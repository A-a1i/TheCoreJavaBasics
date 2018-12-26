package multithreading;

public class MultiTDemo extends Thread  {
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			
		//	System.out.println(Thread.currentThread().getName());	//used to call two method with current method
			System.out.println("my thread demo"+i);
			try{
				Thread.sleep(1500);
			}
			catch(InterruptedException e){
				e.getMessage();
			}
		}
		
	}
public static void main(String[] args) {
	MultiTDemo d=new MultiTDemo();
	Demo d1=new Demo();
	d1.start();
	
	d.start();
	try{
		d.join();
	}
	catch(InterruptedException y)
	{
		//y.getMessage();
	}
	for(int j=0;j<5;j++)
	{
		System.out.println("main thread demo"+j);
		/*try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			e.getMessage();
		}*/

	}
}
}
