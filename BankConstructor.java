package basic_program_two;
import java.util.Scanner;
public class BankConstructor {
	static
	{
		System.out.println("welcome to bank");
	}
	
	double bal;
	void withdraw(double wamt)
	{
		bal=bal-wamt;
		System.out.println("ur bal is" + bal);
	}
	void deposit(double damt)
	{
		bal=damt+bal;
		System.out.println("ur bal is" + bal);
	}
	public BankConstructor(double bal)
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
		System.out.println("enter bal");
		double bal=sc.nextDouble();
		BankConstructor b=new BankConstructor(bal);
		do
		{
		System.out.println("enter choice \n1:checkBal \n2:Withdraw \n3:deposit \n4:exit");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:double balance=b.checkbal();
		System.out.println("ur current bal" + bal);
		break;
		case 2:
			System.out.println("enter amount to withdarw");
			double wamt=sc.nextDouble();
			b.withdraw(wamt);
			break;
		case 3:
			System.out.println("deposite amount");
			double damt=sc.nextDouble();
			b.deposit(damt);
		}
		
		}while(ch>0);

}
}

