import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        try {
            System.out.println("enter two numbers");
            int n1 = scr.nextInt();// 20.20 ram
            int n2 = scr.nextInt();
            int ans = 0;

            ans = n1 / n2;
            System.out.println("Div = " + ans);

        } catch (InputMismatchException e) {
            System.out.println("Please Enter Only Integers ( Whole Numbers)");
        } catch (Exception e) {
            System.out.println("Something Went Wrong Please Try AfterSometime");
            // e.printStackTrace();
            // sendEmailToDeveloper(e.printStackTrace())
        } finally {// executes always
            System.out.println("finally block executed....");
        }
    }
}
