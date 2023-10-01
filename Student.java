import java.util.Scanner;

public class Student {
    byte b;// 0
    short s;// 0
    char c;// '\0' -- 't'
    int i;// 0
    long l;// 0
    float f;// 0.0
    double d;// 0.0
    boolean bb;// false -- true
    String name; // null
    Scanner scr;

    void display() {
        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bb);
        System.out.println(name);
        System.out.println(scr);
    }

    // no argument , default constructor
    Student() {
        c = 't';
        bb = true;
    }

    Student(char x, boolean bx) {
        c = x;
        bb = bx;
    }

    public static void main(String[] args) {

        Student obj = new Student();
        obj.display();

        Student obj2 = new Student('l', false);
        obj2.display();

        Student obj3 = new Student('m', true);
        obj3.display();

    }
}
