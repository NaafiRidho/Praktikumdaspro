package Praktikum07;

import java.util.Scanner;

public class forkelipatan22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, total = 0, counter = 0;
        double rata=0;

        System.out.println("Masukkan Bilangan 1-9");
        bilangan = sc.nextInt();

        for (int i = 0; i < 50; ++i) {
            if (i % bilangan == 0) {
                total += i;
                ++counter;
            }
            rata =(double) total / counter;
        }
        System.out.printf("pada rentang 1-50 terdapat %d bilangan kelipatan %d total bilangan %d", counter, bilangan,
                total);
        System.out.println("");

        System.out.println("rata-rata : " + rata);

    }
}
