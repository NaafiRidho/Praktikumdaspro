package Praktikum11;
import java.util.Scanner;

public class square22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah *:");
        int n = sc.nextInt();
         for(int j = 1; j<=n; j++){
            for(int i =1; i<=n; i++){
                System.out.print("*");
            }
            System.out.println();
         }
        
    }
}
