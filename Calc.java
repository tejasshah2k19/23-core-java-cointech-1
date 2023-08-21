class Calc {

    void add() {
        // local variable
        int n1 = 10;
        int n2 = 20;
        int ans = n1 + n2;
        System.out.println("addition :: " + ans);
    }

    void sub() {
        int n1 = 20;
        int n2 = 30;
        int ans = n1 - n2;
        System.out.println("subtraction :: " + ans);

    }

    public static void main(String[] args) {
        // call 'your' method
        // how to create object

        Calc obj = new Calc();
        // object can access class property using dot operator
        obj.add();
        obj.sub();

    }
}
