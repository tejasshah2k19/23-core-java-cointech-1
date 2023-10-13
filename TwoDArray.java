import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        int a[] = new int[5];// 0 1 2 3 4
        // for loop
        int[] x = new int[5];

        int b[][] = new int[3][4];

        int[][] c = new int[3][4];
        int[] d[] = new int[3][4];

        // b => 3 row 4=>col -> 3*4 => 12 elements

        // 00 01 02 03
        // 10 11 12 13
        // 20 21 22 23

        // for ->row , for->col
        Scanner scr = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {// 0 1
            for (int j = 0; j < 4; j++) {// 0 1
                System.out.println("Enter number");
                b[i][j] = scr.nextInt();// b[0][0] , b[0][1] , b[0][2] , b[0][3]
                                        // b[1][0] , b[1][1] , b[1][2] , b[1][3]

            }
        }

        for (int i = 0; i < 3; i++) {// 0 1
            for (int j = 0; j < 4; j++) {// 0 1
                System.out.print(b[i][j] + " ");

            }
            System.out.println("");

        }
    }
}
// find sum of numbers of 2d
// find max
// search a number in 2d
// take row number from user and print sum of that row only
