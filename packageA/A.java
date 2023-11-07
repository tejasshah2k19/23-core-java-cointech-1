package packageA;

public class A {

    private int a;
    int b;
    protected int c;
    public int d;

    // can not go outside the class
    private void add() {

        System.out.println("add FRom A");
    }

    // can not go outside the package
    void sub() {
        System.out.println("sub FRom A");
    }

    // can go outside class if inheritance is achieved
    // can access via family
    protected void mul() {
        System.out.println("mul FRom A");
    }

    // no restrictions
    public void div() {
        System.out.println("div FRom A");
    }
}
