package collectiond;

import java.util.HashMap;
import java.util.Scanner;

public class UserHashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,User> users = new HashMap();
		User u1 = new User();
		u1.getData();
		users.put(1, u1); 
		
		
		
		HashMap<String, String> users2 = new HashMap<String, String>(); 
		users2.put("tejas12", "tejas12345");
		
	}
}

class User {
	String userName;
	String password;
	String contactNum; 
	String address;
	String city; 

	void getData() {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Username and Password");
		this.userName = scr.next();
		this.password = scr.next();
		//
		//
	}

	void display() {
		System.out.println(userName + "   " + password);
	}
}
