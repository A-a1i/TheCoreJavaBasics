package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

class Emp implements Comparable<Emp>
{
	
		int id;
		String name;
		public Emp(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Emp [id=" + id + ", name=" + name + "]";
		}

		@Override
		public int compareTo(Emp o) {
			// TODO Auto-generated method stub
			return getName().compareTo(getName());
		}
		//@Override
//		public int compareTo(Emp o)
//		
//		{
//			// TODO Auto-generated method stub
//			System.out.println(getId());
//			System.out.println(o.getId());
//			return o.getId()-getId();
//		}
		
		
		
	
}
public class Sample {
	public static void main(String[] args) {
		ArrayList<Emp>elist=new ArrayList<>();
		elist.add(new Emp(1,"Ali"));
		elist.add(new Emp(2,"Tejas"));
		elist.add(new Emp(3,"mayur"));
		
		
		Collections.sort(elist,new IdSort());
		System.out.println(elist);
		Iterator<Emp>itr=elist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Collections.sort(elist,new Namesort());
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		
	}
	}

