import java.util.Scanner;

public class EmployeeAgain {
    String name;
    int salary;

    void getData() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Name and Salary");
        name = scr.next(); // read alphanumeric -> String -> single word
        salary = scr.nextInt();// read int
        // nextFloat();
    }

    void printData() {
        System.out.println("Name = " + name);
        System.out.println("Salary = " + salary);
    }

    public static void main(String args[]) {

        EmployeeAgain obj = new EmployeeAgain();
        obj.getData();
        obj.printData();
    }
}
