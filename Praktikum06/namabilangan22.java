package Praktikum06;

import java.util.Scanner;

public class namabilangan22 {
    public static void main(String[] args) {
        int bilangan1, bilangan2, bilangan3;
        String bilanganTerbesar;
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan bilangan : 1");
        bilangan1 = sc.nextInt();
        System.out.println("masukkan bilangan : 2");
        bilangan2 = sc.nextInt();
        System.out.println("masukkan bilangan : 3");
        bilangan3 = sc.nextInt();

        if (bilangan1 > bilangan2) {
            if (bilangan1 > bilangan3) {
                System.out.println("bilanganTerbesar" + bilangan1);
            } else {
                System.out.println("bilanganTerbesar" + bilangan3);
             }
        }
        else if (bilangan2>bilangan3){
            System.out.println("bilanganTerbesar" + bilangan2);
        }else {
            System.out.println("bilanganTerbesar" + bilangan3);
        }
    }
}
