package Java.Hacker_Rank_Problems;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        if (input % 2 == 1) {
            System.out.println("Weird");
        } else if (input >= 2 && input <= 5) {
            System.out.println("Not Weird");
        } else if (input >= 6 && input <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

    }
}
