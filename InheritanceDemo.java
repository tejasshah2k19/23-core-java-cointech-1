public class InheritanceDemo {
    public static void main(String[] args) {
        BasicCalc basicCalc = new BasicCalc();
        basicCalc.add();

        SciCalc sciCalc = new SciCalc();
        sciCalc.sin();
        sciCalc.sqrt();
        sciCalc.add();// BasicCalc
        sciCalc.mul();// BasicCalc
    }
}

// Parent - Super - Base
class BasicCalc {
    // 16 -> SciCalc -> copy 16-> redudant
    void add() {
        System.out.println("add()");
    }

    void mul() {
        System.out.println("mul()");
    }
}

// Child - Sub - Derived
class SciCalc extends BasicCalc {
    void sin() {
        System.out.println("sin()");
    }

    void sqrt() {
        System.err.println("sqrt()");
    }
}

// single
class A {

}

class B extends A {

}

// multilevel
class J {

}

class K extends J {

}

class T extends K {

}