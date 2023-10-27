public class StaticKeywordDemo {
    public static void main(String[] args) {
        // slider -> m and m2 share
        Mouse m = new Mouse();// dpi price
        Mouse m2 = new Mouse();// dpi price
        m.click();

        Mouse.doubleClick();//className 
        m.doubleClick();//objectName 

    }

}

class Mouse {

    int dpi;// instance variable -- non static variable
    int price;
    static int slider;

    // not static metho or instance method
    void click() {
        dpi = 10;
        slider = 12;
        System.out.println("click()");
    }

    // static method
    static void doubleClick() {
        // dpi = 20;
        slider = 33;
        System.out.println("doubleClick()");
    }
}

// static class OOP {

// }

class BankICICI {
    int balance;
    int accNum;
    static int bankCode;

}

class BankHDFC {
    int balance;
    int accNum;
    static int bankCode;
}

// BankICICI 1000 object ->

class State {
    String name;
    int code;
    static String countryName;

}

// 5 area ->
class Area {
    String areaName;

}

class FD {
    static float roi = 9.2f;
}
// 1000 object of FD

class Loan {
    int amount;
    int roi;
    int cibil;
}
// 500 object ->
// amount:5000 10, 50000 8 roi
//

class Apple {
    String modelName;
    static String osName; // ios{7 8 9 10 17}
}

// 10 {iphone7 } {iphone10} {iphone11}

class Person {
    String name;
    String email;
    String address;
    static String nat;
}