package Praktikum07;

import java.util.Scanner;

public class whileperulangan22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan = 0, total = 0, counter = 0, i = 0;
        double rata;
        System.out.println("Masukkan Bilangan 1-9");
        bilangan = sc.nextInt();

        while (i < 50) {
            if (i % bilangan == 0) {
                total += i;
                counter++;
            }
            i++;
        }
        System.out.println(
                "pada rentang 1-50 terdapat" + counter + "bilangan kelipatan" + bilangan + "total bilangan" + total);
        rata = (double) total / counter;
        System.out.println("rata-rata : " + rata);

    }
}
