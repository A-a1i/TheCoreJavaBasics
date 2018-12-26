package filehandlingdemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		FileInputStream in=new FileInputStream("a");
		ObjectInputStream readfile = new ObjectInputStream(in);
		EmpClass e=(EmpClass)readfile.readObject();
		System.out.println(e);
	}

}
