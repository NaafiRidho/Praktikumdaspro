package Praktikum06;
import java.util.Scanner;

public class gaji22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.println("masukkan kategori");
        kategori = sc.nextLine();
        System.out.println("masukkan penghasilan");
        penghasilan = sc.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")){
            if (penghasilan <= 2000000)
            pajak = 0.1;
            else if (penghasilan <= 3000000)
            pajak = 0.15;
            else
            pajak = 0.2;
            gajiBersih = (int) (penghasilan -(pajak*penghasilan));
            System.out.println("penghasilan bersih : " + gajiBersih);
        }
        else if (kategori.equalsIgnoreCase("pembisnis")){
            if (penghasilan <=2500000)
            pajak= 0.15;
            else if (penghasilan <= 3000000)
            pajak= 0.2;
            else 
            pajak= 0.25;
            gajiBersih = (int) (penghasilan - (pajak*penghasilan));
            System.out.println("penghasilan bersih :" + gajiBersih);

        }
        else 
        System.out.println("kategori tidak valid");
        
    }
}
