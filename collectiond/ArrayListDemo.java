package collectiond;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		int a[] = new int[3]; // fix 3
		a[0] = 12;
		// a[1]
		// a[2]
		System.out.println(a[0]);// 12
		// to print all elements we need a loop
		// util
		// generic
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);// index 0
		list.add(102); // index 1
		list.add(121); // index 2
		list.add(1200);
		list.add(112); // 4th index
		list.add(25);
		list.add(50);

		System.out.println(list.get(0));/// 12
		System.out.println(list.get(4));// 112
		System.out.println(list);

		// to remove
//		list.remove(50);//remove -> index 
		list.remove((Integer) 50);// remove->by value
		System.out.println(list);

		System.out.println("====All Items From ArrayList========= ");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));// list.get(0);
		}

		boolean ans = list.contains(25);// boolean - true false
		System.out.println(ans);//found->true , not found -> false 
	
		System.out.println(list.contains(5000));//false 
		
		
	}
	
}
