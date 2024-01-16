package patternquestions;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row number ");
        int n = sc.nextInt();
        System.out.println("enter column number ");
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}