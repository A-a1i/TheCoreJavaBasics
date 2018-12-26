package collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String>map =new LinkedHashMap<>();
		map.put(1, "Mayur");
		map.put(2, "Ali");
		map.put(3, "prajakta");
		map.put(3, "Mayur");
		map.put(null, null);
		System.out.println(map);
		System.out.println("*******************");	
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
			System.out.println("*******************");	
		
		Iterator itr1=map.values().iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println("*******************");	
		Iterator itr2=map.keySet().iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}

	}


