package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<String>S= new LinkedHashSet <String>();
		S.add("boom");
		
		S.add("no");
		System.out.println(S);
		S.remove("boom");
		Iterator<String> itr=S.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(String i : S)
		{
			System.out.println(i);
		}
		
	}
		
		
	}


