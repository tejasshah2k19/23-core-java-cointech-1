package collectiond;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.add(20);
		pq.add(120);
		pq.add(22);
		pq.add(20);
		pq.add(200);
		pq.add(220);

		System.out.println("Size => " + pq.size());// 6
		System.out.println(pq);

		pq.add(-1);
		System.out.println("Size => " + pq.size());// 6
		System.out.println(pq);

		// PQ : duplicate
		// : ordered - we dont have index
		// : sorted - your logic - YES

		System.out.println("PQ:");
		Iterator<Integer> it = pq.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("PEEK POLL");
//		System.out.println(pq.peek());//return top of the PQ
//		System.out.println(pq.size());
//		
//		System.out.println(pq.poll());//return top of the PQ - remove also 
//		System.out.println(pq.size());

		while(pq.size() != 0) {
			System.out.println(pq.poll());//-1 20 20 120 200 220 
		}
		System.out.println("SIZE => "+pq.size());
//		pq.clear();
//		pq.contains(2);
	
	}
}
