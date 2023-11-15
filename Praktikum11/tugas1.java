package Praktikum11;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {

            System.out.println("masukkan nilai n ");
            n = sc.nextInt();
            if (n <= 2) {
                System.out.println("nilai n tidak lebih besar dari 2");
                continue;

            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print(k);
                }
                System.out.println();
            }
            break;

        }

    }
}
