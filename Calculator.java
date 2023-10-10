/*
            Date       :  10-04-2023
            Author     :  Tejas Shah 
            Defination :  Calculator
*/
public class Calculator {
    int no1, no2, ans;
    // float double

    void add() {
        // this is method for addition
        no1 = 20;
        no2 = 30;
        ans = no1 + no2;
        System.out.println("addition = " + ans); // addition = 50
    }

    void sub() {
        no1 = 20;
        no2 = 30;
        ans = no1 - no2;
        System.out.println("subtraction = " + ans);
    }

    void mul() {
        no1 = 20;
        no2 = 30;
        ans = no1 * no2;
        System.out.println("mul = " + ans);
    }

    void div() {
        no1 = 20;
        no2 = 30;
        ans = no1 / no2;
        System.out.println("div = " + ans);
    }

    public static void main(String args[]) {

        // class objname = new class();

        Calculator obj = new Calculator(); // object - instance
        obj.add();
        obj.mul();// method calling - we must have to create object to access class property
    }
}
