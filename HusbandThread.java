package multithreading;
import java.util.Scanner;
 class HusbandThread implements Runnable{
		Thread husband;
		Bank b;
		HusbandThread(Bank b)
		{
			this.b=b;
			husband=new Thread(this,"depositthread");
			husband.start();
		}
		public void run()
		{
			b.deposit();
		}
}
 class WifeThread implements Runnable
 {
	 Thread wife;
	 Bank b;
	 WifeThread(Bank b)
	 {
		 this.b=b;
		 wife=new Thread(this,"withdrawthread");
		 wife.start();
	 }
	 public void run()
	 {
		 b.withdraw();
	 }
 }
 class Bank
 {
	 private volatile double balance=50000;
	 private int withdraw;
	 private int depositamt;
	 public double deposit()
	 {
		 try{
			 Scanner sc = new Scanner(System.in);
			 System.out.println("balance before deposit:"+balance);
			 Thread.sleep(1000);
			 System.out.println("Enter amount:");
			 depositamt=sc.nextInt();
			 Thread.sleep(1000);
			 balance=balance+depositamt;
			 Thread.sleep(1500);
			 System.out.println("balance after deposit:"+balance);
		 }
		 catch(InterruptedException e)
		 {
			 e.printStackTrace();
		 }
		 return balance;
	 }
	 public double withdraw()
	 {
		 try{
			 Scanner sc = new Scanner(System.in);
			 System.out.println("balance before withdraw:"+balance);
			 Thread.sleep(1000);
			 System.out.println("Enter amount:");
			 withdraw=sc.nextInt();
			 Thread.sleep(1000);
			 balance=balance-withdraw;
			 Thread.sleep(1500);
			 System.out.println("balance after withdraw:"+balance);
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		 return balance;
	 }
 }
 /*public class Synchronized Thread
 {
	 public static void main(String args[])
	 {
		 Bank b = new Bank();
		 HusbandThread ht = new HusbandThread(b);
		 WifeThread wt = new WifeThread(b);
	 }
 }*/
