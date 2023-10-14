package Praktikum06;

import java.util.Scanner;

public class bilanganmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1, bil2, bil3, max = 0, mid = 0, low = 0;

        System.out.println("Masukkan Bilangan 1 : ");
        bil1 = sc.nextInt();
        System.out.println("Masukkan Bilangan 2 : ");
        bil2 = sc.nextInt();
        System.out.println("Masukkan Bilangan 3 : ");
        bil3 = sc.nextInt();

        if (bil1 > bil2) {
            max = bil1;
            if (bil2 > bil3) {
                mid = bil2;
                low = bil3;
            } else {
                low = bil2;
                mid = bil3;
            }
        } else if (bil2 > bil1) {
            max = bil2;
            if (bil1 > bil3) {
                mid = bil1;
                low = bil3;
            } else {
                mid = bil3;
                low = bil1;
            }
        } else if (bil3 > bil1) {
            max = bil3;
            if (bil1 > bil2) {
                mid = bil1;
                low = bil2;
            } else {
                mid = bil2;
                low = bil1;
            }
        }
        System.out.println("Angka max : " + max);
        System.out.println("Angka Mid : " + mid);
        System.out.println("Angka Low : " + low);

    }
}
