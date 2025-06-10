package Java.Hacker_Rank_Problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.next();
        String reversed = "";

        for(int i=text.length() - 1; i>=0; --i){
            reversed = reversed + text.charAt(i);
        }
        System.out.println(reversed);
    }
}
