package filehandlingdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerailizationDemo {
	public static void main(String args[]) throws IOException

	{
		EmpClass e = new EmpClass(1,"Ali","Mumbra");
		FileOutputStream out =new FileOutputStream("a");
		ObjectOutputStream writefile =new ObjectOutputStream(out);
		writefile.writeObject(e);
		System.out.println("success");
		
	}
}
