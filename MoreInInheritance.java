public class MoreInInheritance {
    public static void main(String[] args) {

        Star s = new Star();
        s.printData();
    }
}

class Rock {
    int a = 10;
    int b = 90;

    void hi() {
        System.out.println("HI");
    }
}

class Star extends Rock {

    int a = 100;

    void printData() {
        System.out.println("a = " + a);// 100
        System.out.println("b = " + b);// 90
        System.out.println("a = " + super.a);// 10 {Parent class a [Rock]}
        hi();// child -> this.hi()
        super.hi();
        this.hi();// self - current object
    }

    void hi() {
        System.out.println("HI From Star [ Child ] ");
    }
}