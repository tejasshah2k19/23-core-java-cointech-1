import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        AiCalc obj = new AiCalc();
        obj.div();
    }
}

class AiCalc {
    void div() {
        Scanner scr = new Scanner(System.in);
        try {
            System.out.println("enter two numbers");
            int n1 = scr.nextInt();// 20.20 ram
            int n2 = scr.nextInt();
            int ans = 0;

            ans = n1 / n2;
            System.out.println("Div = " + ans);

        } catch (ArithmeticException e) {
            System.out.println("Please Do not Enter Zero");
        } catch (InputMismatchException e) {
            System.out.println("Please Enter Only Integers ( Whole Numbers)");
        } catch (Exception e) {
            System.out.println("Something went wrong please try after sometime....");
            e.printStackTrace();
            System.out.println(e.getMessage());// normal error msg
        }

    }
}
