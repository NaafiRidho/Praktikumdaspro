package Praktikum10;

import java.util.Scanner;

public class bioskopwithscanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        String nama, next, menu, lanjut, nilaiPengganti = "***";
        int baris = 0, kolom = 0;
        while (true) {
            System.out.println("Pilih menu");
            System.out.println("1.input data");
            System.out.println("2.tampilkan data penonton");
            System.out.println("3.Exit");
            menu = sc.nextLine();
            if (menu.equalsIgnoreCase("1")) {
                while (true) {
                    System.out.println("masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.println("masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.println("masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    while (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("kursi yang dipilih sudah terisi oleh" + penonton[baris - 1][kolom - 1]
                                + "pilih kursi lain");
                        System.out.println("masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.println("masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();
                    }
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("apakah akan melakukan input? (y/n)");
                    lanjut = sc.nextLine();
                    if (lanjut.equalsIgnoreCase("n")) {
                        break;

                    }
                }

            } else if (menu.equalsIgnoreCase("2")) {
                for (int i = 0; i <= penonton[i].length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            penonton[i][j] = nilaiPengganti;
                        }

                    }
                    System.out.println("penonton pada baris ke- " + (i + 1) + ": " + String.join(", ", penonton[i]));

                }
            }
            if (menu.equalsIgnoreCase("3")) {
                break;
            }
        }

    }
}
