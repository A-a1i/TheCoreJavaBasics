package multithreading;

public class SyncDemo2 {
	public static void main(String args[])
	{
		Table tab = new Table();
		MyThread1 t1 = new MyThread1(tab);
		MyThread2 t2 = new MyThread2(tab);
		t1.start();
		t2.start();
	}
}
