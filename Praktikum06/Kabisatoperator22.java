package Praktikum06;
import java.util.Scanner;

public class Kabisatoperator22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tahun, tahunKabisat, bukanKabisat ;

        System.out.println("Masukkan tahun");
        tahun = sc.nextInt();
        
        if ((tahun % 4) == 0){
            System.out.println("Tahun kabisat");
        }else{
            System.out.println("Bukan Tahun kabisat");
        }
    }
}
