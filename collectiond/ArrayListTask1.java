package collectiond;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask1 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int data; 
		
		
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		for(int i=1;i<=5;i++) {
			System.out.println("Enter num");
			data = scr.nextInt();//50
			list.add(data);//10 20 30 40 50 
		}
		
		int sum =0;
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));//0 1 2 3 4 
			sum = sum + list.get(i);
		}
		
		System.out.println("Sum = "+sum);
	}
}
