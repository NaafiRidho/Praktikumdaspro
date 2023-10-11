package Praktikum06;

import java.util.Scanner;

public class kabisatnested22 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Masukkan tahun");
    int tahun = sc.nextInt();

    if ((tahun %4) == 0){
        if ((tahun % 100) !=0)
        System.out.println("Tahun kabisat");

        else
        System.out.println("Bukan tahun kabinet");
    }
    else 
        System.out.println("Bukan tahun kabisat");
}
}
