package InheritanceProg;
import java.util.Scanner;
 class personaldata {
	 int id;
	 String name;
	 personaldata(int id ,String name)
	 {
		 this.id=id;
		 this.name=name;
	 }
	 void display()
	 {
		 
		 System.out.println("id no " +id);
		 System.out.println("name " +name);
	 }
}
 class Address extends personaldata
 	{
	 String city;
	 int phoneno;
	 Address(int id, String name, String city, int phoneno)
	 {
		 super(id,name);
		 this.city=city;
		 this.phoneno=phoneno;
	 }
	 void display2()
	 {
		 super.display();
		 System.out.println("city "+city);
		 System.out.println("phoneno is "+phoneno);
	 }
 	}
 class salarydetails extends Address
 	{
	 double sal;
	 salarydetails(int id, String name, String city, int phone_no, double sal)
	 {
	 super(id,name,city,phone_no);
	 this.sal=sal;
 	}
 	void display3()
 	{
 		super.display();
 		System.out.println("salary is "+sal);
 	}
 	}
 	public class CustomerDetails
 	{
 		public static void main(String args[])
 		{
 			 int id;
 			 String name;
 			 double sal;

 			 String city;
 			 int phone_no;

 			
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter id");
 		id=sc.nextInt();
 		System.out.println("enter name");
 		name=sc.next();
 		System.out.println("enter city");
 		city=sc.next();
 		System.out.println("enter phone no");
 		phone_no=sc.nextInt();
 		System.out.println("enter sal");
 		sal=sc.nextDouble();
 		salarydetails s = new salarydetails(id,name,city,phone_no,sal);
 		s.display();
 		//s.display2();
 		//s.display3();
 	}
 	}
 
 
