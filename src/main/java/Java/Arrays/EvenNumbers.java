package Java.Arrays;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i += 2) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(array[i]);
        }
    }
}



