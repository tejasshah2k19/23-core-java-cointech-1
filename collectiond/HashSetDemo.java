package collectiond;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();

		hs.add(10);
		hs.add(20);
		hs.add(5);
		hs.add(7);
		hs.add(-1);
		
		System.out.println("size => "+hs.size());
		System.out.println(hs);//we can not predict 
		
		//we don't have ordered - we can not predict 
		//we don't have index - 
		//you can not have duplicate value in HashSet  
		hs.add(20); // false 
		System.out.println("size => "+hs.size());
		System.out.println(hs);//		
		
		
		hs.remove(7);
		System.out.println("size => "+hs.size());
		System.out.println(hs);//		
		
		
		boolean ans = hs.contains(250);
		System.out.println("ans => "+ans);
		
		ans = hs.contains(5);
		System.out.println("ans => "+ans);
		
 		//HashSet is used hashing - hash 
		
		System.out.println("Iterate all the data from HS");
		Iterator<Integer> it = hs.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//can we store null in HashSet ? yes 
		
		
		
	}
}