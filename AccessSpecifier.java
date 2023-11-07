public class AccessSpecifier {
    public static void main(String[] args) {
        Santa s = new Santa();
        s.add();
    }
}

class Santa {
    // private method can be access inside the class only

    private void add() {
        System.out.println("add from Santa");
    }

    // default protected and public -> can access outside the class
}
