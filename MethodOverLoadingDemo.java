public class MethodOverLoadingDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(25, 30);
        c.add(30, 20, 50);
    }
}

class Calculator {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void add(float a, float b) {

    }
}