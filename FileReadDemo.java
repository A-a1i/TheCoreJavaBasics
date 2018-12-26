package filehandlingdemo;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
	
	public static void main(String args[]) throws IOException
	{
		
		int i=0;
		FileReader in=new FileReader("a");
		while((i=in.read())!=-1)
		{
			System.out.print(i);
		}
		in.close();
	}
			
			
}
	


