package patternquestions.specialpattern;
import java.util.*;
public class starplus {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row number ");
        int n = sc.nextInt();
        int mid = n/2+1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == mid || j == mid){
                    System.out.print("*" + " ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }

    }
}
