package collectiond;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(23);
		ts.add(23);//false - 23 
		ts.add(20);
		ts.add(-1);
		ts.add(90);
		ts.add(2);
		
		//int
		//Integer
		
		System.out.println("size => "+ts.size());
		System.out.println("All data => "+ts); //

		
	}
}
