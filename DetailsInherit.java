package InheritancePrograms;
import java.util.Scanner;

class PersonalData 
	{
		int id;
		String name;
		PersonalData(int id,String name)
		{
			this.id=id;
			this.name=name;
		}
		void display()
		{
			System.out.println("id is"+id);	
			System.out.println("name is"+name);		
		}
		
	}
class Address extends PersonalData
{
		String city;
		int phone;
		Address(int id,String name,String city,int phone)
		{
		super(id,name);
		
			this.city=city;
			this.phone=phone;
		}

		void display()
		{
			super.display();
			System.out.println("city is"+city);	
			System.out.println("phone number is"+phone);	
		}
}
	
class Salary extends Address
{
		double sal;
		Salary(int id,String name,String city,int phone,double sal)
		{
			super(id,name,city,phone);
			this.sal=sal;
		}

		void display()
		{
			super.display();
			System.out.println("salary is"+sal);	
		}
}

     
public class DetailsInherit{

public static void main(String args[])	
{
int id;
String name;
String city;
int phone;
double sal;

Scanner sc=new Scanner(System.in);
System.out.println(" Enter id");
id=sc.nextInt();
System.out.println("name");
name=sc.next();
System.out.println("city");
city=sc.next();
System.out.println("phone");
phone=sc.nextInt();
System.out.println("sal");
sal=sc.nextDouble();

Salary s=new Salary(id, name, city, phone, sal);
	
	s.display();
	
			

}
}



