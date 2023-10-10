import java.util.Scanner;

public class MyBank {

    String firstName;
    float balance;
    int accountNum;

    MyBank() {
        balance = 5000;
    }

    // parameterized -- argument constructor
    MyBank(float initBalance) {
        balance = initBalance;
    }

    void openAccount() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter FirstName ");
        firstName = scr.next();
        System.out.println("Enter Balance");
        balance = scr.nextFloat();
    }

    void printData() {
        System.out.println("First Name = " + firstName);
        System.out.println("Balance = " + balance);
    }

    public static void main(String[] args) {
        MyBank x = new MyBank();
        x.openAccount();
        x.printData();

        MyBank y = new MyBank(25000);
        y.printData();// null 25000

        // declaration
        MyBank obj; // memory

        obj = new MyBank(); // init
        obj.openAccount();

    }
}
