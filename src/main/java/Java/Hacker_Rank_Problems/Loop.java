package Java.Hacker_Rank_Problems;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        for(int i = 1; i<=10; i++){
            int result = input * i;
            System.out.println(input + " x " + i + " = " + result);
        }
    }
}
