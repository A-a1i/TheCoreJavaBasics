package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashsetD {
	public static void main(String[] args) 
	{
		Set<Integer>S= new  HashSet<Integer>();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(67);
		
		Iterator<Integer> itr=S.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(int i : S)
		{
			System.out.println(i);
		}
		
	}

}
