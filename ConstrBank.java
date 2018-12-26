package ObjMarker;
import java.util.Scanner;
public class ConstrBank {
	static{
			System.out.println("welcome to fraud bank");
		  }
		double bal;
		void withdraw(double wdramt)
		{
			bal=bal-wdramt;
			System.out.println("your balance is"+bal);
		}
		void depstamt(double depstamt)
		{
			bal=depstamt+bal;
			System.out.println("your balance is"+bal);
		}
		public ConstrBank(double bal)
		{
			this.bal=bal;
		}
		public double checkbal()
		{
			return bal;
		}
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int ch;
			System.out.println("enter balance");
			double bal = sc.nextDouble();
			ConstrBank b =new ConstrBank(bal);
			
			do
			{
			System.out.println("Enter choice \n1:checkbalance \n2:Withdraw \n3:Deposit \n4:Exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				double balance=b.checkbal();
			System.out.println("your current amt is:"+balance);
			break;
			case 2:
				
				System.out.println("Enter withdraw");
				double wdramt=sc.nextDouble();
				b.withdraw(wdramt);
				break;
			case 3:
				System.out.println("depstamt");
				double depstamt=sc.nextDouble();
				b.depstamt(depstamt);
				break;
			}
		}while(ch>0);
	}
}
