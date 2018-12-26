package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo 
{
	public static void main(String[] args)
	{
		List<Integer>list= new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		//list.add(null);
		//list.add(null);
		/*System.out.println(list);
		List<Integer>list1= new ArrayList<Integer>();
		list.get(3);
		System.out.println(list.get(3));
		list1.addAll(list);
		System.out.println(list.addAll(list));
		list.remove(3);
		System.out.println(list1.get(2));
		list1.retainAll(list);
		System.out.println(list1);
		list1.remove(list1);*/
		ListIterator<Integer> itr1=list.listIterator();
		//Iterator<Integer> itr=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
			System.out.println("*******************");	
		//ListIterator<Integer> itr1=list.listIterator();
		while(itr1.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
				
		
		
		
	}

}
