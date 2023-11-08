import java.util.Scanner;

public class arraynilai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        int jumlah = 0, min = 100, max = 0, lulus = 0, tidakLulus = 0;
        Double rata = 0.0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke- " + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
            jumlah += nilaiAkhir[i];
            rata = (double) jumlah / nilaiAkhir.length;
            if (nilaiAkhir[i] > max) {
                max = nilaiAkhir[i];
            } else if (nilaiAkhir[i] < min) {
                min = nilaiAkhir[i];

            }

        }
        
        for (int i = 0; i < 10; i++) {

            if (nilaiAkhir[i] > 70) {
                System.out.println("Mahasiswa ke-" + (i + 1) + "lulus");
                lulus++;

            } else {
                System.out.println("Mahasiswa ke-" + (i + 1) + "tidak lulus");
                tidakLulus++;
            }

        }

        System.out.println(rata);
        System.out.println("Nilai terbesar : " + max);
        System.out.println("nilai terbecil : " + min);
        System.out.println("jumlah siswa yang lulus :" + lulus);
        System.out.println("jumlah siswa yang tidak lulus : " + tidakLulus);

    }
}
