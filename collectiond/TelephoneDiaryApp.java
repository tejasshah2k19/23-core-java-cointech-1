package collectiond;

import java.util.ArrayList;
import java.util.Scanner;

public class TelephoneDiaryApp {

	public static void main(String[] args) {

		int choice;
		Scanner scr = new Scanner(System.in);
		ArrayList<Person> list = new ArrayList<Person>(); // Array of Object -> 10 -> index

		while (true) {
			System.out.println(
					"1 for Add new contact\n2 For list all contact\n3 For Search contact\n4 For Remove contact\n0 For Exit");
			System.out.println("Enter choice");

			choice = scr.nextInt();

			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				Person p = new Person();
				p.getData();
				list.add(p);
				break;
			case 2:
				for (Person x : list) {
					x.display();
				}
				break;
			case 3: 
				System.out.println("Enter Name ? ");
				String searchName = scr.next(); 
				for (Person x : list) {//1 2 3 4 5 
//					if(x.getName().equalsIgnoreCase(searchName)) {
//						x.display();
//					}
					if(x.getName().startsWith(searchName)) {
						x.display();
					}
					//ravan lalaram ram 
					//ra -> ravan ram  
					
					
				}
				break;
			case 4: 
				System.out.println("Please Enter Exact name to remove ? ");
				String name = scr.next(); 
				
				//remove 
			}
		}

	}
}

class Person {
	private String name;
	private Integer number;
	Scanner scr = new Scanner(System.in);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void getData() {
		System.out.println("Enter Name and Contact Number");
		name = scr.next();
		number = scr.nextInt();
	}

	public void display() {
		System.out.println(name + "  " + number);
	}
}
//name number 

//add new contact 
//list all contact 
//search contact
//remove contact 
