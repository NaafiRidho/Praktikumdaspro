package Praktikum11;
import java.util.Scanner;

public class star22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah *: ");
        int n = sc.nextInt();
         
        for(int i=1; i<=n; i++){
            System.out.print("*");
        }
        
    }
}
