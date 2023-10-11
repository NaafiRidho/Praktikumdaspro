package Praktikum06;

import java.util.Scanner;

public class kabisat22 {
    public static void main(String[] args) {
        int tahun;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan tahun");
        tahun = sc.nextInt();

        if ((tahun % 4) == 0 && (tahun % 100) != 0 || (tahun % 400) == 0) {
            System.out.println("tahun kabisat");
        } else {
            System.out.println("bukan tahun kabisat");
        }
    }
}
