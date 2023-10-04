import java.util.Scanner;

public class SistemmesinATM {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char kartuAtm;
        double jumlahTabunganAwal, pin, penarikanUamg, penambahanUang, tabunganAkhir;

        System.out.println("Masukkan Kartu");
        String tmp =  sc.nextLine();
        kartuAtm = tmp.charAt(0);
        System.out.println("Masukkan pin atm anda");
        pin = sc.nextDouble();
        System.out.println("Tumlah Tabungan Awal");
        jumlahTabunganAwal = sc.nextDouble();
        System.out.println("Menarik uang");
        penarikanUamg = sc.nextDouble();
        System.out.println("penambahan uang");
        penambahanUang = sc.nextDouble();

        tabunganAkhir = jumlahTabunganAwal - penarikanUamg + penambahanUang;
        System.out.println(tabunganAkhir);

    }

}
