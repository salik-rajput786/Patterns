package patternquestions.specialpattern;

import java.util.Scanner;

public class rhombusnstnsp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
     int nsp=n-1;
     int nst =n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" "+" ");
            }
                for (int k = 1; k <= nst; k++) {
                    System.out.print("*" + " ");
                
            }
            System.out.println(" ");
            nsp--;

        }
    }
    
}
