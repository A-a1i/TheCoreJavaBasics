package basic_program;

import java.util.Scanner;

public class SwitchCaseTwo {
	public static void main(String args[])
	{
		int cb=5000,wd,de,ex;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter pin");
		int pin=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		if((pin==123)&&(name.equals("asd")))
		{
			
			int ch;
			do
			{
				System.out.println("enter choice \n1:checkBal \n2:Withdraw \n3:deposit \n4:exit");
				ch=sc.nextInt();
				switch(ch)
				{
				case 1 :System.out.println("your current balanceis:" +cb);
				break;
				case 2:System.out.println("withdraw amount");
				wd=sc.nextInt();
				System.out.println("your currentbal is:\n" +cb+"\nAmount you have withdrawed is:\n"+wd);
				if(wd>cb)
				{
					System.out.println("amnt exceeded");
				}
				else
				{
					cb=cb-wd;
					System.out.println("your amount now is:"+cb);
				}
				break;
				case 3 :System.out.println("enter amount to deposit");
				de=sc.nextInt();
				cb=cb+de;
				break;
				
				case 4 :System.out.println("thank you");
				System.exit(0);break;
				default:
					System.out.println("Wrong choise");
				}
			}while(ch>=0);
		}
	}
}
									
				
			
			
		
	

		
		
					
		
				
			
			
			
		
	




