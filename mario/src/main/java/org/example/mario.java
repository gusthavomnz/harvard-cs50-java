package org.example;

import java.util.Scanner;

public class mario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Enter a number between 0 and 8 for Mario to jump to");
            n = sc.nextInt();

        }while (n < 0 || n > 8);

            for (int i = 0 ; i < n; i++){
                for (int j = 0; j < n; j++) {
                    if (n - i - 1 > j) {
                        System.out.print(" ");
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.print("\n");
            }

        sc.close();
    }
}
