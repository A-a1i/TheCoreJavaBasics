package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QDemo {
	public static void main(String[] args) {
		Queue<Integer>q= new PriorityQueue<>();
		for(int i =5;i>=0;i--)
		{
			q.add(i);
		}
		
		System.out.println(q);
		for(int i=0;i<=5;i++)
		{
			System.out.println(q.remove());
		}
	//	System.out.println(q);
	}

}
