package patternquestions.triangle;

import java.util.Scanner;

public class trianglestar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row number ");
        int n = sc.nextInt();
         
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("*"+" ");
                
               
                
            }
            System.out.println();
        }
    }
}
