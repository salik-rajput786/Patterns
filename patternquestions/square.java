package patternquestions;
import java.util.*;
public class square {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter side od square  ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
