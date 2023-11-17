public class ConstructorHir {
    public static void main(String args[]) {
        Bottom bb = new Bottom("hi");// TB
    }

}

class Top {
    public Top(String s) {
        System.out.println("T");
    }
}

class Bottom extends Top {
    Bottom() {
        super("hi");
        System.out.println("B");
    }

    Bottom(String x) {
        super("hi");
        System.out.println("Para B");
    }
}
