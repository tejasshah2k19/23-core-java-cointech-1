package collectiond;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		
		list.add(10); // 0th index 
		list.add(20); // 1st index 
		System.out.println(list);
		list.add(0,50);//add 50 on 0th index , data will not overwrite 
						//it will shift by 1
		// 50  10  20 
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(5000);
		list2.addAll(list);
		System.out.println(list2);
	
		list2.clear();
		System.out.println(list2);
		
		ArrayList<Integer> list3 = new ArrayList<Integer>(20);//initial capacity 
		//what is the default size? 10 
		
		
		int x[] = {11,22,33,44,55};
		//array into arraylist 
		
		//arraylist to array 
		Object a[] =  list.toArray(); 
		System.out.println(a[0]);
		
		
		//forEach 
		for(Integer v:list) {//50 10 20 
			System.out.println(v);
		}
		
		
		System.out.println("======using iterator====");
		//via Iterator 
		Iterator<Integer> it =  list.iterator();
		
		while(it.hasNext())//true true true false
		{
			System.out.println(it.next());//50 10 20
		}
		
		
		//set data on 0th index , and do not shift , overwrite old data 
		System.out.println(list);
		list.set(0, 5000);
		System.out.println(list);
		
		
		
		
		
		
	}
}
