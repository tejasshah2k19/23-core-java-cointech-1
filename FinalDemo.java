class FinalDemo {
    public static void main(String[] args) {
        RBIBank r = new RBIBank();
        // r.roi = 9.5f;

    }
}

class RBIBank {
    final float roi = 6.5f; // f , F
    // final variable can not modify
    // you must have to assign value when you create
    // final varibale, then you never modify
    // constant variable -->

    final void calculateInterest() {
        int charge = 500;
        System.out.println(charge);
    }
}

class ICICI extends RBIBank {
    // overriding
    // void calculateInterest() {
    // int charge = 600;
    // System.out.println(charge);
    // }
}

final class SBI extends RBIBank {
    //
    void wid() {
        System.out.println("wid()");
    }
}

// class FakeSBI extends SBI {
//
// }
