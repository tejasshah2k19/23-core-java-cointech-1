public class DisableObject {
    public static void main(String[] args) {
        // Mouse m = new Mouse();
        // new -> is used to allocate memory
        // Mouse() -> constructor -> that decide how this object is initilized

        Mouse.add();
    }
}

class Mouse {
    private Mouse() {

    }

    static void add() {
        Mouse m = new Mouse();
    }
}