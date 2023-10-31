package Praktikum07;

import java.util.Scanner;

public class whilegaji22 {
    public static void main(String[] args) {
        int jumlahKaryawan, jumlahJamLembur, i = 0;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan;
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan jumlah karyawan :");
        jumlahKaryawan = sc.nextInt();

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - direktur, manajer, karyawan");
            System.out.print("Masukkan jabatan ke-" + (i + 1) + ": ");
            jabatan = sc.next();
            System.out.print("Masukkan jumlah jam lembur");
            jumlahJamLembur = sc.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("jabatan invalid");
                i--;
                continue;

            }
            totalGajiLembur += gajiLembur;

        }
        System.out.println("Total gaji lembur : " + totalGajiLembur);

    }
}
