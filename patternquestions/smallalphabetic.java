package patternquestions;

import java.util.Scanner;

public class smallalphabetic {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row number ");
        int n = sc.nextInt();
         
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                System.out.print((char)(96+j)+" ");
                
               
                
            }
            System.out.println();
        }
    }
}
