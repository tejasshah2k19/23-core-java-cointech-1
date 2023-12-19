package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcDemo {
 
	
	
	public static void main(String[] args) {

		// initialize all the variables
		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/contactapp";
		String userName = "root";
		String password = "root";

		// open connection

		try {
			Scanner scr = new Scanner(System.in);
			// load the driver
			Class.forName(driverName);

			// establish the connection
			Connection con = DriverManager.getConnection(url, userName, password);

			if (con != null) {
				System.out.println("DbConnected...");
			}

			PreparedStatement pstmt = con
					.prepareStatement("insert into contacts (firstName,contactNum,city) values (?,?,?)");

			System.out.println("Enter Name ContactNum and City ");

			String firstName = scr.next();
			String contactNum = scr.next();
			String city = scr.next();

			pstmt.setString(1, firstName);
			pstmt.setString(2, contactNum);
			pstmt.setString(3, city);

			int count = pstmt.executeUpdate();// 1

			if (count != 0) {
				System.out.println("Record Inserted....");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Invalid Driver or DirverName");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
