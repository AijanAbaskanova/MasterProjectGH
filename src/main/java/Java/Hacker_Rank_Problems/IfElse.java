package Java.Hacker_Rank_Problems;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        if(input%2==1 || (input%2==0 && input<=20 && input>=6)){
            System.out.println("Weird");
        } else{
            System.out.println("Not Weird");
        }

    }
}
