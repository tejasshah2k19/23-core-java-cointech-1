package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

	void listAllContact() {
		try {
			// select * from contacts
			pstmt = con.prepareStatement("select * from contacts");
			ResultSet rs = pstmt.executeQuery();// rows*cols

			System.out.println("FirstName   ContactNum    City");

			while (rs.next()) {
				String fn = rs.getString("firstName");
				String cn = rs.getString("contactNum");
				String city = rs.getString("city");
				System.out.println(fn + "   " + cn + "   " + city);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void deleteContact(String firstName) {
		try {
			pstmt = this.con.prepareStatement("delete from contacts where firstName = ?");
			pstmt.setString(1, firstName);
			int records = pstmt.executeUpdate();
			System.out.println(records + " deleted..");
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
			case 0:
				System.exit(0);
			case 1:
				System.out.println("Please Enter FirstName ContactNum and City");
				firstName = scr.next();
				contactNum = scr.next();
				city = scr.next();
				c.addContact(firstName, contactNum, city);
				break;
			case 2:
				c.listAllContact();
			case 3:
				System.out.println("Enter Name to delete");
				firstName = scr.next();
				c.deleteContact(firstName);
				break;
			}
		}
	}
}
