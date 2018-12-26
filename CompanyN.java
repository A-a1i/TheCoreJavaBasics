package Abstraction;
interface Employee
{
	void login();
	interface Manager
	{
		void login_m();
	}
}

public class CompanyN implements Employee,Employee.Manager
{
	public void login()
	{
		System.out.println("emp login");
	}
	public void policies()
	{
		System.out.println("company policies");
	}
	
	public void login_m()
	{
		System.out.println("Manager Login");
	}
	
	public static void  main(String args[])
	{
		CompanyN c =new CompanyN();
		c.login();
		c.policies();
		c.login_m();
		
		Employee e1=new CompanyN();
		e1.login();
		
		Employee.Manager e2=new CompanyN();
		e2.login_m();
		
		
				
	}
	
	

}
