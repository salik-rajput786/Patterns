package patternquestions.triangle;

import java.util.Scanner;

public class alphabeticandnumberstartriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter row number ");
        int n = sc.nextInt();
         
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                 if(i%2==0){
                   System.out.print((char)(64+j)+" ");
                 }
                 else{
                System.out.print(j+" ");
                 }
               
                
            }
            System.out.println();
        }
    }
}
