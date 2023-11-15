package Praktikum11;

import java.util.Scanner;

public class nestedloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan jumlah kota ");
        int kota = sc.nextInt();
        double[][] suhu = new double[kota][4];
        double rata = 0;

        for (int i = 0; i < suhu.length; i++) {
            System.out.println("kota ke-" + (i + 1));
            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print("suhu ke-" + (j + 1) + ": ");
                suhu[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < suhu.length; i++) {
            double suhuTotal = 0;
            System.out.print("kota ke-" + (i + 1) + ": ");
            for (double tmp : suhu[i]) {
                System.out.print(tmp + " ");
                suhuTotal += tmp;
            }
            System.out.println();
            rata = suhuTotal / suhu[i].length;
            System.out.println("rata-rata suhu kota ke-" + (i + 1) + " " + rata);
        }

    }
}
