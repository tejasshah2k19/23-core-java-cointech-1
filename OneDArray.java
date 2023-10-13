import java.util.Scanner;

public class OneDArray {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int a[] = new int[5]; // create an array a with size 5
        int ans = 0;
        // so i can store 5 different values
        // 0 1 2 3 4
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number");
            a[i] = scr.nextInt();// a[0]=
        }
        System.out.println("Enter data for Search?");
        int search = scr.nextInt();
        int max = a[0];// 0 {-1,-2,-3,-4,-5} => 0

        int found = 0; // not found
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);// a[0] a[1] a[2] a[3] a[4]
            ans = ans + a[i];
            if (a[i] > max) {
                max = a[i];
            }
            //

            if (a[i] == search) {
                found = 1;
            }
        }

        System.out.println("Addition = " + ans);
        System.out.println("Max = " + max);
        if (found == 1) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}