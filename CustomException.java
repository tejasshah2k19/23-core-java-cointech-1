public class CustomException {
    public static void main(String[] args) {
        FlipKart f = new FlipKart();
        f.loginWithGoogle("ax@gmail.com", "x");
        System.out.println("THE END ");

    }
}

//
class Google {
    void login(String email, String password) {
        if (email.equals("x@gmail.com") && password.equals("x")) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
            // 10/0 -> ArithmeticException
            // num -> ram -> InputMismatchExcetpion
            // throw new ArithmeticException();// InvalidCredentialExecption()
            InvalidCredentialExecption a = new InvalidCredentialExecption();
            throw a;
        }
    }
}

// Object class
class FlipKart {
    void loginWithGoogle(String email, String password) {
        // login->Google
        Google g = new Google();
        g.login(email, password);
    }
}

// child of Object
class InvalidCredentialExecption extends RuntimeException {
    InvalidCredentialExecption() {
        super("ERR121");
    }
}
// 1) child of Exception
// 2) child of RuntimeException