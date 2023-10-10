import java.util.Scanner;

public class TicketApp {

    public static void main(String args[]) {
        Booking x = new Booking();// constructor
        Booking y = new Booking();// constructor
        int i;
        for (i = 1; i <= 10; i++) {
            x.getData();// ram 123
            x.booking();
            x.printData();
        }

        // instance
    }
}

class Booking {
    // read firstName , mobileNum
    // variable -- instance variable
    String firstName;// null user's firstName
    String mobile; // null user's mobile
    int amount; // 0 // total paid
    int goldQty; // 0 qty of gold
    int silverQty;// 0 qty of silver
    int diamondQty; // 0 qty of diamond
    Scanner scr = new Scanner(System.in);

    // constructor
    // init -> instance variable
    Booking() {
        goldQty = 0;
        silverQty = 0;
        diamondQty = 0;
    }

    void getData() {
        // local variable
        int k; // local
        System.out.println("Enter FirstName and Mobile");
        firstName = scr.next();// read string without space
        mobile = scr.next();
    }

    void printData() {
        System.out.println("FirstName = " + firstName);
        System.out.println("Mobile = " + mobile);
        System.out.println("Gold Qty = " + goldQty);
        System.out.println("Silver Qty = " + silverQty);
        System.out.println("Diamond Qty = " + diamondQty);
        System.out.println("Amount = " + amount);
    }

    void booking() {

        int choice;
        System.out.println("Press 1 for Buy GoldTicket\n2 For Buy Silver\n3 For Diamond");
        choice = scr.nextInt();// 1 2 3

        if (choice == 1) {
            System.out.println("How many Gold Tickets you want?");
            goldQty = scr.nextInt();
            amount = goldQty * 200;
        }

        if (choice == 2) {
            System.out.println("How Many Silver Tickets You want?");
            silverQty = scr.nextInt();
            amount = silverQty * 150;

        }

        if (choice == 3) {
            System.out.println("How many Diamond Tickets You want");
            diamondQty = scr.nextInt();
            amount = diamondQty * 250;

        }

    }
}
