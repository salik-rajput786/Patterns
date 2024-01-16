package patternquestions.triangle;

import java.util.Scanner;

public class invertedtrianglealphabrtic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row number ");
        int n = sc.nextInt();
        /*
         * uppercasealphabetic of n = 4
         * A B C D
         * A B C
         * A B
         * A
         * 
         * 
         * 
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {

                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }

        System.out.println();

        /*
         * lowercasealphabetic of n=4 
         * a b c d
         * a b c
         * a b
         * a
         * 
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {

                System.out.print((char) (j + 96) + " ");
            }
            System.out.println();
        }

        System.out.println();

        /*
         * uppercasealphabetic of n=4
         * A A A A
         * B B B
         * C C
         * D
         * 
         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {

                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }

        System.out.println();

        /*
         * uppercasealphabetic of n=4
         * a a a a
         * b b b
         * c c
         * d
         * 
         */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {

                System.out.print((char) (i + 96) + " ");
            }
            System.out.println();
        }
    }
}
