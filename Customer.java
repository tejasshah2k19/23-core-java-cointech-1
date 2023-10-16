import java.util.Scanner;

public class Customer {
    String firstName;
    String email;
    String password;

    Scanner scr = new Scanner(System.in);

    void getData() {
        System.out.println("Enter FirstName Email and Password");
        firstName = scr.next();
        email = scr.next();
        password = scr.next();
    }

    void printData() {
        System.out.println(firstName + " " + email + " " + password);
    }
}
