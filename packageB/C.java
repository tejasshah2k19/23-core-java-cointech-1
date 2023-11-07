package packageB;

import packageA.A;

//by defualt class c can access all the classes that is inside packageB 
//how we can access a class whihc outside current package? 
// by import that class 
public class C {
    public static void main(String[] args) {
        A objA = new A();
        // objA.add();//private - outside class
        // objA.sub();//default - can work inside package only
        // objA.mul();// protected
        objA.div();// public
        D objD = new D();
        objD.mulAccess();
        objD.div();

    }
}

class D extends A {
    void mulAccess() {
        super.mul();// protected
        div();// public

    }
}
