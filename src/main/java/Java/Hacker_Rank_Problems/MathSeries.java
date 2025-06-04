package Java.Hacker_Rank_Problems;

import java.util.Scanner;

public class MathSeries {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for ( int i = 0; i < t; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            int sum = a;
            for(int j = 0; j < n; j++){
                sum = sum + (int)Math.pow(2,j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();


        }
    }
}
