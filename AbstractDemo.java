public class AbstractDemo {
    public static void main(String[] args) {
        // Calc c = new Calc();
    }
}

// abstract
abstract class Calc {
    // abstract method - method having only declaration
    abstract void add();// no defination - no logic - no implementation

    // non abstract
    void sub() {
        System.out.println("sub->");
    }
}

// child class
class Calculator extends Calc {
    void add() {
        System.out.println("add=>");
    }
}