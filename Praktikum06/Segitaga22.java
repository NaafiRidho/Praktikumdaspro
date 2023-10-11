package Praktikum06;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Segitaga22 {
    public static void main(String[] args) {
        int sudut1, sudut2, sudut3, totalSudut;
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan sudut1");
        sudut1 = sc.nextInt();
        System.out.println("masukkan sudut2");
        sudut2 = sc.nextInt();
        System.out.println("masukkan sudut3");
        sudut3 = sc.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("segitiga tersebut adalah segitiga siku-siku");
            if ((sudut1 == 60) && (sudut2 == 60) && (sudut3 == 60))
                System.out.println("segitiga tersebut adalah segitiga sama sisi");
            if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut1 == sudut3))
                System.out.println("segitiga tersebut adalah segitiga sama kaki");
            else {
                System.out.println("segitiga tersebut adalah segitiga sembarang");
            }

        } else {
            System.out.println("bukan segitiga");
        }
    }
}
