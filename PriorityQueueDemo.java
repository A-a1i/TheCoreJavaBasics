package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		Queue<Integer>q= new PriorityQueue<>();
		{
			q.add(10);
			q.add(20);
			q.add(30);
			q.add(40);
			q.add(40);
			q.peek();
			System.out.println(q);
		}
	}

}
