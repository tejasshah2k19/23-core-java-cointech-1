import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        User user = new User();

        while (true) {
            System.out.println("\n\nPress 1 For Input\n2 For Display\n3 For Exit");
            System.out.println("Enter Your Choice");
            int choice = scr.nextInt();

            switch (choice) {
                case 1:
                    user.getData();
                    break;
                case 2:
                    user.printData();
                    break;
                case 3:
                    System.exit(0);// shutdown your app

                default:
                    System.out.println("Invalid Choice");
                    break;
            }// switch
        } // while
    }// main

}// class

class User {
    String firstName;
    String email;
    String password;
    int bornYear;
    int age;

    Scanner scr = new Scanner(System.in);

    void getData() {
        System.out.println("Enter FirstName");
        firstName = scr.next();
        System.out.println("Enter Email");
        email = scr.next();
        System.out.println("Enter Password");
        password = scr.next();
        System.out.println("Enter BornYear");
        bornYear = scr.nextInt();
        calcAge();
    }

    void calcAge() {
        age = 2023 - bornYear;
    }

    void printData() {
        System.out.println("FirstName : " + firstName);
        System.out.println("Email : " + email);
        System.out.println("Password : " + password);
        System.out.println("Age : " + age);
    }
}
