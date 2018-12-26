package filehandlingdemo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileHAndlDemo1 {
	public static void main(String args[]) throws IOException
	{
		String s="Hello";
		int i=0;
		FileInputStream in=new FileInputStream("a");
		while((i=in.read())!=-1)
		{
			System.out.print((char)i);
		}
	}

}
