package Praktikum06;

import java.util.Scanner;

public class ternarybilangan22 {
    public static void main(String[] args) {
        int bil1, bil2, bil3, bilanganTerbesar;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan Bilangan 1 : ");
        bil1 = sc.nextInt();
        System.out.println("Masukkan Bilangan 2 : ");
        bil2 = sc.nextInt();
        System.out.println("Masukkan Bilangan 3 : ");
        bil3 = sc.nextInt();

        if (bil1 > bil2) {
            bilanganTerbesar = (bil1 > bil3) ? bil1 : bil3;
        }
        else {
            bilanganTerbesar = (bil2>bil3) ?bil2 :bil3;
        }
        bilanganTerbesar = (bil1>bil2) ?((bil1>bil3) ?bil1 :bil3) :((bil2>bil3) ?bil2 :bil3);

        System.out.println("Bilangan terbesar : " + bilanganTerbesar);

    }
}
