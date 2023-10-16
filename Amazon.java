import java.util.Scanner;

public class Amazon {
    public static void main1(String[] args) {

        // 3 products

        Product p1 = new Product();
        p1.productId = 1;
        p1.price = 125000;
        p1.productName = "Legion Y 520";
        p1.category = "Laptop";

        Product p2 = new Product();
        p2.productId = 2;
        p2.price = 150000;
        p2.productName = "iPhone  15 Pro Max 128GB";
        p2.category = "iPhone";

        Product p3 = new Product();
        p3.productId = 3;
        p3.price = 5000;
        p3.productName = "RedGear 5260";
        p3.category = "Mouse";

        // Customer
        Customer c1 = new Customer();
        c1.firstName = "ram";
        c1.email = "ram@gmail.com";
        c1.password = "ram123";

        Customer c2 = new Customer();
        c2.firstName = "shyam";
        c2.email = "shyam@gmail.com";
        c2.password = "shyam123";

        // Order
        Order o1 = new Order();
        o1.customer = c1; // ram
        o1.product = p1; // laptop legion y520
        o1.qty = 2;
        o1.totalAmount = p1.price * o1.qty;

    }

    public static void main2(String[] args) {

        // 3 products

        Product p1 = new Product();
        p1.getData();

        Product p2 = new Product();
        p2.getData();

        Product p3 = new Product();
        p3.getData();

        // Customer
        Customer c1 = new Customer();
        c1.getData();

        Customer c2 = new Customer();
        c2.getData();

        // Order
        Order o1 = new Order();
        o1.totalAmount = p1.price * o1.qty;

    }

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int choice;
        Customer c = null;
        Product p = null;

        while (true) {
            System.out.println("\n0 Exit\n1 Add Customer\n2 Add Product\n3 Place Order\n4 View All Customer");
            System.out.println("\n5 View All Products\n6 View All Orders");
            System.out.println("\nPlease Enter your choice ");

            choice = scr.nextInt();

            switch (choice) {
                case 0:
                    System.exit(0);// this will shutdown your app = program
                case 1:// 3 - array
                    c = new Customer();
                    c.getData();
                    break; // break switch -> it will not jump to the next case
                case 2:// 3 - array
                    p = new Product();
                    p.getData();
                    break;
                case 3:
                    System.out.println("Men At Work");
                    break;
                case 4:
                    c.printData();
                    break;
                case 5:
                    p.printData();
                    break;
                case 6:
                    System.out.println("Men At Work");
                    break;
            }// switch

        } // while
    }// main

}// amazon class

/*
 * 1 Add Customer
 * 2 Add Product
 * 3 Place Order
 * 4 View All Customer
 * 5 View All Products
 * 6 View All Orders
 * 0 Exit
 * 
 * 
 * 
 * 
 * 
 */