package multithreading;

public class MyThread1 extends Thread{
		Table tab;
		 MyThread1(Table tab)
		{
			this.tab=tab;
		}
		public void run()
		{
		
			
			tab.printable(5);
			
		
		
		
		}
		
}
