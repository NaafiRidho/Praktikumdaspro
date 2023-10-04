package Praktikum05;

import java.util.Scanner;

public class pemilihanoperator {
    public static void main(String[] args) {

        double angka1, angka2, hasil = 0;
        char operator;
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan angka 1");
        angka1 = sc.nextDouble();
        System.out.println("masukkan angka 2");
        angka2 = sc.nextDouble();
        System.out.println("masukkan operator (+-*:)");
        operator = sc.next().charAt(0);

        if (operator == '+') {
            System.out.println(angka1 + angka2);
        } else if (operator == '-') {
            System.out.println(angka1 - angka2);
        } else if (operator == ':') {
            System.out.println(angka1 / angka2);
        } else if (operator == '*') {
            System.out.println(angka1 * angka2);
        } else {
            System.out.println("tidak valid");
        }

        System.out.println(angka1 + "" + operator + "" + angka2 + "" + "=" + hasil);

    }
}
