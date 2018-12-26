package collection;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorD {
	public static void main(String[] args) {
		Vector<Integer>r= new Vector<Integer>();
	
		r.addElement(10);
		r.addElement(20);
		r.addElement(30);
		Enumeration<Integer> en=r.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
	}

}
