package filehandlingdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandlDemo {
	public static void main(String args[]) throws IOException
	{
		String s="Coder";
		
		FileOutputStream out =new FileOutputStream("a",true); //append mode always false
		byte a[]=s.getBytes();
		out.write(a);
		
		System.out.println("success");
	}

}
