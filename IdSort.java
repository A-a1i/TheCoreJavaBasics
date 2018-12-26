package collection;

import java.util.Comparator;
class Namesort implements Comparator<Emp>{

@Override
public int compare(Emp o1, Emp o2) {
	// TODO Auto-generated method stub
	return o1.getName().compareTo(o2.getName());
}
}
public class IdSort implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}
	

}


