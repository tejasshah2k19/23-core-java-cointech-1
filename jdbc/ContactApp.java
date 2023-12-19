package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ContactApp {

	// bad
	Connection con;
	PreparedStatement pstmt;

	public ContactApp() {
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/contactapp";
		String userName = "root";
		String password = "root";

		try {
			Class.forName(driverName);
			this.con = DriverManager.getConnection(url, userName, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void addContact(String firstName, String contactNum, String city) {
		try {
			this.pstmt = this.con.prepareStatement("insert into contacts (firstName,contactNum,city) values (?,?,?)");
			pstmt.setString(1, firstName);
			pstmt.setString(2, contactNum);
			pstmt.setString(3, city);

			pstmt.executeUpdate(); // insert update delete
			System.out.println("contact added...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		ContactApp c = new ContactApp();
		String firstName, contactNum, city;
		while (true) {
			System.out.println("1 For AddContact\n2 For List AllContact\n3 For DeleteContact By Name\n4 For Exit");
			System.out.println("Enter Your choice");

			int choice = scr.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Please Enter FirstName ContactNum and City");
				firstName = scr.next();
				contactNum = scr.next();
				city = scr.next();
				c.addContact(firstName, contactNum, city);
				break;
			}
		}
	}
}
