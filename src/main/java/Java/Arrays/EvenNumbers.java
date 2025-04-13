package Java.Arrays;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i<n; i+=2) {
            System.out.println(arr [i] + " ");

        }


    }
}
