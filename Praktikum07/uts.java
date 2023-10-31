package Praktikum07;

import java.util.Scanner;

public class uts {
    public static void main(String[] args) {
        String tujuan, golongan, jenisKendaraan, tipeKendaraan, konfirmasi;
        int tarif = 0, jumlahGandar, pajak = 0, tarifAkhir = 0;

        Scanner sc = new Scanner(System.in);
        Scanner nc = new Scanner(System.in);

        while (true) {
            System.out.println("masukkan tujuan : ");
            tujuan = sc.nextLine();
            System.out.println("Jenis kendaraan : ");
            jenisKendaraan = sc.nextLine();
            if (tujuan.equalsIgnoreCase("purwodadi")) {
                if (jenisKendaraan.equalsIgnoreCase("truk")) {
                    System.out.println("Jumlah gandar : ");
                    jumlahGandar = sc.nextInt();
                    if (jumlahGandar == 2 || jumlahGandar == 3) {
                        tarifAkhir = 21000;

                    } else if (jumlahGandar == 4 || jumlahGandar == 5) {
                        tarifAkhir = 28000;
                    }
                }
                if (jenisKendaraan.equalsIgnoreCase("mobil") || (jenisKendaraan.equalsIgnoreCase("bus"))) {
                    tarif = 14000;
                    tarifAkhir = 14000;
                }
                if (jenisKendaraan.equalsIgnoreCase("mobil")) {
                    System.out.println("Apakah Kendaraan dinas? (Y/T)");
                    tipeKendaraan = nc.nextLine();
                    if (tipeKendaraan.equalsIgnoreCase("y")) {
                        pajak = tarif * 30 / 100;
                        tarifAkhir = tarif + pajak;
                    } else {
                        tarifAkhir = 14000;
                    }
                }

            }
            if (tujuan.equalsIgnoreCase("lawang")) {
                if (jenisKendaraan.equalsIgnoreCase("truk")) {
                    System.out.println("Jumlah gandar : ");
                    jumlahGandar = sc.nextInt();
                    if (jumlahGandar == 2 || jumlahGandar == 3) {
                        tarifAkhir = 31500;
                    } else if (jumlahGandar == 4 || jumlahGandar == 5) {
                        tarifAkhir = 42500;
                    }
                }
                if (jenisKendaraan.equalsIgnoreCase("mobil") || jenisKendaraan.equalsIgnoreCase("bus")) {
                    tarif = 21000;
                    tarifAkhir = 21000;
                }
                if (jenisKendaraan.equalsIgnoreCase("mobil")) {
                    System.out.println("Apakah Kendaraan dinas? (Y/T)");
                    tipeKendaraan = nc.nextLine();
                    if (tipeKendaraan.equalsIgnoreCase("y")) {
                        pajak = tarif * 30 / 100;
                        tarifAkhir = tarif + pajak;
                    } else {
                        tarifAkhir = 21000;
                    }
                }

            }
            if (jenisKendaraan.equalsIgnoreCase("mobil") || jenisKendaraan.equalsIgnoreCase("bus")
                    || jenisKendaraan.equalsIgnoreCase("truk")) {
            } else {
                System.out.println("maaf, jenis mobil tidak terdaftar");
                continue;
            }

            System.out.println("Tarif : " + tarifAkhir);
            System.out.println("cek tarif kendaraan lainnya? (Y/T)");
            konfirmasi = nc.nextLine();
            if (konfirmasi.equalsIgnoreCase("t")) {
                break;
            }

        }

    }
}
