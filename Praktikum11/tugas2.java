package Praktikum11;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("masukkan nilai n: ");
            int n = sc.nextInt();
            if (n <= 2) {
                System.out.println("angka kurang dari 2");
                continue;
            }
            if (n % 2 == 0) {
                System.out.println("nilai n tidak ganjil");
                continue;
            }

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == n || i == 1 || j == n || j == 1) {
                        System.out.print(n + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            break;
        }

    }
}
