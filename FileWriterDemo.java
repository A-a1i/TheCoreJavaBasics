package filehandlingdemo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String args[]) throws IOException
	{
		String s="Coder Vashi";
		FileWriter out=new FileWriter("b");
		out.write(s);
		System.out.println("Success");
		out.close();
		
		
	}
}
