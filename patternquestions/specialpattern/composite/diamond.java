package patternquestions.specialpattern.composite;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n :");
        int n = sc.nextInt();
        int nsp = n - 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            nsp--;

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" " + " ");
        }
         nsp = 1;
        int nst = n + 1;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            nsp++;
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" " + " ");

            nst -= 2;
        }
    }
}
