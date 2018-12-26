package basic_program_two;

import java.util.Scanner;

public class StudentDetails {
	String name;
    String dob;
    String institute_name;
   public StudentDetails(String name,String dob,String institute_name)
	{
		this.name=name;
		this.dob=dob;
		this.institute_name=institute_name;
	}
   void display()
   {
	   System.out.println("student name is " +name);
	   System.out.println("student DOB is " +dob);
	   System.out.println("student intitute " +institute_name);
	   
   }
	
	public static void main(String args[])
	{
		Scanner p =new Scanner(System.in);
		
		System.out.println("Enter name");
		String name=p.next();
		
		System.out.println("Enter age");
		String dob=p.next();
		
		System.out.println("enter institute name");
		String institute_name =p.next();
		
		StudentDetails s =new StudentDetails(name, dob,institute_name);
		s.display();
		
	}
}
