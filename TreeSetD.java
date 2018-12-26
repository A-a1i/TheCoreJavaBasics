package collection;


import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetD {
	public static void main(String[] args) {
		Set<Integer>S=new TreeSet<>();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		Iterator<Integer> itr=S.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		for(Integer i : S)
		{
			System.out.println(i);
		}
		
		
			
		
		
	}
}
	

