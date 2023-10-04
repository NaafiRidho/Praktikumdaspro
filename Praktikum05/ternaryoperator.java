package Praktikum05;

import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan angka");
        int angka = sc.nextInt();
        String hasil;

        hasil = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";

        System.out.println(hasil);

    }
}
