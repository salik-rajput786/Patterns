package patternquestions.triangle;

import java.util.Scanner;

public class invertedtrianglenumber {
      public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row number ");
        int n = sc.nextInt();
         

        /*for n=4
         1234
         123
         12
         1

         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n+1-i; j++) {

                System.out.print(j +" ");           
            }
            System.out.println();
        }

     System.out.println();
         

     /*for n=4  
       1111
       222
       33
       4

         */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n+1-i; j++) {

                System.out.print(i+" ");           
            }
            System.out.println();
        }
    }
}
