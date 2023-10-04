import java.util.Scanner;

public class Bank22 {
    public static void main(String[]args){

    double tabunganAwal, tabunganAkhir, bunga, presentaseBunga;
    int lamaMenabung;
    Scanner sc = new Scanner(System.in);

    presentaseBunga = 0.02;
    System.out.print("Masukkan jaumlah tabungan awal: ");
    tabunganAwal = sc.nextDouble();
    System.out.print("Madukkan lama menabung (bulan): ");
    lamaMenabung = sc.nextInt();

    bunga = presentaseBunga * lamaMenabung * tabunganAwal;
    tabunganAkhir = tabunganAwal + bunga;

    System.out.println("Bunga: " + bunga);
    System.out.println("Tabungan akhir: " + tabunganAkhir);
  




}
}