package Praktikum05;

import java.util.Scanner;

public class pilihanswitch22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double angka1, angka2, hasil = 0;
        char operator;

        System.out.println("masukkan angka 1");
        angka1 = sc.nextDouble();
        System.out.println("masukkan angka 2");
        angka2 = sc.nextDouble();
        System.out.println("masukkan operator (+-*:)");
        operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println(hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println(hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println(hasil);
                break;
            case '/':
                hasil = angka1 / angka2;
                break;
            default:
                System.out.println("belum terdata");
                return;
        }
        System.out.println(angka1 + "" + operator + "" + angka2 + "" + "=" + hasil);
    }

}
