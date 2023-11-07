public class InterfaceDemo2 {
    public static void main(String[] args) {

    }
}

interface Rail {
    void drive();
}

interface Car {
    public void start();
}
// class can extends class
// class extends single class only
// class implements interface
// class can implments n number interface

class RailChild implements Rail, Car {
    // must be public
    public void drive() {

    }

    public void start() {

    }
}
