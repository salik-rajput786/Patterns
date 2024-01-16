package patternquestions;

import java.util.Scanner;

public class smallalphabetic2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row number ");
        int n = sc.nextInt();
         
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                System.out.print((char)(96+i)+" ");
                
               
                
            }
            System.out.println();
        }
    }
}
