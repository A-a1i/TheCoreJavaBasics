package collection;

import java.util.HashMap;
import java.util.Iterator;

public class MapInterfaceHashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String>map =new HashMap<>();
		map.put(1, "Mayur");
		map.put(2, "Ali");
		map.put(3, "prajakta");
		map.put(3, "Mayur");
		map.put(null, null);
		
		System.out.println(map);
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Iterator itr1=map.values().iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		Iterator itr2=map.keySet().iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}
	

}
