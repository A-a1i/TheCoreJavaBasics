package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class EntryMapInterface {
	public static void main(String[] args) {
		Map<Integer, String>p=new HashMap<>();
		p.put(1, "ali");
		p.put(2, "vashi");
		p.put(3, "thane");
		System.out.println(p);
		Iterator<Entry<Integer, String>> itr=p.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> e=itr.next();
			System.out.println(e.getValue());
			System.out.println(e.getKey());
			
		}
	}

}
