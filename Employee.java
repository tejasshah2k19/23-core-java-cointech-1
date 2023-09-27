import java.util.Scanner;

public class Employee {

    // variable - data name -> store values
    // method -> process -> logic -> behaviour

    String name;
    int basicSalary;
    int tax;// 1-3000 no tax , 30001 to 100000 10% tax , 100001 to 1000000 20% , 1000001+
            // >30%
    int pf, hra;
    int salary;
    // byte short int long
    // float double
    // boolean
    // char

    // array enum class

    void getData() {
        // class obj = new class();
        Scanner scr = new Scanner(System.in);// java api -> lib
        System.out.println("Enter name and salry");
        name = scr.next();// single word , nextLine()-> multiple words
        basicSalary = scr.nextInt();
    }

    void calculateSalary() {
        // explicit casting
        pf = (int) (basicSalary * 0.12);// int*double => double
        hra = (int) (basicSalary * 0.10);
        salary = basicSalary + hra - pf;
        if (salary > 1000000) {
            tax = (int) (salary * 0.30);
        } else if (salary > 100000) {
            tax = (int) (salary * 0.20);
        } else if (salary > 30000) {
            tax = (int) (salary * 0.10);
        } else {
            tax = 0;
        }
    }

    void printData() {
        System.out.println(name + "  " + basicSalary + "  " + pf + "   " + hra + "   " + salary + " " + tax);
    }

    public static void main(String args[]) {
        Employee e = new Employee();
        e.getData();
        e.calculateSalary();
        e.printData();
    }
}

class PartTimeEmployee {

}

// 1 java source file can have n number of class
// but we must have 1 public class
// core java -> main method that is the entry point-->execution start
// when we compile java file it will generate class file
// we will n number of class file from 1 java file [ n is the count of the class
// in java file]
// we can run those class file using java command
// java Employee -> main
// java PartTimeEmployee
