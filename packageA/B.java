package packageA;

public class B {

    public static void main(String[] args) {
        A objA = new A();
        // objA.add();// private method can not access outside the class
        objA.sub();
        objA.mul();
        objA.div();
    }
}
